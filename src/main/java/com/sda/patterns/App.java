package com.sda.patterns;

/**
 * Hello world!
 */
public class App {

    static class Task1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }

    public static void main(String[] args) {


        Thread thread1 = new Thread(new Task1());
        thread1.start();

        Thread thread2 = new Thread(new Task2());
        thread2.start();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);

    }
}
