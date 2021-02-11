package by.company.task;

//#6 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task6 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                    mass[i][j] = 1;
                } else {
                    mass[i][j] = 0;
                }
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
