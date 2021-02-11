package by.company.task;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Task4 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <n; j++)
                    mass[i][j]=j+1;
            } else {
                for (int j = 0; j < n; j++)
                    mass[i][j]=n-j;
            }
        }

        System.out.println("\nВывод");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + "\t\t");
            }
        }
    }
}
