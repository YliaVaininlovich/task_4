package by.company.task;

//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//строка слева направо, третья строка справа налево и так далее.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int n = 5;
        int m = 7;
        int[][] mass = new int[m][n];
        int k = 4;
        int p = 6;
        Random rnd = new Random();

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                mass[i][j] = rnd.nextInt(100) - 50;
                System.out.print(mass[i][j] + "\t\t");
            }
        }
        System.out.println("\nВывод");

        for (int i = 0; i < m; i++) {
            System.out.println();
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--)
                    System.out.print(mass[i][j] + "\t\t");
            } else {
                for (int j = 0; j < n; j++)
                    System.out.print(mass[i][j] + "\t\t");
            }
        }
    }
}
