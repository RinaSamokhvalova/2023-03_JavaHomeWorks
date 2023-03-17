package HomeWorks.Seminar_3dz;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Random;

// Задача 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

public class Sem03hw_Ex003 {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 9, 10, 5, 4, 6, 7));
        // System.out.println(arr);

        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(10);
            arr.add(x);
        }
        System.out.println(arr);

        int i_min = arr.get(0);
        int i_max = arr.get(0);
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i_min > arr.get(i)) i_min = arr.get(i);
            if (i_max < arr.get(i)) i_max = arr.get(i);
            sum = sum + arr.get(i);
        }
        System.out.println(i_min);
        System.out.println(i_max);
        System.out.println(sum/arr.size());
    }
}
