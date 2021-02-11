package by.company.task;

//8. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task8 {
    public static void main(String[] args) {

        int n = 6;
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= n - 1 - i) {
                    mass[i][j] = j + i + 1;
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
