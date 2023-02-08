package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import team_16.utilities.Driver;

public class SignIn {



    public SignIn() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="(//button[text()='Sign In']")
    public WebElement sigInButton;

    @FindBy(xpath = "(//input[@name=\"username\"])[1]")
    public WebElement Username_or_email_address;




























 @FindBy(xpath = "//div[@id='customer_login']")   public WebElement singInSignUpSayfasi;
 @FindBy(xpath = "//a[@class='nav-link active']")   public WebElement singInSecilimi;
    @FindBy(xpath = "//input[@id='password']")   public WebElement password;













}







