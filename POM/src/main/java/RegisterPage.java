import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By GenderMale = By.xpath("//input[@id='gender-male']");
    private WebElement GenderMaleElement;
    private By GenderFemale = By.xpath("//input[@id='gender-female']");
    private By FirstName =By.xpath("//input[@id='FirstName']");
    private WebElement FirstNameElement ;
    private By LastName =By.xpath("//input[@id='LastName']");
    private WebElement LastNameElement ;
    private By Email =By.xpath("//input[@id='Email']");
    private WebElement EmailElement ;
    private By Password =By.xpath("//input[@id='Password']");
    private WebElement PasswordElement ;
    private  By ConfirmPassword =By.xpath("//input[@id='ConfirmPassword']");
    private WebElement ConfirmPasswordElement ;
    private  By RegisterButton =By.xpath("//button[@id='register-button']");
    private WebElement RegisterButtonElement;

    public void EnterFirstName(String FName)
    {
        FirstNameElement = driver.findElement(FirstName);
        SendText(FirstNameElement,FName);

    }

    public void EnterLastName(String LName)
    {
        LastNameElement = driver.findElement(LastName);
        SendText(LastNameElement,LName);

    }

    public void EnterEmail(String email)
    {
        EmailElement = driver.findElement(Email);
        SendText(EmailElement,email);

    }

    public void EnterPassword(String Pass)
    {
        PasswordElement = driver.findElement(Password);
        SendText(PasswordElement,Pass);


    }

    public void EnterConfirmPassword(String ConPass)
    {
        ConfirmPasswordElement = driver.findElement(ConfirmPassword);
        SendText(ConfirmPasswordElement,ConPass);

    }

    public void ChooseGender()
    {
        GenderMaleElement = driver.findElement(GenderMale);
        click(GenderMaleElement);

    }

    public void ClickOnRegisterButton()
    {
        RegisterButtonElement = driver.findElement(RegisterButton);
        click(RegisterButtonElement);

    }



}
