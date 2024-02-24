package org.example.creationalPatterns.factoryMethod;

public class Bicycle implements Vehicle{

    @Override
    public void move() {
        System.out.println("Bicycle in moving");
    }
}
