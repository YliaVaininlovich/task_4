package by.company.task;

import java.util.Random;

//10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mass = new int[n][n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                mass[i][j] = rnd.nextInt(100) - 50;
                System.out.print(mass[i][j] + "\t\t");
            }
        }

        System.out.println("\nПоложительные элементы главной диагонали");
        for (int i = 0; i < n; i++) {
            if (mass[i][i] > 0)
                System.out.print(mass[i][i] + "\t\t");
        }
    }
}

