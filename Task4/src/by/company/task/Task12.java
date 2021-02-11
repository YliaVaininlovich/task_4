package by.company.task;

import java.util.Random;

//12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

//!!! если m<n задача нерешаема
public class Task12 {
    public static void main(String[] args) {

        int m = 8;
        int n = 4;
        int[][] mass = new int[m][n];

        int sum = 0;
        int k;

        Random rnd = new Random();

        for (int j = 0; j < n; j++) {
            while (sum != j + 1) {
                sum = 0;
                k = rnd.nextInt(m);
                mass[k][j] = 1;
                for (int i = 0; i < m; i++) {
                    sum += mass[i][j];
                }
            }
        }

        System.out.println("\nВывод");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + "\t");
            }
        }
    }

}
