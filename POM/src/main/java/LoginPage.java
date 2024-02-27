import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By Email = By.xpath("//input[@class='email']");
    private WebElement EmailElement;
    private By Password = By.xpath("//input[@class='password']");
    private WebElement PasswordElement;
    private By LoginButton=By.xpath("//button[@class='button-1 login-button']");
    private WebElement LoginButtonElement;
    private By LogoutButton=By.xpath("//a[@class='ico-logout']");
    private WebElement LogoutButtonElement;

    public void EnterEmail(String email)
    {
        EmailElement= driver.findElement(Email);
        SendText(EmailElement,email);

    }
    public void EnterPassword(String password)
    {
        PasswordElement= driver.findElement(Password);
        SendText(PasswordElement,password);

    }

    public void ClickOnLoginButton()
    {
        LoginButtonElement = driver.findElement(LoginButton);
        click(LoginButtonElement);

    }
    public void ClickOnLogoutButton()
    {
        LogoutButtonElement = driver.findElement(LogoutButton);
        click(LogoutButtonElement);

    }

}
