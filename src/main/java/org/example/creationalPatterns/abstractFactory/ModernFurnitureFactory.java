package org.example.creationalPatterns.abstractFactory;

public class ModernFurnitureFactory implements  FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
