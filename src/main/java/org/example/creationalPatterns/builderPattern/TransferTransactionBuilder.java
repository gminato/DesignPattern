package org.example.creationalPatterns.builderPattern;

import java.util.Date;

public class TransferTransactionBuilder implements TransactionBuilder{

    private  Transaction transaction = new Transaction();
    @Override
    public TransferTransactionBuilder setTransactionId(String id) {
        transaction.setTransactionId(id);
        return this;
    }

    @Override
    public TransferTransactionBuilder setAmount(double amount) {
        transaction.setAmount(amount);
        return this;
    }

    @Override
    public TransferTransactionBuilder setDate(Date date) {
        transaction.setDate(date);
        return this;
    }

    @Override
    public TransferTransactionBuilder setFromAccount(String account) {
        transaction.setFromAccount(account);
        return this;
    }

    @Override
    public TransferTransactionBuilder setToAccount(String account) {
        transaction.setFromAccount(account);
        return this;
    }

    @Override
    public TransferTransactionBuilder setType(TransactionType type) {
        transaction.setType(type);
        return  this;
    }

    @Override
    public Transaction build() {
        return transaction;
    }
}
