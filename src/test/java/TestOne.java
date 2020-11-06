import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestOne {
    private int[] arrIn;
    private int[] arrOut;

    public TestOne(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,6,3,4,5,6,7}, new int[]{5,6,7}},
                {new int[]{3,4,5,6,7,4,1,2}, new int[]{1,2}}
        });
    }

    public void testAddThree() {
        Assert.assertArrayEquals(arrOut, mainOne.addArr(arrIn));
    }

    private MainOne mainOne;
    @Before
    public void prepare() {
        mainOne  = new MainOne();
    }

    @Test(expected = RuntimeException.class)
    public void testAddOne() {
        mainOne.addArr(new int[]{3,1,5,6});
    }

    @Test
    public void testAddTwo() {
        Assert.assertArrayEquals(new int[]{2,3,5}, mainOne.addArr(new int[]{4,3,2,4,2,3,5}));
    }
}
