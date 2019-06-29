package com.tuygun.sandbox.concurency;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up " + currentThread().getName());
        }

        System.out.println(ThreadColor.ANSI_BLUE + "3 secs passed!");
    }
}
