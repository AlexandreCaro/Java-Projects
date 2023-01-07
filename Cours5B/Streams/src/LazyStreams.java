import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.stream.Stream;

public class LazyStreams {

    public static void main(String[] args) throws IOException {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
        Stream<Integer> s2 = s1.map((i)->{
            System.out.println(i);
            return i+1;
        });
        Object[] a = s2.toArray(); // {1,2,3,4,5}

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = stream1.map((i)->{
            System.out.println(i);
            return i+1;
        });
        stream2.forEach(System.out::println);


        Stream<Integer> streams1 = Stream.of(1,2,3,4,5);
        Stream<Integer> streams2 = streams1.map((i)->{
            System.out.println(i);
            return i+1;
        });
        int n = streams2.findFirst().get(); // get first element(2) of stream

        Stream<String> stream = Files.lines(Paths.get("somefile.txt"));
        // returns a Stream<String>where each element is a line from
        // the file

        stream.map(String::toUpperCase).forEach(System.out::println);

    }


}
