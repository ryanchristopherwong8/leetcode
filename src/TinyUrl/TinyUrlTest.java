package TinyUrl;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TinyUrlTest {
    @Test
    public void test1() {
        TinyUrl tinyUrl = new TinyUrl();
        String website = "http://www.google.com";
        String encode = tinyUrl.encode(website);
        String decode = tinyUrl.decode(encode);
        assertEquals(decode, website);
    }
}