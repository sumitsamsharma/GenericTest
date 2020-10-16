import org.junit.Assert;
import org.junit.Test;

public class GenericTest
{
    @Test
    public void maxTest()
    {
        Integer[] inputArray={1,2,4,0,9};
        GenericMethod max=new GenericMethod(inputArray);
        Assert.assertEquals(9,max.maximum());
    }


}
