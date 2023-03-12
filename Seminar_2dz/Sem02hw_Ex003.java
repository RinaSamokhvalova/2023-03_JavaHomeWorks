package HomeWorks.Seminar_2dz;

import java.io.FileWriter;

// Задача 3. Реализовать простой калькулятор (+ - / *)
// Задача 3*(дополнительно). К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

import java.util.Scanner;

public class Sem02hw_Ex003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое целое число: ");
        double numberA = iScanner.nextInt();
        System.out.printf("Введите второе целое число: ");
        double numberB = iScanner.nextInt();
        System.out.printf("Введите символ арифметической операции (*, /, +, -): ");
        String operation = iScanner.next();
        iScanner.close();
        System.out.printf("%.0f %s %.0f = ", numberA, operation, numberB);

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
        try {
            FileWriter fw = new FileWriter("file02hw-03_log.txt", true);
            fw.append(numberA + " " + operation + " " + numberB + " = " + res + "\n");
            fw.append(String.format("%.0f %s %.0f = %.3f\n", numberA, operation, numberB, res));
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}