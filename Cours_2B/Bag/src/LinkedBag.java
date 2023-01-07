import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedBag<Item> implements Bag<Item> {

    private Node<Item> first;
    private int n;

    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public LinkedBag(){
        first = null;
        n = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return n;
    }

    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node<Item> current = first;
        private final int nInit = n;

        private boolean failFastCheck(){
            if(n!=nInit){
                throw new ConcurrentModificationException("Bag modified while iterating on it");
            }
            return true;
        }

        public boolean hasNext() {return current != null;}
        public void remove() {throw new UnsupportedOperationException();}
        public Item next() {
            failFastCheck();
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args){
        Bag<String> bag = new LinkedBag<String>();

        bag.add("computer");
        bag.add("Table");

        Iterator ite = bag.iterator();

        ite.next();
        ite.next();
        if(ite.hasNext()){
            System.out.println("How come you have some next?!");
        }
    }
}
