package AutomatedCreatingAnAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CreatingAccountPage {
    private static WebDriver driver;

    public CreatingAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SignIn() {
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span"));
        signIn.click();
    }


   public int randomNumb() {
       Random random = new Random();
       int randInt = random.nextInt(1000000);
       return randInt;
   }
    public void AuthPanel() {
        WebElement emailAddres = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        emailAddres.sendKeys(randomNumb() + "jurekOgureek@gmail.com");
        createAccountButton.click();
    }

    public void Form() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        title.click();
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstName.sendKeys("Jurek");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastName.sendKeys("Korniszon");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("12345");
        WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        register.click();
    }
}
