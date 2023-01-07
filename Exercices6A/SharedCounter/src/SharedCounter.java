public class SharedCounter {

    private int counter = 0;
    private final Object mutex = new Object();

    void inc(){
        synchronized(mutex){
            counter++;
            mutex.notify();
        }
    }

    void dec(){
        synchronized(mutex){
            while(counter <= 0){
                try{
                    mutex.wait();
                } catch(InterruptedException e){
                    throw new RuntimeException("...", e);
                }
            }
            counter--;
        }
    }

    int get(){
        return counter;
    }


}
