import junit.framework.TestCase;
import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void NullTest(){
        System.out.println("Testing Begins");
        System.out.println("Testing empty value");
        Dec2Hex.main(new String[]{});
        System.out.println();
    }

    @Test
    public void StringTest(){
        System.out.println("Testing string value");
        Dec2Hex.main(new String[]{"Test"});
        System.out.println();
    }

    @Test
    public void PositiveTest(){
        System.out.println("Testing positive int value");
        Dec2Hex.main(new String[]{"4"});
        System.out.println();
    }

    @Test
    public void NegativeTest(){
        System.out.println("Testing negative value");
        Dec2Hex.main(new String[]{"-4"});
        System.out.println();
    }

    @Test
    public void BigTest(){
        System.out.println("Testing bigger value");
        Dec2Hex.main(new String[]{"10000"});
        System.out.println();
    }

}