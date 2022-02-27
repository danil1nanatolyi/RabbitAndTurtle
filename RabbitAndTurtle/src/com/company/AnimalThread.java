package com.company;

public class AnimalThread extends Thread {
    private String nameThread;
    private int priority;

    public AnimalThread(String nameThread, int priority) {
        if (priority < 1 || priority > 10) new Exception("Неправильно указан приоритет потока");
        this.nameThread = nameThread;
        this.priority = priority;
    }

    public void start() {
        Runnable task = new Runnable() {
            public void run() {
                for (int i = 0; i <= 400; i += 100) {
                    System.out.println(nameThread + " - " + i + " метров");
                }
                if (getPriority() == 1) {
                    setPriority(10);
                }
                if (getPriority() == 10) {
                    setPriority(1);
                }
                for (int i = 400; i <= 1000; i += 100) {
                    System.out.println(nameThread + " - " + i + " метров");
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();

    }
}
