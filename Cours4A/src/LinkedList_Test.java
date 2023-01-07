import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedList_Test {

    @Test
    public void addToEmptyList(){
        LinkedList list = new LinkedList();
        Element e = new Element(2);
        list.add(e);
        assertSame("Empty list must contain element after add", list.head, e);

        // assertSame vérifie si deux références pointent vers le même objet.
    }

    @Test
    public void addToNonEmptyList(){
        LinkedList list = new LinkedList();
        Element e1 = new Element(2);
        list.add(e1);
        Element e2 = new Element(3);
        list.add(e2);

        assertSame("Must contain new element as head after add", list.head, e2);
        assertSame("Old element must be second element after add", list.head.next, e1);
    }

    @Test(expected = NumberFormatException.class)
    public void myTest(){
        LinkedList.myMethod(-1);
    }

    @Test(timeout = 1000) // teste si l'execution est inférieur à 1000ms
    public void myTimeTest(){}

    // Write a test that deletes a png file created by a program
    // The png is deleted after the test
    @After
    public void after(){
        // delete the file here
    }

}
