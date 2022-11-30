import org.junit.Test;
import org.testing.NetworkUtil;

public class NetworkUtilTest {
    @Test(timeout = 1000)
    public void FastConnection(){
        //connection should be faster than 1 sec.
        NetworkUtil.getConnection();
    }
}
