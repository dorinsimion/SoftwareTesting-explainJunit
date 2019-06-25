import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
//parameterized tests
//should have this annotation at the class level
@RunWith(Parameterized.class)
public class JunitParamersTest {

    // one field for each parameter
    private int x1;
    private int x2;
    private int sum;

    //constructor to assign each field
    public JunitParamersTest(int x1, int x2, int sum) {
        this.x1 = x1;
        this.x2 = x2;
        this.sum = sum;
    }

    //here we provide values for parameters
    @Parameters
    public static Collection<Integer[]> data() {
        Integer[][] array = {{2, 3, 5}, {2, 4, 6}, {1, 1, 2}};
        return Arrays.asList(array);
    }

    //test, we use fields which are parameterized.
    @Test
    public void test(){
        Assert.assertEquals(sum,x1+x2);
    }
}
