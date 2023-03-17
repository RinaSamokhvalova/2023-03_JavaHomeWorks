package HomeWorks.Seminar_3dz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Sem03hw_Ex002 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        double number = iScanner.nextInt();
        iScanner.close();
        
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int x = rand.nextInt(100);
            arr.add(x);
        }
        System.out.println(arr);

        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else i++;
        }
        System.out.println(arr);
    }
}
