package SquaresCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DifferenceOfSquaresCalculatorTest {
    private DifferenceOfSquaresCalculator calculator;
    @BeforeEach
    public void setup(){
        calculator = new DifferenceOfSquaresCalculator();
    }
    @Test
    void square_of_sum_up_to_one() {
        int actual = calculator.computeSquareOfSumTo(1);
        Assertions.assertEquals(1,actual);
    }

    @Test
    void square_of_sum_to_5() {
        int actual = calculator.computeSquareOfSumTo(5);
        Assertions.assertEquals(225,actual);
    }

    @Test
    void test_square_of_sum_up_to_hundred() {
        int actual = calculator.computeSquareOfSumTo(100);
        Assertions.assertEquals(25502500,actual);
    }

    @Test
    void sum_of_square_up_to_5() {
        int actual = calculator.computeSumOfSquaresTo(5);
        Assertions.assertEquals(55,actual);
    }

    @Test
    void sum_of_square_up_to_100() {
        int actual = calculator.computeSumOfSquaresTo(100);
        Assertions.assertEquals(338350,actual);
    }

    @Test
    void difference_of_squares_up_toOne() {
        int actual = calculator.computeDifferenceOfSquares(1);
        Assertions.assertEquals(0,actual);
    }

    @Test
    void difference_of_squares_to_5() {
        int actual = calculator.computeDifferenceOfSquares(5);
        Assertions.assertEquals(170,actual);
    }
    @Test
    void difference_of_squares_to_100() {
        int actual = calculator.computeDifferenceOfSquares(100);
        Assertions.assertEquals(25164150,actual);
    }
}
