package SearchInputAndReservationTest;

import AutomatedCreatingAnAccount.CreatingAccountPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchInputTest {
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
    public void SearchByName() {
        MethodsForSearchTest methodsForSearchTest = new MethodsForSearchTest(driver);
        CreatingAccountPage creatingAccountPage = new CreatingAccountPage(driver);
        creatingAccountPage.SignIn();
        methodsForSearchTest.LogIn();
        methodsForSearchTest.Home();
        methodsForSearchTest.SearchingHotel();
        methodsForSearchTest.Booking();
    }




}
