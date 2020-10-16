import org.junit.Assert;
import org.junit.Test;

public class GenericTest
{
    @Test
    public void maxTest()
    {
        GenericMethod max=new GenericMethod(7.5,6.5,5.5);
        Assert.assertEquals(7.5,max.maxValue());
    }


}
