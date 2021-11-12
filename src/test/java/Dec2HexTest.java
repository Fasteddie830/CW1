import org.junit.jupiter.api.Test; //import testing framework thing

public class Dec2HexTest {

    @Test
    public void NullTest(){ //Testing whatever happens if I don't enter a value code expected to stop with an error
        System.out.println("Testing Start");
        System.out.println("Testing empty value");
        Dec2Hex.main(new String[]{});
        System.out.println();
    }

    @Test
    public void StringTest(){ //Testing with a string as input, code expected to stop with an error
        System.out.println("Testing string value");
        Dec2Hex.main(new String[]{"Test"});
        System.out.println();
    }

    @Test
    public void PositiveTest(){ //Testing with a normal integer as input, code is expected to run
        System.out.println("Testing positive int value");
        Dec2Hex.main(new String[]{"4"});
        System.out.println();
    }

    @Test
    public void NegativeTest(){ //Testing with a negative integer as input, code expected to stop with an error
        System.out.println("Testing negative value");
        Dec2Hex.main(new String[]{"-4"});
        System.out.println();
    }

    @Test
    public void BigTest(){  // with a normal bigger integer as input, code is expected to run
        System.out.println("Testing bigger value");
        Dec2Hex.main(new String[]{"10000"});
        System.out.println();
    }

}