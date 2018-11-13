package com.demo.proteintracker;

public class HistoryItem {
    private int id;
    private final String operation;
    private final int total;
    private final int amount;

    public HistoryItem(int id,  int total, String operation, int amount) {
        this.id = id;
        this.operation = operation;
        this.total = total;
        this.amount = amount;
    }

    public String getOperation() {
        return operation;
    }

    public int getTotal() {
        return total;
    }

    public int getAmount() {
        return amount;
    }
}
