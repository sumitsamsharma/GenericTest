import org.junit.Assert;
import org.junit.Test;

public class GenericTest
{
    @Test
    public void maximumTest(){
        Integer x= 5, y=6, z=7;
        GenericMethod max=new GenericMethod();
        Assert.assertEquals(7,max.maxInt(x,y,z));
    }

}
