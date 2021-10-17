package home.work;

class RectangleMatrix extends Matrix {
    RectangleMatrix(int m, int n) {
        super(m, n);
        if (m == n)
            throw new ArithmeticException("Прямоугольная матрица -> число строк не равно числу столбцов.");
    }

    public static void minor(double matrix[][], double temp[][], int p, int q, int n) {
        int i = 0;
        int j = 0;
        for (int row_tmp = 0; row_tmp < n; row_tmp++) {
            for (int col_tmp = 0; col_tmp < n; col_tmp++) {
                if (row_tmp != p && col_tmp != q) {
                    temp[i][j++] = matrix[row_tmp][col_tmp];
                    if (j == n - 1) {
                        i++;
                        j = 0;
                    }
                }
            }
        }
    }

    public static double determinant(double matrix[][], int n, int N) {
        int D = 0;

        if (n == 1)
            return matrix[0][0];

        double tmp[][] = new double[N][N];
        int sign = 1;

        for (int f = 0; f < n; f++) {
            minor(matrix, tmp, 0, f, n);
            D += sign * matrix[0][f] * determinant(tmp, n - 1, N);
            sign = -sign;
        }
        return D;
    }
}