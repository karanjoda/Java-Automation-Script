package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {
    WebDriver ldriver;

    public AddNewCustomerPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    

    @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement lnkCustomers_menu;

    @FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
    WebElement lnkCustomer_Item;

    @FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a")
    WebElement Addnewbtn;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "FirstName")
    WebElement firstname;

    @FindBy(id = "LastName")
    WebElement lastname;

    @FindBy(id = "Gender_Male")
    WebElement male;

    @FindBy(id = "Gender_Female")
    WebElement female;

    // customer role is not dropdown
    @FindBy(xpath = "(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[2]")
    WebElement customerroles;

    // @FindBy(xpath = "//li[contains(text(),'Guests')]")
    // WebElement listitemguest;

    // @FindBy(xpath = "//li[contains(text(),'Administrators')]")
    // WebElement listItemAdministrators;

    // @FindBy(xpath = "//li[contains(text(),'Registered')]")
    // WebElement listItemRegistered;

    // @FindBy(xpath = "//li[contains(text(),'Vendors')]")
    // WebElement listItemVendors;

    /// vendor id

    @FindBy(xpath = "//*[@id='VendorId']")
    WebElement dropdownvenmgr;

    @FindBy(id = "Active")
    WebElement activecheckbox;

    // actions method of web elements
    @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement dob;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement txtCompanyname;

    @FindBy(xpath = "//textarea[@id='AdminComment']")
    WebElement txtadmincomments;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement savebutton;

    public String getPageTitle() {
        return ldriver.getTitle();
    }

    public void clickoncustomersmenu() {
        lnkCustomers_menu.click();
    }

    public void clickoncustomeitem() {
        lnkCustomer_Item.click();
    }

    public void clickonaddnewbutton() {
        Addnewbtn.click();
    }

    public void enteremail(String emailaddress) {
        email.sendKeys(emailaddress);
    }

    public void enterpassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void click_the_save_button() {
        savebutton.click();
    }

    public void enterfirstname(String fname) {
        firstname.sendKeys(fname);
    }

    public void enterlastname(String lname) {
        lastname.sendKeys(lname);
    }

    public void enterdob(String DOB) {
        dob.sendKeys(DOB);
    }

    public void entercname(String Cname) {
        txtCompanyname.sendKeys(Cname);
    }

    public void entercomments(String comments) {
        txtadmincomments.sendKeys(comments);
    }

    public void selectactivecheckbox(String checkbox) {
        activecheckbox.click();
    }

    ///// dropdown
    public void enterdropdownvenmgr(String value) {
        Select drp = new Select(dropdownvenmgr);
        drp.selectByVisibleText(value);
    }

    public void entergender(String gender) {
        if (gender.equals("Male")) {
            male.click();
        } else if (gender.equals("Female")) {
            female.click();
        } else {
            male.click();
        }
    }

   public void selectFromMultiSelectDropdown(String optionText) {
    // Click on the multi-select dropdown to open the options
    customerroles.click();

    // Locate and click the desired option
    WebElement option = ldriver.findElement(By.xpath("//li[contains(text(),"+optionText+")]"));
    option.click();
}

    public void savebutton() {
        savebutton.click();
    }

}
