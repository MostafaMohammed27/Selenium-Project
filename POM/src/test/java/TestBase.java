import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void setup()
    {
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }



//    @AfterTest
//    public void Quit()
//    {
//        driver.quit();
//
//    }
}
