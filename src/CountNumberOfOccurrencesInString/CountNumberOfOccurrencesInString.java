package CountNumberOfOccurrencesInString;

public class CountNumberOfOccurrencesInString {
    public static int countNumberOfOccurrencesInString(String string, char target) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == target) {
                count ++;
            }
        }
        return count;
    }

    public static int countChars(String s, char c) {
        if (s.length() == 0)
            return 0;
        else if (s.charAt(0) == c)
            return 1 + countChars(s.substring(1), c);
        else
            return countChars(s.substring(1), c);
    }
}
