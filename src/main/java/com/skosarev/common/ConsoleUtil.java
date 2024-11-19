package com.skosarev.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUtil {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static final String ENTER_INT_DEFAULT_MESSAGE = "Введи целое число: ";

    private ConsoleUtil() {
    }

    public static double readDouble() {
        while (true) {
            try {
                System.out.print("Введи вещественное число: ");
                return Double.parseDouble(readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введено некорретное число.");
            }
        }
    }

    public static int readInteger() {
        return readInteger(ENTER_INT_DEFAULT_MESSAGE);
    }

    public static int readInteger(int min, int max) {
        return readInteger(ENTER_INT_DEFAULT_MESSAGE, min, max);
    }

    public static int readInteger(String message) {
        return readInteger(message, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int readInteger(String message, int min, int max) {
        while (true) {
            try {
                System.out.print(message);
                int num = Integer.parseInt(readLine());

                if (num > max || num < min) {
                    throw new IllegalArgumentException("Введённое число выходит за промежуток [" + min + ";" + max + "]");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Введено некорретное число.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static long readLong(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Long.parseLong(readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введено некорретное число.");
            }
        }
    }

    public static long readLong() {
        return readLong("Введите целое число (8 байт): ");
    }

    public static char readChar() {
        return readChar(Character.MIN_VALUE, Character.MAX_VALUE);
    }

    public static char readChar(char min, char max) {
        while (true) {
            try {
                if (min != Character.MIN_VALUE && max != Character.MAX_VALUE) {
                    System.out.print("Введи символ от " + min + " до " + max + ": ");
                } else {
                    System.out.print("Введи символ: ");
                }

                char c = readSingleChar();
                if (min <= c && c <= max) {
                    return c;
                } else {
                    throw new IllegalArgumentException("Символ должен быть между " + min + " и " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некорретное число.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String readLine() {
        while (true) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                System.out.println("Ошибка ввода.");
            }
        }
    }

    private static char readSingleChar() throws IllegalArgumentException {
        String str = readLine();
        if (str.length() != 1) {
            throw new IllegalArgumentException("Необходимо ввести лишь один символ.");
        }

        return str.charAt(0);
    }


    public static int[] readIntArray() {
        return readIntArray("Введите массив!", Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int[] readIntArray(int elementMin, int elementMax) {
        return readIntArray("Введите массив!", elementMin, elementMax);
    }

    public static int[] readIntArray(String message, int elementMin, int elementMax) {
        System.out.println(message);
        int size = readInteger("Введите размер массива: ");
        return readIntArrayElements(size, elementMin, elementMax);
    }

    private static int[] readIntArrayElements(int size, int elementMin, int elementMax) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = readInteger("Введите %d элемент массива: ".formatted(i), elementMin, elementMax);
        }
        return arr;
    }
}
