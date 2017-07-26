package com.chen;

public class UserThread extends Thread {
    UserThread() {
        super();
    }

    UserThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("thread started running..");
    }

    public static void main(String[] args) {
        UserThread thread1 = new UserThread("Thread1");
        UserThread thread2 = new UserThread("Thread2");

        System.out.println("Thread 1 initial name and priority");
        System.out.println("name:" + thread1.getName());
        System.out.println("priority:" + thread1.getPriority());

        System.out.println("Thread 2 initial name and priority");
        System.out.println("name:" + thread2.getName());
        System.out.println("priority:" + thread2.getPriority());
        System.out.println("");

        thread1.setPriority(6);
        thread2.setPriority(9);

        System.out.println("Thread 1 initial name and priority");
        System.out.println("name:" + thread1.getName());
        System.out.println("priority:" + thread1.getPriority());

        System.out.println("Thread 2 initial name and priority");
        System.out.println("name:" + thread2.getName());
        System.out.println("priority:" + thread2.getPriority());
        System.out.println("");

        thread1.start();
        thread2.start();

        for(int i=0; i<5; i++)
            System.out.println("main method i value: " + i);
    }
}
