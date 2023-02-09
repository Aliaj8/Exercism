package Handshake;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HandshakeCalculator {
    public List<Signal> calculateHandshake(int number) {
        List<Signal> list = new LinkedList<>();
        if ((number & 1)==1)list.add(Signal.WINK);
        if ((number & 2)==2)list.add(Signal.DOUBLE_BLINK);
        if ((number & 4)==4)list.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 8)==8)list.add(Signal.JUMP);
        if ((number & 16)==16)Collections.reverse(list);
        return list;
    }
}
