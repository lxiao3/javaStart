package com.lxiao.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


public class CountExample {
    private static int threadNum = 200;
    private static int clientNum = 5000;
    private static long count = 0L;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadNum);
        for (int index = 0; index < clientNum; index++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println(count);
    }

    public static void add() {
        count++;
    }
}
