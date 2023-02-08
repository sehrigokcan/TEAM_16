package team_16.tests.us11;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class US_11 {
    HomePage homePage = new HomePage();
    SignIn signIn= new SignIn();
    MyAccount myAccount= new MyAccount();

    @BeforeTest
    public void init() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("sehri_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("sehri_password"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(5);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);
    }
    @Test
    public void TC_01() {
        assert myAccount.myAccountSayfasi.isDisplayed();

    }

    @Test
    public void TC_02() {
        assert myAccount.orders.isDisplayed();

    }

    @Test
    public void TC_03() {
        assert myAccount.downloads.isDisplayed();

    }


    @Test
    public void TC_04() {
        assert myAccount.adresses.isDisplayed();

    }

    @Test
    public void TC_05() {
        assert myAccount.accountDetails.isDisplayed();

    }

    @Test
    public void TC_06() {
        assert myAccount.wishList.isDisplayed();

    }

    @Test
    public void TC_07() {
        assert myAccount.logOut.isDisplayed();

    }

    @Test
    public void TC_08() {
        assert myAccount.storeManager.isDisplayed();

    }

    @Test
    public void TC_09() {
        assert myAccount.orders2.isDisplayed();

    }

    @Test
    public void TC_10() {
        assert myAccount.downloads2.isDisplayed();

    }

    @Test
    public void TC_11() {
        assert myAccount.adresses2.isDisplayed();

    }

    @Test
    public void TC_12() {
        assert myAccount.accountDetails2.isDisplayed();

    }

    @Test
    public void TC_13() {
        assert myAccount.wishList2.isDisplayed();

    }

    @Test
    public void TC_14() {
        assert myAccount.supportTickets.isDisplayed();

    }

    @Test
    public void TC_15() {
        assert myAccount.followings.isDisplayed();

    }

    @Test
    public void TC_16() {
        assert myAccount.logOut2.isDisplayed();

    }

    @AfterTest
    public void destroy() throws IOException {
        ReusableMethods.scrollDownActions();
        ReusableMethods.getScreenshot("EkranGoruntusu");
        Driver.closeDriver();

    }
}
