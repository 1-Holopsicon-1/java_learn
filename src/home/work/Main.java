package home.work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] matrix2 = {{2,2,2}, {2,2,2}, {2,2,2}};

        Matrix matrix_cl1 = new Matrix(3, 3);
        matrix_cl1.matrix = matrix1;

        Matrix matrix_cl2 = new Matrix(3, 3);
        matrix_cl2.matrix = matrix2;

        matrix_cl1.sum(matrix_cl2).show();
        matrix_cl1.increaseByNumber(5).show();
        Matrix.increase(matrix_cl1, matrix_cl2).show();

        System.out.println(RectangleMatrix.determinant(matrix_cl1.matrix, 3, 3));
    }
}
