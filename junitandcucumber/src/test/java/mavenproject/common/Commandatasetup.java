package mavenproject.common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commandatasetup {
    
    @BeforeSuite
    public void datasetup()
    {
        System.out.println("comman data setup");
    }

    @AfterSuite
    public void datateardown()
    {
        System.out.println("comman data cleanup");
    }
}
