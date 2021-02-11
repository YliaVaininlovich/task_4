package by.company.task;

import java.util.Random;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Task11 {
    public static void main(String[] args) {

        int n = 6;
        int m = 10;
        int[][] mass = new int[n][m];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                mass[i][j] = rnd.nextInt(15);
                System.out.print(mass[i][j] + "\t\t");
            }
        }

        System.out.println("\nномера строк, в которых число 5 встречается три и более раз");
        int count;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (mass[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(i + 1 + "\t\t");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("\nтаких строк нет");
        }
    }

}
