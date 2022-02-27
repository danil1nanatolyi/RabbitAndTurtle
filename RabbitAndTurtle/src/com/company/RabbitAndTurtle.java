package com.company;

public class RabbitAndTurtle {
    public void startRace() throws InterruptedException {
        AnimalThread rabbit = new AnimalThread("Кролик", 1);
        AnimalThread turtle = new AnimalThread("Черепашка", 10);

        rabbit.start();
        turtle.start();
    }
}

