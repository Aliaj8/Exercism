package matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MatrixTest {
    @Test
    void extract_row_from_one_number_matrix_test() {
        Matrix matrix = new Matrix("1");
        int[] expectedRow = {1};
        assertArrayEquals(expectedRow, matrix.getRow(1));
    }

    @Test
    void extract_row_from_matrix() {
        String matrixAsString = "10 2\n3 4";
        int rowIndex = 2;
        int[] expectedRow = {3, 4};
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(expectedRow, matrix.getRow(rowIndex));
    }

    @Test
    void extract_row_from_non_square_matrix() {
        String matrixAsString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        int rowIndex = 4;
        int[] expectedRow = {8, 7, 6};
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(expectedRow, matrix.getRow(rowIndex));
    }

    @Test
    void extract_column_from_one_number_matrix() {
        String matrixAsString = "1";
        int columnIndex = 1;
        int[] expectedColumn = {1};
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(expectedColumn, matrix.getColumn(columnIndex));
    }

    @Test
    void extract_column_from_monSquare_matrix() {
        String matrixAsString = "1 2 3 4\n5 6 7 8\n9 8 7 6";
        int columnIndex = 4;
        int[] expectedColumn = {4, 8, 6};
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(expectedColumn, matrix.getColumn(columnIndex));
    }

    @Test
    void extract_column_from_diffWidths_matrix() {
        String matrixAsString = "89 1903 3\n18 3 1\n9 4 800";
        int columnIndex = 2;
        int[] expectedColumn = {1903, 3, 4};
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(expectedColumn, matrix.getColumn(columnIndex));
    }
}
