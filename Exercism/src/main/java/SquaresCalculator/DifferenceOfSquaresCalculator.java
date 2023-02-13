package SquaresCalculator;

public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input) {
        int sum = (input * (input + 1))/2;
        return sum*sum;
    }
    public int computeSumOfSquaresTo(int input) {
        if (input==1)return 1;
        else {
            return (input * input)+computeSumOfSquaresTo(input-1);
        }
    }
    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }
}
