import org.junit.Test;
import static org.junit.Assert.*;

public class TestSuite {

    @Test
    public void test(){
        char[] in = new char[]{};

        int offset = 3;
        int len = 2;

        BigDecimal.parseExp(in, offset, len);
    }
}
