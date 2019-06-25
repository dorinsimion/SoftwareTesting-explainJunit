import static org.junit.Assert.*;

import org.junit.*;

import java.util.Random;

public class JunitLearningTest {

    // method annotated with BeforeClass/AfterClass should be public static void,no parameters
    //BeforeClass is executed before all tests
    @BeforeClass
    public static void beforeClass(){
        System.out.println("One time, before all tests");
    }

    //method before/after should be public void,no parameters
    //method before execute before each test
    @Before
    public void setUp(){
        System.out.println("Before each test!");
    }

    //test method
    @Test
    public void test_1(){
        //assert keyword, we won't use it when test, it is used by the Junit framework behind
        assert "a".equals("a");
        // assert equals for strings
        assertEquals("ca","capitala".substring(0,2));
        //assert 2 integers are equals
        assertEquals(2,2);
        //assert for double accept a delta parameter
        assertEquals("Doubles not equals!",
                0.2,0.201,0.002);
        //assert result is true
        assertTrue("saaa".contains("s"));
        //assert result is false
        assertFalse(false);
        //assert equals for arrays
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        //assert the parameter is not null
        assertNotNull("saa");
    }

    // test an exception
    @Test(expected = ArithmeticException.class)
    public void test_2(){
        int a=new Random().nextInt(1000);
        int c =a/0;
    }

    //executs after each test
    @After
    public void after(){
        System.out.println("After each test!");
    }

    //execut at the end of all tests
    @AfterClass
    public static void afterClass(){
        System.out.println("One time, after all tests");
    }
}
