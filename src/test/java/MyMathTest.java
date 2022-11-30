import org.junit.Test;
import org.testing.MyMath;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void ZeroDivisionException(){
      //  should throw ArithmeticException
        MyMath.divide(1,0);
    }
}
