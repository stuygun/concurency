package com.tuygun.sandbox.concurency;

import static com.tuygun.sandbox.concurency.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from runnable.");
    }
}
