
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class AssertJtest {
    @Test
    public void testAssertJ(){
        String text = "abc";
        assertThat(text).isEqualTo("abc").contains("a");
        String[] stringArray = {"abc", "cde", "efg"};
        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}
