package NumberComplement;

public class NumberComplement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for( char c : s.toCharArray()) {
            sb.append((char)(c^1));
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
