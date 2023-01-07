import org.junit.Test;

import static org.junit.Assert.*;

public class Maximum_Test {

    @Test
    public void test(){

        int[] a = new int[]{1, 2, 3, 4, 5};
        int max = Maximum.maximum(a);

        assertEquals("not the max", max, 5);

    }

    @Test
    public void ifEheyAreAllEqual(){
        int[] a = new int[]{2,2,2,2,2};
        int max = Maximum.maximum(a);

        assertEquals("should be the same", max, 2);
    }

    @Test
    public void oneElementList(){
        int[] a = new int[]{1};

        int max = Maximum.maximum(a);

        assertSame("should return 1", max, 1);
    }

}
