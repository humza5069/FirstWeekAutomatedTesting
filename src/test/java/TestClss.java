
import org.junit.*;

public class TestClss {

    @BeforeClass
    public static void init(){
        System.out.println("init");
    }

    @Before
    public void setUp(){
        System.out.println("Set up");
    }

    @Test
    public void helloWorld(){
        System.out.println("Hello World");
    }

    @After
    public void tearDown(){
        System.out.println("Tear Down");
    }

    @AfterClass
    public static void destroy(){
        System.out.println("Destroy");
    }

}
