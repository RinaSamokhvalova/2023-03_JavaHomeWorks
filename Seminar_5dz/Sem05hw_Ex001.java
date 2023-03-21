package HomeWorks.Seminar_5dz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Задание 1.  Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции: 	1) Добавление номера,
                    2) Вывод всего.
Пример:
К: 	Введите 1) Добавление номера
            2) Вывод всего 
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 	1) Добавление номера
2) Вывод всего 
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 	1) Добавление номера
2) Вывод всего 
Я: 2
Иванов: 1242353, 547568
*/

public class Sem05hw_Ex001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // ', "Cp886" ' - чтобы воспринимались русские буквы, но не всегда!!
        
        System.out.print("\033[H\033[J");
        System.out.println("     !!! Телефонная книга!!!\n");
        System.out.println("Выберите режим работы:\n1) Добавление номера,\n2) Вывод всего.\n");                  
        String workingMode = iScanner.nextLine().trim();

        Map <String, String> phoneBook = new HashMap<>();

        while (!workingMode.equals("2")) {
            if (workingMode.equals("1")){
                System.out.print("\033[H\033[J");
                System.out.println("Введите фамилию: ");
                String name = iScanner.nextLine().trim();
                System.out.println("Введите номер: ");
                String phone = iScanner.nextLine().trim();

                if(phoneBook.containsKey(name)) {
                    phone = phoneBook.get(name) + ", " + phone;
                    phoneBook.put(name, phone);
                } else {
                    phoneBook.put(name, phone);
                }
            } 
            System.out.print("\033[H\033[J");
            System.out.println("     !!! Телефонная книга!!!\n");
            System.out.println("Выберите режим работы:\n1) Добавление номера,\n2) Вывод всего.\n");                  
            workingMode = iScanner.nextLine().trim();
        }
        iScanner.close();
        System.out.print("\033[H\033[J");
        System.out.println("     !!! Телефонная книга!!!\n");
        if (phoneBook.isEmpty()) {
            System.out.println("Пуста!! :(");   
        } else {
            phoneBook.forEach((k, v) -> System.out.println(k + " - " + v));
        }   
    }
}
