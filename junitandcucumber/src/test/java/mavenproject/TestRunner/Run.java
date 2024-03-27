package mavenproject.TestRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/mavenproject/resource/features/Customers.feature",
    glue = "mavenproject.StepDefinition",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/report.html", // Generate HTML report
        "json:target/cucumber-report.json", // Generate JSON report
        // "rerun:target/failed_scenarios.txt" // Rerun failed scenarios
    },
    monochrome = true
)
public class Run extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider
    public Object[][] scenarios() {
        return super.scenarios();
    }
    // This class can be empty
}
