package mavenproject.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
// import org.testng.ITestResult;

import mavenproject.common.BaseTest;

public class TestUtilities extends BaseTest{

   
    
    public void getScreenshot() throws IOException{

        Date currentDate = new Date();
        String screenshotFilename = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotFilename +".png"));
    }
}
