import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    private HomePage homepage;

    private RegisterPage registerPage ;
    SoftAssert softassert = new SoftAssert();

    @Test(priority = 1)
    public void ValidRegister()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("5cd12ca868bd@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="Your registration completed";
        String Actual=driver.findElement(By.xpath("//div[@class='result']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']")).click();
        softassert.assertAll();
    }
    
    @Test(priority = 2)
    public void RegisterWithExistedEmail()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("5cd12ca868bd@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="The specified email already exists";
        String Actual=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority = 3)
    public void RegisterWithinvalidconfirmpassword()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("0c3f40c9681a@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("12345");
        registerPage.ClickOnRegisterButton();
        String Expected ="The password and confirmation password do not match";
        String Actual=driver.findElement(By.xpath("//span[@id='ConfirmPassword-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority =4 )
    public void RegisterWithEmptyFirstNameField()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("0c3f40c9681a@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="First name is required.";
        String Actual=driver.findElement(By.xpath("//span[@id='FirstName-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority =5)
    public void RegisterWithEmptyLastNameField()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("");
        registerPage.EnterEmail("0c3f40c9681a@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="Last name is required.";
        String Actual=driver.findElement(By.xpath("//span[@id='LastName-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority =6 )
    public void RegisterWithEmptyEmailField()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="Email is required.";
        String Actual=driver.findElement(By.xpath("//span[@id='Email-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority =7 )
    public void RegisterWithEmptyPasswordField()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("0c3f40c9681a@drmail.in");
        registerPage.EnterPassword("");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        String Expected ="The password and confirmation password do not match";
        String Actual=driver.findElement(By.xpath("//span[@id='ConfirmPassword-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority =8 )
    public void RegisterWithEmptyConfirmPasswordField()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("Mostafa");
        registerPage.EnterLastName("Muhammad");
        registerPage.EnterEmail("0c3f40c9681a@drmail.in");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("");
        registerPage.ClickOnRegisterButton();
        String Expected ="Password is required.";
        String Actual=driver.findElement(By.xpath("//span[@id='ConfirmPassword-error']")).getText();
        softassert.assertTrue(Actual.contains(Expected));
        softassert.assertAll();
    }
    @Test(priority = 9)
    public void RegisterWithEmptyFields()
    {
        homepage=new HomePage(driver);
        registerPage = homepage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("");
        registerPage.EnterLastName("");
        registerPage.EnterEmail("");
        registerPage.EnterPassword("");
        registerPage.EnterConfirmPassword("");
        registerPage.ClickOnRegisterButton();
        String Expected1 ="First name is required.";
        String Actual1=driver.findElement(By.xpath("//span[@id='FirstName-error']")).getText();
        String Expected2 ="Last name is required.";
        String Actual2=driver.findElement(By.xpath("//span[@id='LastName-error']")).getText();
        String Expected3 ="Email is required.";
        String Actual3=driver.findElement(By.xpath("//span[@id='Email-error']")).getText();
        String Expected4 ="Password is required.";
        String Actual4=driver.findElement(By.xpath("//span[@id='Password-error']")).getText();
        String Expected5 ="Password is required.";
        String Actual5=driver.findElement(By.xpath("//span[@id='ConfirmPassword-error']")).getText();
        softassert.assertTrue(Actual1.contains(Expected1));
        softassert.assertTrue(Actual2.contains(Expected2));
        softassert.assertTrue(Actual3.contains(Expected3));
        softassert.assertTrue(Actual4.contains(Expected4));
        softassert.assertTrue(Actual5.contains(Expected5));
        softassert.assertAll();
    }


}
