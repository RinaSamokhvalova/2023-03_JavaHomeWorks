package HomeWorks.Seminar_4dz;

import java.util.LinkedList;
import java.util.Scanner;

// Задание 3. В калькулятор добавьте возможность отменить последнюю операцию.

public class Sem04hw_Ex003 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        System.out.println("!!! Для выхода из программы введите Exit.\n!!! Для отмены последней операции ведите Cancel.");             

        Scanner iScanner = new Scanner(System.in); // ', "Cp886" ' - чтобы воспринимались русские буквы, но не всегда!!
        System.out.println("Введите число: ");
        LinkedList<String> listLink = new LinkedList<>();
        String text = iScanner.nextLine();
        
        while (!text.equals("Exit")) {
            if (text.contains("Cancel")){
                if (listLink.size() < 2) {
                    System.out.println("Отмена невозможна, введите символ операции и число через пробел:");
                    text = iScanner.nextLine();
                } else {
                    listLink.pollLast();
                    listLink.pollLast();
                }
            } else {
                if (listLink.isEmpty()){
                    listLink.add("#" + text);
                } else {
                    double numberA = Double.parseDouble(listLink.peekLast().substring(1));
                    listLink.add(text);
                    String operation = text.substring(0, 1);
                    double numberB = Double.parseDouble(text.substring(2));
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
                    System.out.printf("%f %s %f = %f", numberA, operation, numberB, res);
                    listLink.add("#" + res);
                }
            }
            System.out.println(listLink.toString());
            System.out.println("Введите символ операции (*, /, +, -) и число через пробел:");
            text = iScanner.nextLine();
        }
        iScanner.close();
    }
}
