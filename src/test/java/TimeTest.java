import org.junit.Test;

public class TimeTest {
    @Test
    public void helloTest(){
        //given
        Time time = new Time();
        //when
        String s = time.sayHello(5);
        //then
        assert s.equals("Good Morning!");
    }
    @Test
    public void helloTest2(){
        //given
        Time time = new Time();
        //when
        String s = time.sayHello(13);
        //then
        assert s.equals("Good evening!");
    }
}
