package mavenproject.common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import mavenproject.Utilities.TestUtilities;

public class Listeners implements ITestListener {

    TestUtilities testUtilities = new TestUtilities();

    
    public void onTestStart(ITestResult result) {
        Reporter.log("methodname is "+result.getName());
        System.out.println("Test case is starting");
    }
    public void onTestSucess(ITestResult result){
        Reporter.log("status of execution "+result.getStatus());
    }
  
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed - screenshot captured");
        try {
            testUtilities.getScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
