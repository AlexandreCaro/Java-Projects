import java.util.Iterator;

/**
 * Question:
 *
 * You are asked to implement an IterableString allowing
 * to iterate on the successive chars of a given string
 *
 * Once it is done, copy-paste the complete class in Inginious also with the imports
 *
 *
 * Feel free to add methods or fields in the class but do not modify
 * the signature and behavior of existing code
 *
 */
public class StringIterator {

    /**
     * Factory method
     * @param s the string on which to iterate
     * @return a new instance of your implementation of an IterableString allowing to iterate on s
     */
    public static IterableString makeIterableString(String s) {
        // TODO return an instance of your class that implements the interface
         return new IteratorString(s);
    }

    /**
     * An IterableString permit to iterate on each character of a
     * string one by one from left to right
     */
    public interface IterableString extends Iterable<Character> {}

    // TODO implement the interface IterableString as an (inner) class

    static class IteratorString implements IterableString{

        private String newString = "";

        IteratorString(String myString){
            this.newString = myString;
        }

        @Override
        public Iterator<Character> iterator(){
            Iterator<Character> iter = new Iterator<Character>(){
                private int currentIndex = 0;
                private int size = newString.length();
                @Override
                public boolean hasNext(){
                    //System.out.println(size);
                    //System.out.println(currentIndex);
                    return currentIndex < size;
                }

                @Override
                public Character next(){

                    if(this.hasNext()){
                        //currentIndex =  currentIndex+1;
                        return newString.charAt(currentIndex++);
                    }
                    else throw new UnsupportedOperationException();
                }
            };
            return iter;
        }

    }

}
