package com.learning.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 */
public class ExecutorServiceEx {

    public static void main(String[] args) {
        ExecutorServiceEx ex = new ExecutorServiceEx();
        ex.poolExample();

    }

    private void poolExample() {
       ExecutorService executor = Executors.newFixedThreadPool(2);

       for (int i=0;i<5;i++) {
           executor.execute(new Processor(i));
       }
        executor.shutdown();
    }
}


class Processor implements Runnable {

    private int id;

    Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting : " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println("Ending : " + id);
    }
}