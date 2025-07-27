package Belc;
import static org.junit.Assert.*;

import org.junit.Test;

public class problem2_Test {
    @Test
    public void testDuplicate() {
        int[] testCase1 = {0,1,0,3,12}; //Since arrangeZero function's return type is void, we can't directly test it.
        problem2.arrangeZero(testCase1);
        assertArrayEquals(new int[] {1,3,12,0,0}, testCase1); //testCase1
        int[] testCase2 = {1,2,3,4};
        problem2.arrangeZero(testCase2);
        assertArrayEquals(new int[] {1,2,3,4}, testCase2); //testCase2
        int[] testCase3 = {0,0,0,0};
        problem2.arrangeZero(testCase3);
        assertArrayEquals(new int[] {0,0,0,0}, testCase3); //testCase3
    }
}
