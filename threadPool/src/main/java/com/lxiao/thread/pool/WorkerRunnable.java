package com.lxiao.thread.pool;

import java.util.concurrent.CountDownLatch;

public class WorkerRunnable implements Runnable{
    private final CountDownLatch downSingle;

    private final int i;

    public WorkerRunnable(CountDownLatch doneSignal, int i) {
        downSingle = doneSignal;
        this.i = i;
    }

    public void run() {
        try {
            doWork(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

        downSingle.countDown();
    }

    void doWork(int i) {
        System.out.println("这是第"+(i+1)+"个任务");
    }

}
