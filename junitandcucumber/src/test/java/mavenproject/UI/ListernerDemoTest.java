package mavenproject.UI;

// import org.testng.Assert;
import org.testng.annotations.Test;

// import org.testng.annotations.Test;
// import mavenproject.common.Retry; // Corrected import statement
import mavenproject.common.BaseTest;

public class ListernerDemoTest extends BaseTest {
    
    // @Test(retryAnalyzer = Retry.class) // Corrected package name
    @Test
    public void launch() {
        driver.get("https://www.facebook.com/"); // Corrected URL
        // Assert.assertTrue(false);
    }
}
