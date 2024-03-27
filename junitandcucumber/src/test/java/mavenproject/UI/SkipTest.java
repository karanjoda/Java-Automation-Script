package mavenproject.UI;
import org.testng.SkipException;

import org.testng.annotations.Test;

public class SkipTest {
    
    Boolean setup = true;

    @Test(enabled = true)
    public void skipTest1() {
        System.out.println("skip the test");
    }

  

    @Test
    public void skipTest3() {
        System.out.println("skipping the test based on the condition");
        if (setup==true) {
            System.out.println("execute the test");
        } else {
            System.out.println("don't execute further test");
            throw new SkipException("don't execute further test");
        }
    }
}
