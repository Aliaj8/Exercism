package caesarCipher;

public class RotationalCipher {
    StringBuilder stringBuilder = new StringBuilder();
    private final int shiftKey;
    public RotationalCipher(int shiftKey) {
        this.shiftKey=shiftKey;
    }
    public String rotate(String input) {
        char[] chars = input.toCharArray();
        for (char achar : chars) {
            if (Character.isLetter(achar)){
                if (Character.isUpperCase(achar)){
                    stringBuilder.append( (char) ( 'A' +( achar - 'A' + shiftKey) % 26) );
                }else
                    stringBuilder.append( (char) ( 'a' +( achar - 'a' + shiftKey) % 26) );
            }else stringBuilder.append(achar);
        }
        return stringBuilder.toString();
    }
}
