package HomeWorks.Seminar_4dz;

import java.util.LinkedList;
import java.util.Scanner;

// Задание 2. Реализуйте очередь с помощью LinkedList со следующими методами:
//      enqueue() - помещает элемент в конец очереди, 
//      dequeue() - возвращает первый элемент из очереди и удаляет его, 
//      first() - возвращает первый элемент из очереди, не удаляя.

public class Sem04hw_Ex002 {
    public static void main(String[] args) {

        LinkedList<String> listLinked = new LinkedList<>();
        listLinked = creating_array();
        System.out.println("Исходный список:");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }

        String text = "new";

        enqueue(listLinked, text);
        System.out.println("\nПолученный список:");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }

        System.out.println("\nПервый элемент:");   
        System.out.print(dequeue(listLinked)); 
        System.out.println("\nПолученный список:");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }

        System.out.println("\nПервый элемент:");   
        System.out.print(first(listLinked)); 
        System.out.println("\nПолученный список:");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }

    }

    static LinkedList<String> creating_array(){
        Scanner iScanner = new Scanner(System.in); // ', "Cp886" ' - чтобы воспринимались русские буквы, но не всегда!!
        System.out.println("Введите элементы списка через запятую: ");      
        String text = iScanner.nextLine();
        iScanner.close();
        String[] str = text.split(",");
        LinkedList<String> list = new LinkedList<>();
        for (String el : str) {
            list.addLast(el);
        }
        return list;
    }

    static LinkedList<String> enqueue(LinkedList<String> list, String item){
        list.addLast(item);
        return list;
    }
    
    static String dequeue(LinkedList<String> list){
        if (list.size()>0) {
            return list.pollFirst();
        }
        return null;
    }

    static String first(LinkedList<String> list){
        if (list.size()>0) {
            return list.peekFirst();
        }
        return null;
    }
}
