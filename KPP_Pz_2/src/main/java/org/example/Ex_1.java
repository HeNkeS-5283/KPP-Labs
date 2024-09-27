package org.example;

import java.util.Scanner;

public class Ex_1 {
    public void start() {
        int size = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else { System.out.println("Неможлива кількість елементів або не коректні данні!"); return;}

        int[] mas = new int[size];

        System.out.println("Задайте елементи масиву (цілі числа):");
        for (int i = 0; i < size; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                while (true) {
                    if (scanner.hasNextInt()) {
                        mas[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Невірне значення! Введіть ціле число:");
                        scanner.next();
                    }
            }
        }
        System.out.print("Згенерований масив:\n[ ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]+" ");
        }
        System.out.println("]");

        System.out.println("Мінімальне число:" + minElement(mas));
        System.out.println("Максимальне число:" + maxElement(mas));
        System.out.println("Середнє арефметичне максимального і мінімального чисел:" + arithmeticMean(mas));
    }

    public float arithmeticMean(int[] mas) {
        int min = minElement(mas);
        int max = maxElement(mas);

        return ((float) min + (float) max)/2;
    }

    public int maxElement(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] > max) max = mas[i];
        }
        return max;
    }
    public int minElement(int[] mas) {
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] < min) min = mas[i];
        }
        return min;
    }
}
