package HomeWorks.Seminar_5dz;

/* Задание 3. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
И вывести Доску.
Пример вывода доски 8x8
0x000000
0000x000
00x00000
*/


public class Sem05hw_Ex003 {
    static int number = 8;
    static int[] queen = new int[number];
    static int index = 0;
    public static void main(String[] args) {
        int[] queenres = new int[number];
        int version = 0;
        do {
            if (checkingPosition()) {
                if (index == number - 1) {
                    System.out.print(version++);
                    for (int i = 0; i < number; i++) {
                        System.out.printf(" [%d]=%d", i, queen[i]);
                        queenres[i] = queen[i];
                    }
                    System.out.println();
                    queen[index]++;
                } else {
                    index++;
                }
            } else {
                queen[index]++;
            }
        } while (queen[0] < number);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == queenres[i]) {
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }

    static boolean checkingPosition(){
        if (index == 0) {
            return true;
        }
        if (queen[index]>7) {
            queen[index] = 0;
            index--;
            return false;
        }
        for (int i = 0; i < index; i++) {
            if ((queen[index] == queen[i]) | ((Math.abs(queen[index]-queen[i])) == index-i)){
                return false;
            }
        }
        return true;
    }

}
