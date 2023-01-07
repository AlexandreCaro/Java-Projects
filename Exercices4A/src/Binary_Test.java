import org.junit.Test;

import static org.junit.Assert.*;

public class Binary_Test {

    @Test
    public void testRight(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 5);

        assertEquals("should be the index of the value researched", searched, 4);
    }

    @Test
    public void testLeft(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 1);

        assertEquals("should be the index of the value researched", searched, 0);

    }

    @Test
    public void testMiddle(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 3);

        assertEquals("should be the index of the value researched", searched, 2);

    }

    @Test
    public void NotPresent(){
        int[] a = new int[]{1, 2, 3, 4, 5, 6};

        int value = 8;

        assertEquals("should be -1", BinarySearch.binarySearch(a, value), -1);
    }

    @Test
    public void testRightImpair(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 5);

        assertEquals("should be the index of the value researched", searched, 4);
    }

    @Test
    public void testLeftImpair(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 1);

        assertEquals("should be the index of the value researched", searched, 0);

    }

    @Test
    public void testMiddleImpair(){

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int value = 5;

        int searched = BinarySearch.binarySearch(a, 3);

        assertEquals("should be the index of the value researched", searched, 2);

    }

    @Test
    public void NotPresentImpair(){
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};

        int value = 8;

        assertEquals("should be -1", BinarySearch.binarySearch(a, value), -1);
    }
}
