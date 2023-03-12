package HomeWorks.Seminar_1dz;

// Задача 2. Вывести все простые числа от 1 до 1000

public class Sem01hw_Ex002 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            boolean flag = true;
            int j = 2;
            while (j < i && flag == true) {
                if (i % j == 0) flag = false;
                j++;
            }
            if (flag == true) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
    
}