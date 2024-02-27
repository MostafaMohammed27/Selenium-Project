import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By RegisterButton = By.xpath("//a[@href='/register?returnUrl=%2F']");
    By LoginButton = By.xpath("//a[@href='/login?returnUrl=%2F']");
    WebElement RegisterButtonElement;
    WebElement LoginButtonElement;


    public RegisterPage ClickOnRegisterButton()
    {
        RegisterButtonElement= driver.findElement(RegisterButton);
        click(RegisterButtonElement);
        return new RegisterPage(driver);

    }

    public LoginPage ClickOnLoginButton()
    {
        LoginButtonElement= driver.findElement(LoginButton);
        click(LoginButtonElement);
        return new LoginPage(driver);

    }

}
