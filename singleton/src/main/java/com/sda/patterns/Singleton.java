package com.sda.patterns;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Tworzę instancję");
        }
        return instance;
    }

}
