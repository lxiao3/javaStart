package com.lxiao.thread.pool;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class MapExample {
    private static int threadNum = 200;
    private static int clientNum = 5000;
    private static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadNum);

        for (int index = 0; index < clientNum; index++) {
            final int threadNum = index;
            executorService.execute(() -> {
                try {
                    // 这个地方出现问题原因很简单，200个线程可以同时获得锁，执行func操作，而func操作不是一个原子操作，所以会出现问题
                    semaphore.acquire();
                    func(threadNum);
                    semaphore.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        System.out.println(map.size());
    }

    public static void func(int threadNum) {
        map.put(threadNum, threadNum);
    }
}
