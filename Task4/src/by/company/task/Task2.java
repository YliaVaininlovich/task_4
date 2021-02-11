package by.company.task;

import java.util.Random;

//#2 Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task2 {

    public static void main(String[] args) {

        int n = 5;
        int m = 7;
        int[][] mass = new int[n][m];
        int k = 4;
        int p = 6;
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                mass[i][j] = rnd.nextInt(100) - 50;
                System.out.print(mass[i][j] + "\t\t");
            }
        }
        System.out.println("\nЭлементы к-й строки");
        for (int j = 0; j < m; j++) {
            System.out.print(mass[k-1][j] + " ");
        }
        System.out.println("\nЭлементы р-го столбца");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i][p-1] + " ");
        }
    }

}
