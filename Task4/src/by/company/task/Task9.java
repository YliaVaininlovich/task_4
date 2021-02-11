package by.company.task;

//Дан линейный массив x1, x2,, xn−1, xn . Получить действительную квадратную матрицу порядка n:
public class Task9 {
    public static void main(String[] args) {

        int n = 6;
        double[] a = new double[]{1, 2, 3, 4, 5, 6};
        double[][] mass = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = Math.pow(a[j], i + 1);
            }
        }

        System.out.println("\nВывод");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + "\t\t  ");
            }
        }
    }

}
