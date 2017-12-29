package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> getSelfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        int num;
        while(left <= right) {
            if(isSelfDividingNumber(left)) {
                selfDividingNumbers.add(left);
            }
            left++;
        }
        return selfDividingNumbers;
    }
    public boolean isSelfDividingNumber(int original) {
        int divided = original;
        int individualNum;
        boolean selfDivided = true;
        while(divided!= 0) {
            individualNum = divided % 10;
            if(individualNum == 0) {
                return false;
            }
            if(original % individualNum != 0 ) {
                return false;
            }
            divided = divided / 10;
        }
        return true;
    }
}
