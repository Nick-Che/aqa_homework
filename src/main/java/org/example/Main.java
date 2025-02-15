package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {{"1", "2", "1", "7"},
                {"9", "1", "5", "4"},
                {"6", "0", "1", "1"},
                {"7", "2", "1", "1"}};

        try {
            int sum = processMatrix(matrix);
            System.out.println("Сумма елементов матрицы: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int processMatrix(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        if (matrix.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (matrix[i].length != 4) {
                    throw new MyArraySizeException("Неверный размер матрицы. Ожидаемый размер 4х4.");
                }
            }
        } else {
            throw new MyArraySizeException("Неверный размер матрицы. Ожидаемый размер 4х4.");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат данных в ячейке (" + i + ", " + j + "): " + matrix[i][j]);
                }
            }
        }

        return sum;
    }
}