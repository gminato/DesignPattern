package org.example.creationalPatterns.factoryMethod;

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
