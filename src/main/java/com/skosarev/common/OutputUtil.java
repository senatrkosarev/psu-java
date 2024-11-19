package com.skosarev.common;

public class OutputUtil {
    private OutputUtil() {}

    public static void printArray(int[] arr, String message) {
        if (message != null && !message.isBlank()) {
            System.out.println(message);
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void printArray(int[] arr) {
        printArray(arr);
    }
}
