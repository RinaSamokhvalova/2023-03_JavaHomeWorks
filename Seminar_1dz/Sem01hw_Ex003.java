package HomeWorks.Seminar_1dz;

// Задача 3. Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class Sem01hw_Ex003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое целое число: ");
        int numberA = iScanner.nextInt();
        System.out.printf("Введите второе целое число: ");
        int numberB = iScanner.nextInt();
        System.out.printf("Введите символ арифметической операции (*, /, +, -): ");
        String operation = iScanner.next();
        iScanner.close();
        System.out.printf("%d %s %d = ", numberA, operation, numberB);

        double res = 0;
        if (operation.equals("*")) {
            res = numberA * numberB;
        } else if (operation.equals("/")) {
            res = numberA / numberB;
        } else if (operation.equals("+")) {
            res = numberA + numberB;
        } else if (operation.equals("-")) {
            res = numberA - numberB;
        }
        System.out.println(res);
    }
}




