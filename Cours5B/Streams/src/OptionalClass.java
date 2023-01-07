import java.util.stream.Stream;
import java.util.Optional;

public class OptionalClass {

    public static String someMethod(){
        return "";
    }

    public static void main(String[] args) {
        Optional<String> s = Optional.of(someMethod());
        s = s.map(String::toUpperCase);

        s = s.map((t)->t+"/");

        String name = s.orElse("empty");

    }
}
