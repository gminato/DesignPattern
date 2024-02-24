package org.example;

import org.example.creationalPatterns.abstractFactory.Chair;
import org.example.creationalPatterns.abstractFactory.CoffeeTable;
import org.example.creationalPatterns.abstractFactory.ModernFurnitureFactory;
import org.example.creationalPatterns.builderPattern.Transaction;
import org.example.creationalPatterns.builderPattern.TransactionBuilder;
import org.example.creationalPatterns.builderPattern.TransactionType;
import org.example.creationalPatterns.builderPattern.TransferTransactionBuilder;
import org.example.creationalPatterns.factoryMethod.Vehicle;
import org.example.creationalPatterns.factoryMethod.VehicleFactory;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        //creational patterns
//            factory patterns
//        VehicleFactory vf = new VehicleFactory();
//        Vehicle car = vf.createVehicle("Car");
//        car.move();
//        Vehicle bicyle = vf.createVehicle("bicycle");
//        bicyle.move();
//            //abstract factory pattern
//        ModernFurnitureFactory mff = new ModernFurnitureFactory();
//        Chair chair = mff.createChair();
//        CoffeeTable coffeeTable = mff.createCoffeeTable();
//        chair.doSit();
//        coffeeTable.placeItem();
            //builder pattern
        TransactionBuilder transactionBuilder = new TransferTransactionBuilder();
        transactionBuilder.setTransactionId("12345")
                .setAmount(500.00)
                .setDate(new Date(34))
                .setFromAccount("savings")
                .setToAccount("checking")
                .setType(TransactionType.TRANSFER)
                .setToAccount("Harshit");

        Transaction transfer = transactionBuilder.build();
        System.out.println(transfer.toString());
    }
}