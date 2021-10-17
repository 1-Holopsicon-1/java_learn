package home.work;

import java.util.Arrays;

class Matrix {
    public double[][] matrix;
    protected int row;
    protected int column;

    Matrix(int r, int c) {
        this.matrix = new double[r][c];
        this.row = r;
        this.column = c;
    }

    public int random(){
        return (int) (Math.random() * 186);
    }

    public void rndFluid() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random();
            }
        }
    }

    public boolean sizeComparison(Matrix other) {
        return row == other.row && column == other.column;
    }

    public void show() {
        for (int i = 0; i < this.row; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("");
    }

    public Matrix increaseByNumber(int number) {
        Matrix out = new Matrix(row, column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                out.matrix[i][j] = matrix[i][j] * number;
            }
        }
        return out;
    }

    public static Matrix increase(Matrix firstMat, Matrix secondMat) {
        if (firstMat.row != secondMat.column)
            throw new IllegalArgumentException("Error. Число столбцов не равно числу строк.");

        Matrix out = new Matrix(firstMat.row, secondMat.column);

        for (int i = 0; i < firstMat.row; i++) {
            for (int j = 0; j < secondMat.column; j++) {
                for (int o = 0; o < secondMat.row; o++) {
                    out.matrix[i][j] += firstMat.matrix[i][o] * secondMat.matrix[o][j];
                }
            }
        }
        return out;
    }


    public Matrix sum(Matrix secondMatrix) {
        if (!sizeComparison(secondMatrix))
            throw new ArithmeticException("Error. Разная размерность матриц");

        Matrix out = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                out.matrix[i][j] = matrix[i][j] + secondMatrix.matrix[i][j];
            }
        }
        return out;
    }
}