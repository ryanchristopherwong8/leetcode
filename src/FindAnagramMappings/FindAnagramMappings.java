package FindAnagramMappings;

import java.util.HashMap;

public class FindAnagramMappings {

    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int indexB = 0;
        for(int num : B) {
            hashMap.put(num, indexB++);
        }
        int[] result = new int[A.length];
        int indexA = 0;
        for(int num : A) {
            result[indexA++] = hashMap.get(num);
        }
        return result;
    }
}
