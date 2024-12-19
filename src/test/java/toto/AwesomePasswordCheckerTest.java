package toto;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

public class AwesomePasswordCheckerTest {

    @Test
    public void testMaskAff() throws Exception {
        String password = "passWORD1234<>@&;";
        int[] maskAff = AwesomePasswordChecker.maskAff(password);
        int[] expectedMaskArray = {2, 1, 1, 1, 4, 3, 3, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7};
        assertArrayEquals(expectedMaskArray, maskAff);
    }

    @Test
    public void testGetDistance() throws Exception {
        File testFile = new File("src/test/resources/cluster_centers_HAC_aff.csv");
        AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance(testFile);

        String password = "passWORD1234";
        double distance = checker.getDistance(password);
        assertTrue("Distance should be non-negative", distance >= 0);
    }

    @Test
    public void testComputeMD5() {
        String input = "password";
        String md5Hash = AwesomePasswordChecker.ComputeMD5(input);
        String expectedHash = "5f4dcc3b5aa765d61d8327deb882cf99"; // MD5 of "password"
        assertEquals(expectedHash, md5Hash);
    }

    @Test
    public void testEmptyPasswordMask() throws Exception {
        String password = "";
        int[] maskAff = AwesomePasswordChecker.maskAff(password);
        int[] expectedMaskArray = new int[28]; // All zeros since the password is empty
        assertArrayEquals(expectedMaskArray, maskAff);
    }

    @Test
    public void testLongPasswordMask() throws Exception {
        String password = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int[] maskAff = AwesomePasswordChecker.maskAff(password);

        // Only the first 28 characters should be processed
        int[] expectedMaskArray = {1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 4};
        assertArrayEquals(expectedMaskArray, maskAff);
    }

    @Test
    public void testInvalidCSVHandling() {
        try {
            File invalidFile = new File("src/test/resources/invalid_cluster_centers.csv");
            AwesomePasswordChecker.getInstance(invalidFile);
            fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            assertTrue("IOException thrown as expected", true);
        }
    }
}
