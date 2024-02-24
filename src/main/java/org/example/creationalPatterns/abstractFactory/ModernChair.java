package org.example.creationalPatterns.abstractFactory;

public class ModernChair implements Chair{
    @Override
    public void doSit() {
        System.out.println("Sitting in modern chair");
    }
}
