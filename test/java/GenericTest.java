import org.junit.Assert;
import org.junit.Test;

public class GenericTest
{
    @Test
    public void maxIntTest(){
        Integer x= 5, y=6, z=7;
        GenericMethod max=new GenericMethod();
        Assert.assertEquals(7,max.maxInt(x,y,z));
    }
    @Test
    public void maxFloatTest(){

        GenericMethod max1=new GenericMethod();
        Assert.assertEquals(7.1f,max1.maxFloat(6.5f,6.7f,7.1f),0.0f);
    }


}
