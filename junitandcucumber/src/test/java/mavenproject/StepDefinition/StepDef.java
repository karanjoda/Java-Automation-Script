package mavenproject.StepDefinition;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDef {

    public WebDriver driver;
    public LoginPage loginpg;
    public AddNewCustomerPage addNewCustomerPage;
    public SearchCustomerPage searchCustomerPage;

    @Given("user launch chrome browser")
    public void launchChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginpg = new LoginPage(driver);
        addNewCustomerPage = new AddNewCustomerPage(driver);
        searchCustomerPage  = new SearchCustomerPage(driver);
        driver.manage().window().maximize();

    }

    @When("User opens URL {string}")
    public void openURL(String url) {
        driver.get(url);

    }

    @When("User enters Email as {string} and password as {string}")
    public void enterCredentials(String emailaddress, String password) {
        loginpg.enteremail(emailaddress);
        loginpg.enterpwd(password);
    }

    @When("Click on Login")
    public void clickLogin() {
        loginpg.clickonloginbtn();
    }

    @When("User click on Logout link")
    public void clickonLogout() {
        loginpg.clickonlogout();
    }

    @Then("close browser")
    public void closeBrowser() {
        driver.quit();
    }
    ///////// add new customer///////

    @Then("user can view Dashboard")
    public void user_can_view_dashboard() {
        String actualTitle = addNewCustomerPage.getPageTitle();
        String expectedTitle = "Dashboard / nopCommerce administration";
        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard page title mismatch");
    }
    
    @When("User Click on the Customers Menu")
    public void user_click_on_the_customers_menu() {
        addNewCustomerPage.clickoncustomersmenu();
    }

    @When("Click on the Customers Item")
    public void click_on_the_customers_item() {
        addNewCustomerPage.clickoncustomeitem();
    }

    @When("click on the add new Button")
    public void click_on_the_add_new_button() {
        addNewCustomerPage.clickonaddnewbutton();
    }

    @Then("user can view add new customer page")
    public void user_can_view_add_new_customer_page() {
        String actualTitle = addNewCustomerPage.getPageTitle();
        String expectedTitle = "Add a new customer / nopCommerce administration";
        Assert.assertEquals(actualTitle, expectedTitle, "Add new customer page title mismatch");
    }

    @When("User Enter the Customer info")
    public void user_enter_the_customer_info() {
        addNewCustomerPage.enteremail("karansharmaa@gmail.com");
        addNewCustomerPage.enterpassword("password");
        addNewCustomerPage.enterfirstname("karan");
        addNewCustomerPage.enterlastname("chetty");
        addNewCustomerPage.entergender("Male");
        addNewCustomerPage.enterdob("3/30/2008");
        addNewCustomerPage.entercname("karanchetty");
        addNewCustomerPage.selectFromMultiSelectDropdown("Guests");
        addNewCustomerPage.enterdropdownvenmgr("Vendor 2");
        addNewCustomerPage.entercomments("hello Its good to see you back to in Business");
    }

    @When("click the save Button")
    public void click_the_save_button() {
        addNewCustomerPage.click_the_save_button();
    }

    // @Then("User can view confirmation message {string}")
    // public void user_can_view_confirmation_message(String expectedConfirmationmsg) {
    //     String bodyTagText = driver.findElement(By.tagName("Body")).getText();
	// 	if(bodyTagText.contains(expectedConfirmationmsg))
	// 	{
	// 		Assert.assertTrue(true);//pass
	// 		log.info("User can view confirmation message - passed");

	// 	}
	// 	else
	// 	{
	// 		log.warn("User can view confirmation message - failed");

	// 		Assert.assertTrue(false);//fail

	// 	}
    // }
    @When("user Enter the Customer companyname")
public void user_enter_the_customer_companyname() {
    searchCustomerPage.entercompanyname("karanchetty");
}

@When("click the Search Button")
public void click_the_search_button() {
    searchCustomerPage.clicksearchbtn();

}
}
