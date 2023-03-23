package HomeWorks.Seminar_5dz;
/* Задание 2.  Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности Имени.
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sem05hw_Ex002 {
    public static void main(String[] args) {
        String stroka = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " 
                        + "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, "
                        + "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, "
                        + "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        
        // Разбиваем строку на список и избавляемся от фамилий 
        String[] str  = stroka.split(", ");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].substring(0, str[i].indexOf(" "));
        }
        // Составляем словарь с количеством повторений
        Map<String, Integer> db = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (!db.containsKey(str[i])){
                db.put(str[i], 1);
            } else db.put(str[i], db.get(str[i]) + 1);
        }
        System.out.println(db);

        // Составляем словарь имен с сортировкой по количеству повторений
        TreeMap<Integer, String> sortdb = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> item: db.entrySet()) {
            if (!sortdb.containsKey(item.getValue())) {
                sortdb.put(item.getValue(), item.getKey());
            } else sortdb.put(item.getValue(), sortdb.get(item.getValue()) + ", " + item.getKey());
        }
        for (Map.Entry<Integer, String> item: sortdb.entrySet()) {
            System.out.printf("%s - %d раз(а)\n", item.getValue(), item.getKey());
        }
    }
}
