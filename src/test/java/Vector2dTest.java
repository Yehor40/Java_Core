import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testing.Vector2d;

public class Vector2dTest {
    private final double  eps = 1e-6;
    private static Vector2d v1;
    @BeforeClass
    public static void createNewVector(){
        v1=new Vector2d();
    }
    @Test
    public  void LenghtShoulsBeZero(){
        //length should be zero
        Assert.assertEquals(0,v1.lenght(),eps);
    }
    @Test
    public void ZeroX(){
        //x should be zero
        Assert.assertEquals(0,v1.getX(),eps);
    }
    @Test
    public void ZeroY(){
        //y should be zero
        Assert.assertEquals(0,v1.getY(),eps);
    }

}
