package mavenproject.UI;

// import org.testng.Assert;
// import org.testng.Reporter;
import org.testng.annotations.Test;

import mavenproject.common.BaseTest;

public class ReportsTest extends BaseTest{


    @Test
    public void Report() {
       System.out.println("this is test1");
       driver.get("https://www.ebay.com/");
    //    Assert.assertTrue(false);
    }
}
