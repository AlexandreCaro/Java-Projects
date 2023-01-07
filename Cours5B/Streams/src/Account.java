import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Account {
    private int value;
    public Account(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) {

        // Create streams from values

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Account> stream2 = Stream.of(new Account(100), new Account(200));

        // Create a stream from an array.
        double[] a = new double[]{1.0, 2.0, 3.0};
        DoubleStream stream3 = Arrays.stream(a);

        // Create a stream from a list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3); list.add(4);

        Stream<Integer> stream4 = list.stream();

        // Working with Streams

        Stream<Integer> streams1 = Stream.of(1,2,3,4,5);

        // Apply function on each element
        Stream<Integer> mappedStream = streams1.map((i)->i+1);

        // filter elements
        Stream<Integer> filteredStream = mappedStream.filter((i)->i<4);

        // sort stream
        Stream<Integer> sortedStream = filteredStream.sorted();

        // Transfrom object stream into IntStream
        Stream<Account> streams2 = Stream.of(new Account(100), new Account(200));
        IntStream intStream = streams2.mapToInt((b)->b.getValue());

        Stream<String> stream = Stream.of("Hello", "World");
        stream.forEach((s)-> System.out.println(s));

        stream.forEach(System.out::println);
        // Reduce
        Stream<Integer> streamInt = Stream.of(1,2,3,4,5);
        int result = streamInt.reduce(0, (b, c)->b+c);


    }

}
