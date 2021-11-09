import junit.framework.TestCase;
import org.junit.Test;

public class Dec2HexTest extends TestCase {

    @Test
    public void StringTest(){
       Dec2Hex.main(new String[] {"String"});
    }

    @Test
    public void NullTest(){
        Dec2Hex.main(new String[]{});
    }

    @Test
    public void PositiveTest(){
        Dec2Hex.main(new String[]{"1"});
    }

}