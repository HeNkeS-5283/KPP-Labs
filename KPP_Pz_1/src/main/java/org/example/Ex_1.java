package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ex_1 {
    public void start() {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else { System.out.println("Неможлива кількість елементів або не коректні данні!"); return;}

        int[] mass = generateMassive(size);
        System.out.print("Згенерований масив:\n[ ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.print("]");
        System.out.println("\nМаксимальний елмент масиву: " + maxElement(mass));
        System.out.println("Сума елементів масиву, розташованих між першим й другим додатними елементами: " + summaWithFirstAndSecondPositiveElements(mass));
        }
    public int maxElement(int[] mas) {

        if(mas.length == 0) return 0;
        if(mas.length == 1) return mas[0];

        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] > max) max = mas[i];
        }
        return max;
    }

    public int summaWithFirstAndSecondPositiveElements(int[] mas){
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] > 0) {
                for (int j = i+1; j < mas.length; j++) {
                    if(mas[j] > 0) return sum;
                    sum += mas[j];
                }
                return 0;
            }
        }
        return sum;
    }

    public int[] generateMassive(int size){
        Random rand = new Random();
        int[] mas = new int[size];

        for (int i = 0; i < size; i++) {
            int randomNumber = rand.nextInt(201) - 100;
            mas[i] = randomNumber;
        }

        return mas;
    }
}
