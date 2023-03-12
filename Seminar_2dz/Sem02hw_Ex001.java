package HomeWorks.Seminar_2dz;

import java.io.FileWriter;
import java.util.Arrays;

// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.

public class Sem02hw_Ex001 {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 7, 2, 3, 10, 4, 1, 5, 8, 6,  9, 11};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(arr) + "\n");
        
        boolean isSorted = true;
        int temp = 0;
        int count = 0;
        while(isSorted) {
            isSorted = false;
            for (int i = 0; i < arr.length-1-count; i++) {
                if (arr[i] > arr [i+1]) {
                    isSorted = true;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            count++;
            sb.append(Arrays.toString(arr) + "\n");
        }

        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(arr));

        try {
            FileWriter fw = new FileWriter("file02hw-01_log.txt");
            fw.append(sb.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}


// Решение без лога
/*
 public class Sem02hw_Ex001 {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 7, 2, 3, 10, 4, 1, 5, 8, 6,  9, 11};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        boolean isSorted = true;
        int temp = 0;
        int count = 0;
        while(isSorted) {
            isSorted = false;
            for (int i = 0; i < arr.length-1-count; i++) {
                if (arr[i] > arr [i+1]) {
                    isSorted = true;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            count++;
        }

        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(arr));
    }
}
*/