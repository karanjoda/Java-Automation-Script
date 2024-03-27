package mavenproject.UI;


import org.testng.annotations.Test;


public class Dataproviderdemotest1 {

    @Test(dataProvider = "create",dataProviderClass = TestData.class)
    public void test(String username,String password) 
    {
       
        System.out.println(username+"===="+password);
    }
    
    @Test(dataProvider = "create",dataProviderClass = TestData.class)
    public void test1(String username,String password,String test) 
    {
       
        System.out.println(username+"===="+password+"===="+test);
    }
    
    @Test(dataProvider = "create",dataProviderClass = TestData.class)
    public void test2(String username,String password,String test) 
    {
       
        System.out.println(username+"===="+password+"===="+test);
    }

}
