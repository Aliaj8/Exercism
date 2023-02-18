package matrix.saddlePoint;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    void can_identify_a_single_saddle_point() {//role: saddle point is number a max in row and min in col
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(9, 8, 7),
                Arrays.asList(5, 3, 2),
                Arrays.asList(6, 6, 7)));

        Set<MatrixCoordinate> expectedSaddlePoints = Collections.singleton(new MatrixCoordinate(2, 1));
        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void Can_identify_that_empty_matrix_has_no_saddle_points() {
        Matrix matrix = new Matrix(new ArrayList<>());
        Set<MatrixCoordinate> expectedSaddlePoints = Collections.emptySet();
        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void Can_identify_lackOf_saddlePoints_when_there_are_none() {
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 1, 2),
                Arrays.asList(2, 3, 1)
        ));
        Set<MatrixCoordinate> expectedSaddlePoints =Collections.emptySet();
        assertEquals(expectedSaddlePoints,matrix.getSaddlePoints());
    }

    @Test
    void Can_identify_multiple_saddlePoints_in_a_column() {
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(4, 5, 4),
                Arrays.asList(3, 5, 5),
                Arrays.asList(1, 5, 4)
        ));
        Set<MatrixCoordinate> expectedSaddlePoints =new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1,2),
                new MatrixCoordinate(2,2),
                new MatrixCoordinate(3,2)
        ));
        assertEquals(expectedSaddlePoints,matrix.getSaddlePoints());
    }

    @Test
    void Can_identify_multiple_saddle_points_in_aRow() {
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(6, 7, 8),
                Arrays.asList(5, 5, 5),
                Arrays.asList(7, 5, 6)
        ));
        Set<MatrixCoordinate> expectedSaddlePoints =new HashSet<>(Arrays.asList(
                new MatrixCoordinate(2,1),
                new MatrixCoordinate(2,2),
                new MatrixCoordinate(2,3)
        ));
        assertEquals(expectedSaddlePoints,matrix.getSaddlePoints());
    }

    @Test
    void Can_identify_saddlePoint_in_bottom_right_corner() {
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(8, 7, 9),
                Arrays.asList(6, 7, 6),
                Arrays.asList(3, 2, 5)
        ));
        Set<MatrixCoordinate>  expectedSaddlePoint =Collections.singleton(new MatrixCoordinate(3,3));
        assertEquals(expectedSaddlePoint,matrix.getSaddlePoints());
    }

    @Test
    void can_identify_saddle_points_in_nonSquare_matrix() {
        Matrix matrix = new Matrix(Arrays.asList(
                Arrays.asList(3, 1, 3),
                Arrays.asList(3, 2, 4)
        ));
        Set<MatrixCoordinate> expectedSaddlePoint = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 3),
                new MatrixCoordinate(1, 1)
        ));
        assertEquals( expectedSaddlePoint , matrix.getSaddlePoints());
    }
    @Test
    public void identify_that_saddlePoints_aSingle_column_matrix_are_those_with_minValue() {
        Matrix matrix = new Matrix(Arrays.asList(
                Collections.singletonList(2),
                Collections.singletonList(1),
                Collections.singletonList(4),
                Collections.singletonList(1)
        ));
        Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(2, 1),
                new MatrixCoordinate(4, 1)
        ));
        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }
    @Test
    public void identify_saddlePoints_in_aSingleRow_matrix_are_those_with_maxValue() {
        Matrix matrix = new Matrix(Collections.singletonList(
                Arrays.asList(2, 5, 3, 5)
        ));
        Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 2),
                new MatrixCoordinate(1, 4)
        ));
        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }
}
