package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
    WebDriver ldriver;
    public SearchCustomerPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }


     @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement lnkCustomers_menu;

    @FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
    WebElement lnkCustomer_Item;

    @FindBy(xpath = "//input[@id='SearchCompany']")
    WebElement companyinputbox;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement searchbutton;

    public void clickcustomermenu(){
        lnkCustomers_menu.click();
    }

    public void clickcustomeritem(){
        lnkCustomer_Item.click();
    }

    public void entercompanyname(String value){
        companyinputbox.sendKeys(value);
    }

    public void clicksearchbtn(){
        searchbutton.click();
    }
}

