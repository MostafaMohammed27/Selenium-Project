import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase{
    private HomePage homepage;
    private LoginPage loginpage;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void validLogin()
    {
        homepage=new HomePage(driver);
        loginpage = homepage.ClickOnLoginButton();
        loginpage.EnterEmail("58e9d571b3c7@drmail.in");
        loginpage.EnterPassword("123456");
        loginpage.ClickOnLoginButton();
        loginpage.ClickOnLogoutButton();
    }
    @Test(priority = 2)
    public void LoginWithInvalidEmail()
    {
        homepage=new HomePage(driver);
        loginpage = homepage.ClickOnLoginButton();
        loginpage.EnterEmail("58e9d571b3@drmail.in");
        loginpage.EnterPassword("123456");
        loginpage.ClickOnLoginButton();
        String Expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String Actual = driver.findElement(By.xpath(
                "//div[@class='message-error validation-summary-errors']")).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        softAssert.assertAll();

    }
    @Test(priority = 3)
    public void LoginWithEmptyEmailField()
    {
        homepage=new HomePage(driver);
        loginpage = homepage.ClickOnLoginButton();
        loginpage.EnterEmail("");
        loginpage.EnterPassword("123456");
        loginpage.ClickOnLoginButton();
        String Expected = "Please enter your email";
        String Actual = driver.findElement(By.xpath("//span[@id='Email-error']")).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        softAssert.assertAll();

    }
    @Test(priority = 4)
    public void LoginWithInvalidPassword()
    {
        homepage=new HomePage(driver);
        loginpage = homepage.ClickOnLoginButton();
        loginpage.EnterEmail("58e9d571b3@drmail.in");
        loginpage.EnterPassword("12345");
        loginpage.ClickOnLoginButton();
        String Expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String Actual = driver.findElement(By.xpath(
                "//div[@class='message-error validation-summary-errors']")).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        softAssert.assertAll();

    }
    @Test(priority = 5)
    public void LoginWithEmptyPasswordField()
    {
        homepage=new HomePage(driver);
        loginpage = homepage.ClickOnLoginButton();
        loginpage.EnterEmail("58e9d571b3@drmail.in");
        loginpage.EnterPassword("");
        loginpage.ClickOnLoginButton();
        String Expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String Actual = driver.findElement(By.xpath(
                "//div[@class='message-error validation-summary-errors']")).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        softAssert.assertAll();

    }

}
