package HomeWorks.Seminar_2dz;
/*
 * Задача 2. Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class Sem02hw_Ex002 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("file02hw-02.txt"));
        
        String str;
        String[] tempString;
        while ((str = br.readLine()) != null) {
            System.out.printf("* %s *\n", str);
            tempString = str.split(",");
            for (int i = 0; i < tempString.length; i++) {
                tempString[i] = tempString[i].substring(tempString[i].indexOf(":")+2, tempString[i].length() - 1);
            }
            sb.append("Студент " +  tempString[0] + " получил " +tempString[1] + " по предмету " +tempString[2] + ".\n");
        }
        br.close();
        System.out.println(sb);
    }
}
