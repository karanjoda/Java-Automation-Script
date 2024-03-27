package mavenproject.UI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import mavenproject.common.Listeners;


public class GroupDemoTest extends Listeners{

    @BeforeClass
    public void beforeclass() {
        System.out.println("beforeclass");
    }
    
    @AfterClass
    public void afterclass() {
        System.out.println("afterclass");
    }

    @BeforeGroups(value = "regression")
    @Test(groups = "regression")
    public void test1() {
        System.out.println("beforegroup");
    }

    @Test(groups = "regression")
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = { "smoke", "regression" })
    public void test3() {
        System.out.println("test3");
    
    }
@AfterGroups(value = "performance")
    @Test(groups = { "performance", "regression" })
    public void test4() {
        System.out.println("aftergroup");
    }
}
