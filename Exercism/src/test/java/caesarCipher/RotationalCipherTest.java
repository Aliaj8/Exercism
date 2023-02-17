package caesarCipher;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotationalCipherTest {
    @Test
    void rotate_a_single_word_and_shiftkey_0() {
        RotationalCipher cipher = new RotationalCipher(0);
        Assertions.assertThat(cipher.rotate("a")).isEqualTo("a");
    }

    @Test
    void rotate_single_character_by_shift_key_1() {
        RotationalCipher cipher = new RotationalCipher(1);
        Assertions.assertThat(cipher.rotate("a")).isEqualTo("b");
    }

    @Test
    void rotate_single_character_by_shiftKey_26() {
        RotationalCipher cipher = new RotationalCipher(26);
        Assertions.assertThat(cipher.rotate("a")).isEqualTo("a");
    }

    @Test
    void rotate_single_character_by_shiftKey_13() {
        RotationalCipher cipher = new RotationalCipher(13);
        Assertions.assertThat(cipher.rotate("m")).isEqualTo("z");
    }

    @Test
    void rotate_capital_letters() {// for example input="T" output="O"
        RotationalCipher cipher = new RotationalCipher(5);
        Assertions.assertThat(cipher.rotate("OMG")).isEqualTo("TRL");
    }

    @Test
    void rotate_capital_letters_with_space_char() {
        RotationalCipher cipher = new RotationalCipher(5);
        Assertions.assertThat(cipher.rotate("O M G")).isEqualTo("T R L");
    }

    @Test
    void should_be_not_rotate_numbers() {
        RotationalCipher cipher = new RotationalCipher(4);
        Assertions.assertThat(cipher.rotate("Testing 1 2 3 testing")).isEqualTo("Xiwxmrk 1 2 3 xiwxmrk");
    }

    @Test
    void should_be_rotate_all_letters() {
        RotationalCipher cipher = new RotationalCipher(13);
        Assertions.assertThat(cipher.rotate("Gur dhvpx oebja sbk whzcf bire gur ynml qbt."))
                .isEqualTo("The quick brown fox jumps over the lazy dog.");

    }
}
