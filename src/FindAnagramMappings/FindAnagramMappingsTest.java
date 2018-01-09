package FindAnagramMappings;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class FindAnagramMappingsTest {

    @Test
    public void findAnagramMappingsTest() {
        FindAnagramMappings findAnagramMappingsObj = new FindAnagramMappings();
        int[] A = {12,28,46,32,50};
        int[] B = {50,12,32,46,28};
        int[] result = findAnagramMappingsObj.anagramMappings(A, B);
        int[] answer = {1,4,3,2,0};
        assertEquals(true, Arrays.equals(result, answer));
    }
}
