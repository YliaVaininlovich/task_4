package by.company.task;

import java.util.Random;

//№1 Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Main {

    public static void main(String[] args) {

        int n = 5;
        int[][] mass = new int[n][n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                mass[i][j] = rnd.nextInt(100) - 50;
                System.out.print(mass[i][j] + "\t");
            }
        }
        System.out.println("\nЭлементы на диагнали");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i][i] + " ");
        }

    }
}
