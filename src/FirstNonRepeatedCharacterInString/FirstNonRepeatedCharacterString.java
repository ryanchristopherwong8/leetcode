package FirstNonRepeatedCharacterInString;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterString {
    public static String firstNonRepeatedCharacterString(String phrase) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        for(char s : phrase.toCharArray()) {
            String singleString = String.valueOf(s);
            if (linkedHashMap.containsKey(singleString)) {
                Integer count = linkedHashMap.get(singleString) + 1;
                linkedHashMap.put(singleString, count);
            } else {
                linkedHashMap.put(String.valueOf(singleString), 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> linkedHashMapIterator = linkedHashMap.entrySet().iterator();
        while (linkedHashMapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = linkedHashMapIterator.next();
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return "";
    }
}
