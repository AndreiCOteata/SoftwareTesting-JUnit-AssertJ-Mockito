import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }
    @Parameterized.Parameter()
    public int x;
    @Parameterized.Parameter(1)
    public int y;
    @Parameterized.Parameter(2)
    public int expectedvalue;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator;

    @BeforeClass
    public static void sendMessage(){
        System.out.println("Tests will begin!");
    }
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @After
    public void testResult(){
        System.out.println("Test resulted ok!");
    }
    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Test Ended");
    }
    @Test
    public void testMultiply(){
        //given
        //when
        int mul = calculator.multiply(3,4);
        //then
        assert mul==12;
    }
    @Test
    public void testAdd(){
        //given
        //when
        int sum = calculator.add(x,y);
        //then
        System.out.println("Bravo man, iti da " + sum + "!");
        assert sum == expectedvalue;
    }
    @Test
    public void substractTest(){
        //given
        //when
        int sub = calculator.substract(-2,3);
        //then
        System.out.println("Bravo man, iti da " + sub + "!");
        assert sub==-5;
    }
    @Test //(expected = ArithmeticException.class)
    public void divideTest() {
        //given
        //when
        int result = calculator.divide(4, 0);
        //then
    }
    @Test
    public void divideTest2(){
        //given
        //when
        int result = calculator.divide(5,2);
        //then
        assert result == 2;
    }
    @Test
    public void divideNBy0WithMessage(){
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        calculator.divide(4,0);

    }
}
