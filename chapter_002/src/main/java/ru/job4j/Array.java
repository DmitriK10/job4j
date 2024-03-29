package ru.job4j;

import java.util.Arrays;
/**
 * Java Program to demonstrate how to reverse an array in place.
 */
public class Array {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        reverse(numbers);
    }

    /**
     * reverse the given array in place * @param input
     * @param input массив
     */
    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        // handling null, empty and one element array
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
    }
}