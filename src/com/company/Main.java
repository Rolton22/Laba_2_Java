package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }


    /**
     * 27)
     * В целочисленной последовательности есть нулевые элементы.
     * Создать массив из номеров этих элементов.
     */

    private static void task1() {
        int[] arr = {0, 4, 6, 7, 0, 6, 0};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        int[] res = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                res[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    /**
     * 52)
     * Определить количество элементов последовательности натуральных чисел
     * в промежутке от L до N, кратных числу М
     */

    private static void task2() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(46) + 1;
        }
        int L = 0, N = 5, M = 5;
        int count = 0;
        for (int i = L; i <= N; i++) {
            if (arr[i] % M == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    /**
     * 77)
     * Дана непустая последовательность целых чисел, оканчивающаяся числом –1.
     * Определить, есть ли в последовательности хотя бы одно число, кратное 7.
     * В случае положительного ответа определить порядковый номер первого из таких чисел.
     */

    private static void task3() {
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(58) + 1;
        }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * 102)
     * Удалить элемент одномерного массива целых чисел, который не делится на 6.
     * Если таких элементов нет, выдать сообщение «элементы для удаления не найдены»,
     * иначе удалить первый из найденных.
     */

    private static void task4() {
        int arr[] = new int[18];
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(39) + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 6 == 0) {
                count = i;
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("Элементы для удаления не найдены.");
                flag = false;
            }
        }
        if (flag) {
            for (int i = count; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 127)
     * В последовательности вещественных чисел а1, а2, ..., an есть только положительные и отрицательные элементы.
     * Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
     * Сравнить модуль Р2 с модулем P1, указать, какое из произведений по модулю больше.
     */

    private static void task5() {
        final int n = 10;
        final int u = random.nextInt(n);
        System.out.println(u);
        int p1 = 1, p2 = 1;
        int[] arr = new int[n];

        for (int i = 0; i < u; i++) {
            arr[i] = random.nextInt(74) + 1;
            p1 *= arr[i];
        }
        for (int i = u; i < arr.length; i++) {
            arr[i] = (random.nextInt(74) + 1) * (-1);
            p2 *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        if (p1 > Math.abs(p2)) {
            System.out.println("p1 > p2");
        } else if (p1 < Math.abs(p2)) {
            System.out.println("p1 < p2");
        } else {
            System.out.println("p1 = p2");
        }
    }
}
