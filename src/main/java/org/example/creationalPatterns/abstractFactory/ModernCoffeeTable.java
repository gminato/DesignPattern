package org.example.creationalPatterns.abstractFactory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void placeItem() {
        System.out.println("items in modern coffee table");
    }
}
