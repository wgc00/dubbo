package com.wgc.dubbo;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author: Earle
 * @createdDate: 2019-10-11
 * @updatedDate:
 */
public class ZooKeeperLeader implements Watcher {

    /**
     * JDK 5+里面闭锁的一个实现，允许一个或者多个线程等待某个事件的发生
     * CountDownLatch有一个正数计数器，
     * countDown()方法对计数器做减操作，
     * await()方法等待计数器达到0。
     * 所有await的线程都会阻塞直到计数器为0或者等待线程中断或者超时。
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /**
     *  zookeeper 对象
     * */
    private static ZooKeeper zk = null;

    /**
     * zookeeper 的数据状态
     */
    private static Stat stat = new Stat();


    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {

        String path = "/username";

        /**
         * 创建一个 zookeeper
         * */
        zk = new ZooKeeper("127.0.0.1:2181", 5000, new ZooKeeperLeader());

        // 获取数据
        byte[] data = zk.getData(path, true, stat);

        System.out.println(new String(data));

        Thread.sleep(Integer.MAX_VALUE);
    }

    @Override
    public void process(WatchedEvent event) {
        if (Event.KeeperState.SyncConnected == event.getState()) {
            if (Event.EventType.None == event.getType() && null == event.getPath()) {
                countDownLatch.countDown();
                // 通过 zookeeper 的监听通知机制获取到数据的变化
            } else if (event.getType() == Event.EventType.NodeDataChanged) {
                try {
                    // 在去获取数据
                    byte[] data = zk.getData(event.getPath(), true, stat);
                    System.out.println("配置已经修改，新值为：" + new String(data));
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}

