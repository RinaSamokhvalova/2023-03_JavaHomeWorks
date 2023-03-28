package HomeWorks.Seminar_6dz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sem06hw {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Set<Laptop> laptops = databaseСreation();
        System.out.printf("Добрый день! В базе представлено %d ноутбуков.\n1) Вывести на экран\n2) Уточнить выборку\n", laptops.size());
        Scanner iScanner = new Scanner(System.in); // ', "Cp886" ' - чтобы воспринимались русские буквы, но не всегда!
            int userChoise = iScanner.nextInt();
        
            if (userChoise == 1) {
                System.out.println(laptops.toString());
            } else {
                System.out.printf("Какие параметры вы хотите видеть у своего ноутбука?\n1. Производитель\n2. Цена\nВведите номер пункта меню\n");
                int userChoise2 = iScanner.nextInt();
                switch (userChoise2) {
                    case 1:
                        System.out.printf("Введите производителя (в наличии):\n 1) Apple\n 2) Lenovo\n 3) ASUS\n 4) HUAWEI\n 5) MSI\n 6)HP\n");
                        String userChoise3 = iScanner.next();
                        System.out.println(databaseSorteBrand(laptops, userChoise3).toString());
                        break;
                    case 2:
                        System.out.println("Введите MIN цены:");
                        int userChoise4 = iScanner.nextInt();
                        System.out.println("Введите MAX цены:");
                        int userChoise5 = iScanner.nextInt();

                        System.out.println(databaseSortePrice(laptops, userChoise4, userChoise5).toString());
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }
            } 

        iScanner.close();
    }

    static Set<Laptop> databaseSorteBrand(Set<Laptop> db, String brand) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : db) {
            if (laptop.getBrand().equals(brand)){
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> databaseSortePrice(Set<Laptop> db, int min, int max) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : db) {
            if (laptop.getPrice() >= min && laptop.getPrice() <= max){
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> databaseСreation() {
        Set<Laptop> set = new HashSet<>();

        Laptop laptop1 = new Laptop("Apple", "MacBook Pro 14 2023", "Silver", "14", "Apple graphics 16-core", "Apple M2 Pro", 16, 1000, "macOS", true,	175_000);
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro 16 2023", "Silver", "16", "Apple graphics 38-core", "Apple M2 Max", 16, 4000, "macOS", true, 220_000);
        Laptop laptop3 = new Laptop("Apple", "MacBook Pro 16 2023", "Pink", "16", "Apple graphics 38-core", "Apple M2 Max", 16, 4000, "macOS", true, 220_000);
        Laptop laptop4 = new Laptop("Lenovo", "IdeaPad 315ADA6", "Grey", "15.6", "AMD Radeon Vega 10", "AMD Ryzen 7", 8, 512, "none", true, 79_000);
        Laptop laptop5 = new Laptop("Lenovo", "IdeaPad 5 Pro", "Grey", "14", "Intel Iris Xe Graphics", "Intel Core i5", 16, 1000, "Windows 11", true, 56000);
        Laptop laptop6 = new Laptop("Lenovo", "IdeaPad Gaming 3 Gen 6", "Black", "15.6", "NVIDIA GeForce RTX 3050", "Intel Core i9", 64, 512, "Windows 10", true, 134_500);
        Laptop laptop7 = new Laptop("ASUS", "Vivobook Pro 15", "Black", "15.6", "NVIDIA GeForce RTX 3040", "AMD Ryzen 7", 16, 2000, "DOS", true, 110_500);
        Laptop laptop8 = new Laptop("ASUS", "X515JA-BQ2024W", "Black", "17", "Intel UHD Graphics", "Intel Core i3", 8, 256, "Linux", true, 36500);
        Laptop laptop9 = new Laptop("HUAWEI", "MateBook D 15", "Silver", "15.6", "Intel Iris Xe Graphics", "Intel Core i5", 16, 512, "Windows 11", true, 75000);
        Laptop laptop10 = new Laptop("HUAWEI", "MateBook D 16", "White", "16", "NVIDIA GeForce RTX 2080", "Intel Core i9", 32, 1000, "Windows 10", true, 99000);
        Laptop laptop11 = new Laptop("HUAWEI", "MateBook X Pro", "Black", "14.2", "Intel Iris Xe Graphics", "Intel Core i7", 8, 512, "Windows 11", true, 65000);
        Laptop laptop12 = new Laptop("MSI", "Modern", "Black", "14", "AMD Radeon Vega 7", "AMD Ryzen 5", 16, 512, "none", true, 47000);
        Laptop laptop13 = new Laptop("MSI", "Bravo", "Black", "15.6", "AMD Radeon RX 5500M", "AMD Ryzen 5", 8, 512, "none", true, 64300);
        Laptop laptop14 = new Laptop("MSI", "Pulse", "Grey", "17.3", "NVIDIA GeForce RTX 3050 Ti", "Intel Core i7", 8, 1000, "Windows 10", true, 117000);
        Laptop laptop15 = new Laptop("HP", "ProBook", "Silver", "15.6", "Intel Iris Xe Graphics", "Intel Core i7", 16, 512, "none", true, 69700);
        Laptop laptop16 = new Laptop("HP", "ProBook", "Black", "15.6", "AMD Radeon Vega 7", "AMD Ryzen 5", 16, 512, "Windows 11", true, 35600);
        
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
        set.add(laptop6);
        set.add(laptop7);
        set.add(laptop8);
        set.add(laptop9);
        set.add(laptop10);
        set.add(laptop11);
        set.add(laptop12);
        set.add(laptop13);
        set.add(laptop14);
        set.add(laptop15);
        set.add(laptop16);

        return set;
    }
}
