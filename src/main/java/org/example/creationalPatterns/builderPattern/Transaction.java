package org.example.creationalPatterns.builderPattern;

import java.util.Date;

public class Transaction {

        private String transactionId;
        private double amount;

        @Override
        public String toString() {
                return "Transaction{" +
                        "transactionId='" + transactionId + '\'' +
                        ", amount=" + amount +
                        ", date=" + date +
                        ", fromAccount='" + fromAccount + '\'' +
                        ", toAccount='" + toAccount + '\'' +
                        ", type=" + type +
                        '}';
        }

        private Date date;
        private String fromAccount;

        public String getTransactionId() {
                return transactionId;
        }

        public void setTransactionId(String transactionId) {
                this.transactionId = transactionId;
        }

        public double getAmount() {
                return amount;
        }

        public void setAmount(double amount) {
                this.amount = amount;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }

        public String getFromAccount() {
                return fromAccount;
        }

        public void setFromAccount(String fromAccount) {
                this.fromAccount = fromAccount;
        }

        public String getToAccount() {
                return toAccount;
        }

        public void setToAccount(String toAccount) {
                this.toAccount = toAccount;
        }

        public TransactionType getType() {
                return type;
        }

        public void setType(TransactionType type) {
                this.type = type;
        }

        private String toAccount;
        private TransactionType type;



}
