package com.lxiao.thread.pool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {
    public static void main(String[] args) {
        // 线程数
        int num = 10;
        CountDownLatch downSingle = new CountDownLatch(num);
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i<num; i++) {
            pool.execute(new WorkerRunnable(downSingle, i));
            try {
                downSingle.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("所有任务执行完毕");
    }
}
