package com.skosarev.lab01;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.OutputUtil;
import com.skosarev.common.interfaces.OddTasksTo10Interface;

public class Lab01 {
    public static class Part1 implements OddTasksTo10Interface {
        public void task1() {
            double number = ConsoleUtil.readDouble();
            System.out.println("Дробная часть = " + fraction(number));
        }

        private double fraction(double x) {
            return x - (int) x;
        }

        public void task3() {
            char c = ConsoleUtil.readChar('0', '9');
            int result = charToNum(c);
            System.out.println("Число = " + result + "; Тип — " + ((Object) result).getClass().getName());
        }

        private int charToNum(char x) {
            return x - '0';
        }

        public void task5() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Число является двузначным: " + is2Digits(num));
        }

        public boolean is2Digits(int x) {
            return String.valueOf(x).length() == 2;
        }

        public void task7() {
            int a, b, num;
            while (true) {
                try {
                    a = ConsoleUtil.readInteger("Введи левую границу: ");
                    b = ConsoleUtil.readInteger("Введи правую границу: ");
                    if (a > b) {
                        throw new IllegalArgumentException("Левая граница должна быть не больше правой.");
                    }

                    num = ConsoleUtil.readInteger("Введи проверяемое число: ");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Число " + num + " входит в диапазон [" + a + ";" + b + "]: " + isInRange(a, b, num));
        }

        private boolean isInRange(int a, int b, int num) {
            return a <= num && num <= b;
        }

        public void task9() {
            int a = ConsoleUtil.readInteger("Введи первое число: ");
            int b = ConsoleUtil.readInteger("Введи второе число: ");
            int c = ConsoleUtil.readInteger("Введи третье число: ");
            System.out.println("Введённые числа равны: " + isEqual(a, b, c));
        }

        private boolean isEqual(int a, int b, int c) {
            return a == b && a == c;
        }
    }

    public static class Part2 implements OddTasksTo10Interface {
        public void task1() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Модуль числа = " + abs(num));
        }

        private int abs(int x) {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        }

        public void task3() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Результат: " + is35(num));
        }

        private boolean is35(int x) {
            if (x % 3 == 0 && x % 5 == 0) {
                return false;
            }
            return x % 3 == 0 || x % 5 == 0;
        }

        public void task5() {
            int x = ConsoleUtil.readInteger();
            int y = ConsoleUtil.readInteger();
            int z = ConsoleUtil.readInteger();
            System.out.println("Наибольшее число: " + max3(x, y, z));

        }

        private int max3(int x, int y, int z) {
            if (x > y && x > z) {
                return x;
            }
            if (y > z) {
                return y;
            } else {
                return z;
            }
        }

        public void task7() {
            int x = ConsoleUtil.readInteger();
            int y = ConsoleUtil.readInteger();
            System.out.println("Результат: " + sum2(x, y));
        }

        private int sum2(int x, int y) {
            int sum = x + y;
            if (10 <= sum && sum <= 20) {
                return 20;
            }
            return sum;
        }

        public void task9() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Результат: " + day(num));
        }

        private String day(int x) {
            return switch (x) {
                case 1 -> "Понедельник";
                case 2 -> "Вторник";
                case 3 -> "Среда";
                case 4 -> "Четверг";
                case 5 -> "Пятница";
                case 6 -> "Суббота";
                case 7 -> "Воскресенье";
                default -> "Это не день недели";
            };
        }
    }

    public static class Part3 implements OddTasksTo10Interface {
        public void task1() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Результат: " + listNums(num));
        }

        private String listNums(int x) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= x; i++) {
                sb.append(i).append(" ");
            }
            return sb.substring(0, sb.length() - 1);
        }

        public void task3() {
            int num = ConsoleUtil.readInteger();
            System.out.println("Результат: " + chet(num));
        }

        private String chet(int x) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= x; i += 2) {
                sb.append(i).append(" ");
            }
            return sb.substring(0, sb.length() - 1);
        }

        public void task5() {
            long num = ConsoleUtil.readLong();
            System.out.println("Результат: " + numLen(num));
        }

        private int numLen(long x) {
            int length = 0;
            do {
                x /= 10;
                length++;
            } while (x != 0);
            return length;
        }

        public void task7() {
            int num = ConsoleUtil.readInteger(0, Integer.MAX_VALUE);
            System.out.println("Результат: ");
            square(num);
        }

        public void square(int x) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public void task9() {
            int num = ConsoleUtil.readInteger(0, Integer.MAX_VALUE);
            System.out.println("Результат: ");
            rightTriangle(num);
        }

        public void rightTriangle(int x) {
            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < x - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static class Part4 implements OddTasksTo10Interface {
        public void task1() {
            int[] arr = ConsoleUtil.readIntArray(Integer.MIN_VALUE, Integer.MAX_VALUE);
            int num = ConsoleUtil.readInteger("Введите искомое число: ");
            System.out.println("Результат: " + findFirst(arr, num));
        }

        public int findFirst(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }

        public void task3() {
            int[] arr = ConsoleUtil.readIntArray(Integer.MIN_VALUE, Integer.MAX_VALUE);
            System.out.println("Максимальное число: " + maxAbs(arr));
        }

        private int maxAbs(int[] arr) {
            int max = 0;
            for (int num : arr) {
                if (Math.abs(num) > max) {
                    max = Math.abs(num);
                }
            }
            return max;
        }

        public void task5() {
            int[] arr = ConsoleUtil.readIntArray("Введите первый массив", Integer.MIN_VALUE, Integer.MAX_VALUE);
            int[] ins = ConsoleUtil.readIntArray("Введите второй массив", Integer.MIN_VALUE, Integer.MAX_VALUE);
            int pos = ConsoleUtil.readInteger("Введите позицию для вставки:", 0, arr.length);

            int[] result = add(arr, ins, pos);
            OutputUtil.printArray(result, "Результат: ");
        }

        private int[] add(int[] arr, int[] ins, int pos) {
            int[] result = new int[arr.length + ins.length];

            for (int i = 0; i < pos; i++) {
                result[i] = arr[i];
            }

            for (int i = 0; i < ins.length; i++) {
                result[pos + i] = ins[i];
            }

            for (int i = pos; i < arr.length; i++) {
                result[ins.length + i] = arr[i];
            }

            return result;
        }

        public void task7() {
            int[] arr = ConsoleUtil.readIntArray();
            OutputUtil.printArray(reverseBack(arr), "Результат:");
        }

        private int[] reverseBack(int[] arr) {
            int[] result = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[arr.length - 1 - i];
            }

            return result;
        }

        public void task9() {
            int[] arr = ConsoleUtil.readIntArray();
            int numToFind = ConsoleUtil.readInteger("Введите искомое число: ");
            OutputUtil.printArray(findAll(arr, numToFind), "Индексы вхождений: ");
        }

        private int[] findAll(int[] arr, int x) {
            int count = 0;
            for (int num : arr) {
                if (num == x) {
                    count++;
                }
            }

            int[] result = new int[count];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    result[index++] = i;
                }
            }

            return result;
        }
    }
}
