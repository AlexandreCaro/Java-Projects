import java.util.Iterator;

public class ArrayBag<Item> implements Bag<Item> {

    private Item[] a;
    private int n;

    public ArrayBag(){
        a = (Item[]) new Object[2];
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    /**
     * Equivalent to a = (Item[]) java.util.Arrays.copyOf(a, capacity);
     * @param capacity
     */
    private void resize(int capacity){
        assert capacity >= n;
        Item[] temp = (Item[]) new Object[capacity];
        for(int i = 0; i < n; i++)
            temp[i] = a[i];

        a = temp;
    }

    public void add(Item item){
        if(n == a.length) resize(2*a.length);
        a[n++] = item;
    }

    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item>{

    }
}
