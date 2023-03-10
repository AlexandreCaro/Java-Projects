import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  You can ADD any code you like in this class (new members, new methods, etc.).
 *  You can also add imports.
 */

public class ParallelCountingBrouillon {

    /**
     * Return the number of values equal to v using a parallel algorithm.
     *
     * @param values an array of numbers
     * @param v the value that you want to count
     * @param nThreads is a value between 1 and values.length
     * @return the number of elements equal to v in values (or 0 if no values are provided)
     *
     * Example: For
     *     values = [4.5f,3.2f,5.0f,6.6f,7.2f,1.5f,3.7f,5.8f,6.0f,9.0f,1.3f,2.3f,4.5f,1.5f]
     * and
     *     v = 4.5
     * the method returns 2 because the value 4.5 appears two times in the array.
     *
     * Try to give all threads more or less the same amount of work!
     */
    public static int parallelCount (Optional<float[]> values, float v, int nThreads) {

        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        
        if(!values.isPresent()){
            return 0;
        }

        int length = (int) values.get().length/nThreads;

        int count = 0;

        AtomicInteger index = new AtomicInteger(0);

        for(int i = 0; i < nThreads; i++) {

            Future<Integer> future = executorService.submit(() -> {

                int newCount = 0;

                for (int j = index.get()*length; j < (index.get() + 1)*length; j++) {
                    if (values.get()[j] == v) {

                        newCount++;

                    }
                }
                index.getAndIncrement();

                return newCount;
            });


            try {
                count += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        return count;
    }

}