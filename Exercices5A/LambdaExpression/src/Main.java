import java.util.Comparator;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Function<Integer, Integer> f1 = (i) -> i+2;

        Function<String, Integer> mf = (str)-> str.length();

        Predicate<Integer> p1 = (x)->(x%2==0);

        Comparator<String> comp = (str1, str2) -> str1.compareTo(str2);

        Comparator<String> compLength = (str1, str2)->str1.length()-str2.length();
    }
}