package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);

    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath    = "//button[@class='button-1 login-button']")
    WebElement loginbtn;

    @FindBy(linkText = "Logout")
    WebElement logout;

    public void enteremail(String emailaddress) {
        email.sendKeys(emailaddress);
    }

    public void enterpwd(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickonloginbtn() {
        loginbtn.click();
    }

    public void clickonlogout() {
        logout.click();
    }
}