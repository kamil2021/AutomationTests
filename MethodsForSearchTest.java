package SearchInputAndReservationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsForSearchTest {

    private static WebDriver driver;

    public MethodsForSearchTest(WebDriver driver) {
        this.driver = driver;
    }

    public void LogIn() {
        WebElement emaillAddres = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emaillAddres.sendKeys("974757jurekOgureek@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("12345");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
        signIn.click();
    }

    public void Home() {
        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
        homeButton.click();
    }

    public void SearchingHotel() {
        WebElement hotelLocationInput = driver.findElement(By.xpath("//*[@id=\"hotel_location\"]"));
        hotelLocationInput.sendKeys("Poland");
        WebElement selectHotelDropDown = driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/button/span[2]/i"));
        selectHotelDropDown.click();
        WebElement selectHotelInput = driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li"));
        selectHotelInput.click();
        WebElement checkInDate = driver.findElement(By.xpath("//*[@id=\"check_in_time\"]"));
        checkInDate.sendKeys("26-08-2022");
        WebElement checkoutDate = driver.findElement(By.xpath("//*[@id=\"check_out_time\"]"));
        checkoutDate.sendKeys("25-09-2022");
        WebElement searchNowButton = driver.findElement(By.xpath("//*[@id=\"search_room_submit\"]/span"));
        searchNowButton.click();
    }

    public void Booking() {
        WebElement bookNow = driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a/span"));
        bookNow.click();
        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/a/span"));
        proceedToCheckout.click();

    }




}
