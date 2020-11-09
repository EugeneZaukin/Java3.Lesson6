import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestTwo {
    private int[] arrIn;
    private boolean arrOut;

    public TestTwo(int[] arrIn, boolean arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,6,3,4,5,6,7}, false},
                {new int[]{4,4,4,4}, false},
                {new int[]{1,1,1,1,1}, false},
                {new int[]{1,4,1,4,1,1,4}, true}
        });
    }

    private MainTwo mainTwo;
    @Before
    public void prepare() {
        mainTwo = new MainTwo();
    }

    @Test
    public void test() {
        Assert.assertEquals(mainTwo.oneAndFour(arrIn), arrOut);
    }
}
