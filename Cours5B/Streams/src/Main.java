import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        BiFunction<String, Integer, PrintStream> f = (s, i) -> System.out.format(s, i);
        BiFunction<String, Integer, PrintStream> f1 = System.out::format;

        Stream<Integer> stream = Stream.of("Hello", "World").map((s)->s.length());
        Stream<Integer> streamBis = Stream.of("Hello", "World").map(String::length);

        Stream<Account> streamAccount = Stream.of(1,2,3,4,5).map((i)->new Account(i));
        Stream<Account> streamAccount1 = Stream.of(1,2,3,4,5).map(Account::new);

        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5);
        int n = streamInteger.reduce(0, Integer::sum);

        Stream<Account> a = Stream.of(100,200,300) // Creates a Stream<Integer>
                .map((i)->i*1.05) // Returns a Stream<Double>
                .mapToInt(Double::intValue) // Returns an IntStream
                .mapToObj(Account::new); // Returns a Stream with new Account objects
    }
}