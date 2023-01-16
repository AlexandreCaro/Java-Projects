import java.util.Stack;

/**
 * Question:
 *
 * You are asked to implement the abstract data type RecursiveStack below.
 *
 * Your implementation can be an inner static class or a class below.
 * The factory method "makeRecursiveStack" returns a new instance of your implementation
 *
 * Once it is done, copy-paste the complete file in Inginious also with the imports
 *
 *
 * Feel free to add classes, methods or fields in the class but do not modify
 * the signature of existing code
 *
 */
public interface RecursiveStack {

    /**
     * Factory method
     * @return a new instance of your implementation of RecursiveStack
     */
    public static RecursiveStack makeRecursiveStack() {

         return new RecursiveStackClass(new Stack());
    }


    int size();

    int top();

    RecursiveStack removeTop();

    RecursiveStack addTop(int v);


}

class RecursiveStackClass implements RecursiveStack{

    private Stack<Integer> stack = new Stack<Integer>();

    public RecursiveStackClass(Stack stack){
        this.stack = stack;
    }

    @Override
    public int size(){

        return this.stack.size();

    }

    @Override
    public int top(){
        return (int) this.stack.peek();
    }

    @Override
    public RecursiveStack removeTop(){

        Stack newStack = (Stack) this.stack.clone();

        newStack.pop();

        return new RecursiveStackClass(newStack);
    }

    @Override
    public RecursiveStack addTop(int v){

        Stack newStack = (Stack) this.stack.clone();

        newStack.push(v);

        return new RecursiveStackClass(newStack);

    }

}