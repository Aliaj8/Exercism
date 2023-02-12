package Hamming;

import java.util.Objects;
public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }else if(!leftStrand.isEmpty() && rightStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if (!(leftStrand.length()==rightStrand.length())){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand=leftStrand;
        this.rightStrand=rightStrand;
    }

    public char[] getRightStrand() {
        return rightStrand.toCharArray();
    }
    public char[] getLeftStrand() {
        return leftStrand.toCharArray();
    }

    public int getHammingDistance() {
        int count=0;
        char[] left=getLeftStrand();
        char[] right=getRightStrand();
        for (int i = 0; i < left.length; i++)
            if (!Objects.equals(left[i], right[i])) {
                count++;
            }
        return count;
    }
}
