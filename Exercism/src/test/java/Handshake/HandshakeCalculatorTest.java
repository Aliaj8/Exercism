package Handshake;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HandshakeCalculatorTest {

    @Test
    void should_That_input_one_yields_Wink() {
        HandshakeCalculator hshake = new HandshakeCalculator();
        List<Signal> signals = hshake.calculateHandshake(1);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.WINK);
    }

    @Test
    void should_that_input_two_yields_DOUBLE_BLINK() {
        HandshakeCalculator hshake = new HandshakeCalculator();
        List<Signal> signals = hshake.calculateHandshake(2);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.DOUBLE_BLINK);
    }

    @Test
    void should_that_input_four_yields_CLOSE_YOUR_EYES() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(4);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.CLOSE_YOUR_EYES);
    }

    @Test
    void should_that_input_8_yields_JUMP() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(8);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.JUMP);
    }

    @Test
    void should_that_input_16_yields_reversing_and_isempty() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(16);
        System.out.println(signals);
        Assertions.assertThat(signals).isEmpty();
    }

    @Test
    void should_that_input_3_yields_Two_actions() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(3);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.WINK, Signal.DOUBLE_BLINK);
    }

    @Test
    void should_that_input_19_yields_two_reversed_actions() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(19);
        System.out.println(signals);
        Assertions.assertThat(signals).containsExactly(Signal.DOUBLE_BLINK, Signal.WINK);
    }

    @Test
    void should_that_input_24_reversing_single_action_yields_sameAction() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(24);
        System.out.println(signals);

    }

    @Test
    void should_input_15_yields_all_actions() {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        List<Signal> signals = handshakeCalculator.calculateHandshake(15);
        System.out.println(signals);
    }
}
