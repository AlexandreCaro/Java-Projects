
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockQueue {

    public final static int SIZE = 100;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public int head = 0;
    public int tail = 0;
    public final Integer [] cells = new Integer[SIZE];
    public int count = 0;



    public Integer dequeue(){
        
        Integer element = null;
        
        lock.lock();
        try {
            while(this.empty()) {
                try {
                    notEmpty.await();
                } catch (InterruptedException ex) {

                }
            }
            element = cells[head];
            cells[head] = null;
            head++;
            count--;

            notFull.signal();
            return element;
            } finally {

            lock.unlock();

            }

    }


    public void enqueue(Integer i) {
        lock.lock();
        try {
            while(this.full()){
                try {
                    notFull.await();
                } catch(InterruptedException ex){

                }
            }

            tail++;
            cells[tail] = i;
            count++;

            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public boolean full(){
        return this.count == SIZE;
    }

    public boolean empty(){
        return this.head == this.tail;
    }

    public int size() { return this.tail - this.head; }

}
