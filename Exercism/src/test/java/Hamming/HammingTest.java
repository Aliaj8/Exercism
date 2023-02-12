package Hamming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingTest {
    @Test
    void No_distance_between_empty_strands() {
        Hamming hamming = new Hamming("","");
        int hammingDistance = hamming.getHammingDistance();
        Assertions.assertThat(hammingDistance).isEqualTo(0);
    }
    @Test
    void No_Distance_Between_Short_Identical_Strands_() {
        Hamming hamming = new Hamming("A","A");
        int hammingDistance = hamming.getHammingDistance();
        Assertions.assertThat(hammingDistance).isEqualTo(0);
    }
    @Test
    void Complete_distance_in_single_letter_different_strands() {
        Hamming hamming = new Hamming("G","T");
        int hammingDistance = hamming.getHammingDistance();
        Assertions.assertThat(hammingDistance).isEqualTo(1);
    }

    @Test
    void distance_in_long_different_strands() {
        Hamming hamming = new Hamming("GGACGGATTCTG","AGGACGGATTCT");
        int hammingDistance = hamming.getHammingDistance();
        Assertions.assertThat(hammingDistance).isEqualTo(9);
    }

    @Test
    void validates_first_strand_not _longer() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Hamming("ATA", "AGTG"))
                .withMessage("leftStrand and rightStrand must be of equal length.");
    }
    //left strand must not be empty.
    @Test
    void disallow_left_empty_strand() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> new Hamming("","ALI"))
                .withMessage("left strand must not be empty.");
    }

    @Test
    void disallow_right_empty_strand() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> new Hamming("ALG",""))
                .withMessage("right strand must not be empty.");
    }
}
