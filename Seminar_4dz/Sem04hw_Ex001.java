package HomeWorks.Seminar_4dz;
// Задание 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Scanner;

public class Sem04hw_Ex001 {
    public static void main(String[] args) {

        LinkedList<String> listLinked = new LinkedList<>();
        listLinked = creating_array();
        System.out.println("Исходный список: ");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }
        listLinked = reverse_array(listLinked);
        System.out.println();   
        System.out.println("Перевернутый список: ");   
        for (String el : listLinked) {
            System.out.print(el + " ");
        }
        System.out.println();   
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

    static LinkedList<String> reverse_array(LinkedList<String> list){
        LinkedList<String> listReverse = new LinkedList<>();
        while(!list.isEmpty()){
            listReverse.addLast(list.pollLast());
        }
        return listReverse;
    }
}
