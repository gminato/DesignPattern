package org.example.creationalPatterns.builderPattern;
import java.util.Date;

public interface TransactionBuilder {

        TransferTransactionBuilder setTransactionId(String id);
        TransferTransactionBuilder setAmount(double amount);
        TransferTransactionBuilder setDate(Date date);
        TransferTransactionBuilder setFromAccount(String account);
        TransferTransactionBuilder setToAccount(String account);
        TransferTransactionBuilder setType(TransactionType type);
        // ... Methods for other optional attributes
        Transaction build();

}
