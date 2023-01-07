public class Launcher {

    /*
     * Instantiate and start each thread from "t" with its OWN Counter object,
     * then wait for all threads to finish and return the set of Counter objects
     * the threads ran on. Each thread must be named according to its index in the
     * "t" array.
     */
    public static Counter[] init(Thread[] t) throws InterruptedException {

        int size = t.length;

        Counter[] counters = new Counter[size];

        for (int i = 0; i < size; i++) {
            counters[i] = new Counter();
        }

        for (int i = 0; i < size; i++) {
            t[i] = new Thread(counters[i]);
        }

        for (int i = 0; i < size; i++) {
            t[i].start();
            t[i].setName(String.valueOf(i));
        }

        for (int i = 0; i < size; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        return counters;
    }
}
