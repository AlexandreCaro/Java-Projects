package module4_min;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest_junit {

    @Test
    public void test1(){
        int r = Main.min(3, 4);
        assertEquals("smaller value first", 3, r);
    }

    @Test
    public void test2(){
        int r = Main.min(4, 3);
        assertEquals("greater value first", 3, r);
    }
}
