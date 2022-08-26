package AutomatedCreatingAnAccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreatingAccountTest {
    private static WebDriver driver;

    @BeforeEach
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void SignIn() {
    CreatingAccountPage objectsForCreatingAnAccount = new CreatingAccountPage(driver);
    objectsForCreatingAnAccount.SignIn();

    objectsForCreatingAnAccount.AuthPanel();
    objectsForCreatingAnAccount.Form();
    }


}
