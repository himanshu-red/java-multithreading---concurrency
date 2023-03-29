package com.project.multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        Thread1 thread1 = new Thread1("Thread-1");
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("Main thread is finishing");
    }
}