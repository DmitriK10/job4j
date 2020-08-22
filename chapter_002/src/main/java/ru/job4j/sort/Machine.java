package ru.job4j.sort;

import java.util.Arrays;
/**
 *Class Machine
 *@author DKupriyanyuk
 *@version 1
 *@since 21.08.2020
 */
public class Machine {
    static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size;
        size = 0;
        int ch = 0;
        int change = money - price;
        while (change > 0) {
            for (int i = 0; i <= COINS.length - 1; i++) {
                while (COINS[i] <= change) {
                    size++;
                    change = change - COINS[i];
                    rsl[ch] = COINS[i];
                    ch++;
                }
               }
        }

        return Arrays.copyOf(rsl, size);
    }
}