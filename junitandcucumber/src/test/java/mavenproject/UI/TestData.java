package mavenproject.UI;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestData 
{
    @DataProvider(name = "create")
    public static Object[][] dataset1(Method m) 
    {
        Object[][] testdata = null;
        if(m.getName().equals("test"))
        {
            testdata = new Object[][]
            {
             {"username","password",},
             {"username1","password1"},
             {"username2","password2"},
             {"username3","password3"}
        
            };
        }
    
        else if(m.getName().equals("test1"))
        {
            testdata = new Object[][]
            {
              {"username","password","second"},
              {"username1","password1","second2"},
              {"username2","password2","second3"},
              {"username3","password3","second4"}
            };
        }

        else if(m.getName().equals("test2"))
        {
            testdata = new Object[][]
            {
              {"username","password","third"},
              {"username1","password1","third2"},
              {"username2","password2","third3"},
              {"username3","password3","third4"}
            };
        }
        return testdata;
    }
}
    
