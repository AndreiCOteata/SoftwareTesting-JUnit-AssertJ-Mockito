import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class MockCalculator {
    @Mock
    private Calculator calculator;
    @Test
    public void mockCalculatorTest(){
        when(calculator.add(5,3)).thenReturn(123);

        int result = calculator.add(5,3);
        assert result == 123;
    }
}
