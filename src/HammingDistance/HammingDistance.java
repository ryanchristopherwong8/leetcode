package HammingDistance;

public class HammingDistance {

    public int getHammingDistance(int x, int y) {
        int num = x^y;
        String numStr = Integer.toBinaryString(num);

        int result = 0;
        for(int i = 0; i < numStr.length(); i++) {
            if(numStr.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}
