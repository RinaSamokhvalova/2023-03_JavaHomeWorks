package HomeWorks.Seminar_1dz;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)
// 
// 
// Ввод:5
// Выход:
// Треугольное число: 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class Sem01hw_Ex001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите натуральное число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        int pos = 1;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            pos = pos * i;
        }
        System.out.printf("Треугольное число: %d\n", sum);
        System.out.printf("Факториал: %d\n", pos);
    }
}