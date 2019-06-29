package com.tuygun.sandbox.concurency;

import java.io.IOException;

import static com.tuygun.sandbox.concurency.ThreadColor.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(ANSI_PURPLE + "Hello from main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("===Another Thread===");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from anonymous thread.")).start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous runnable.");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello from main thread again.");

    }
}
