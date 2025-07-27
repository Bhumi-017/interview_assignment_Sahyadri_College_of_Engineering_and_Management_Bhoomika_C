package Belc;
import static org.junit.Assert.*;

import org.junit.Test;

public class problem1_Test {
    @Test
    public void testDuplicate() {
        assertEquals(false, problem1.duplicateCheck(new int[] {1,2,3,-1})); //testCase1
        assertEquals(false, problem1.duplicateCheck(new int[] {1,2,-3,4})); //testCase2
        assertEquals(true, problem1.duplicateCheck(new int[] {1,1,1,3,3,4,3,2,4,2})); //testCase3
        assertEquals(true, problem1.duplicateCheck(new int[] {0,0,0,1})); //testCase4
}
}