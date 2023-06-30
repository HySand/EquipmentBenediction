package com.xiaohunao.equipmentbenediction.data.dao;

import java.util.UUID;

public class Modifier {
    private final String name;
    private final double amount;
    private final int operation;
    private final UUID uuid;

    public Modifier(String name, double amount, int operation, String uuid) {
        this.name = name;
        this.amount = amount;
        this.operation = operation;
        this.uuid = UUID.fromString(uuid);
    }

    public UUID getUUID() {
        return uuid;
    }

    public int getOperation() {
        return operation;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Modifier{" +
                "name='" + getName() + '\'' +
                ", amount=" + getAmount() +
                ", operation=" + getOperation() +
                ", uuid=" + getUUID() +
                '}';
    }
}