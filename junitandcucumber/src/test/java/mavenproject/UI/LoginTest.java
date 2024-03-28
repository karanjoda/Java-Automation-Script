package mavenproject.UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {

    @BeforeTest
    public void setUp()
    {
      System.out.println("the browser is up and running");
    }

    @AfterTest
    public void closeBrowser()
    {
        System.out.println("browser is closed");
    }

    @BeforeMethod
    public void connectfromdb()
    {
     System.out.println("db is connected");
    }

    @AfterMethod
    public void disconnectedfromdb()
    {
        System.out.println("db is disconnected");
    }

    @Test(priority = 2)
    public void Test2()
    {
        System.out.println("test2");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("test1");
    }

}
