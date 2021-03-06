package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (balance >= COINS[i]) {
                balance = balance - COINS[i];
                rsl[size] = COINS[i];
                size++;
                if (balance <= 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
