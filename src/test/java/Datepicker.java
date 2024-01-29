import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Selenium Tutorials\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");


        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("12/10/2023");
        Thread.sleep(1000);
        //closes the date picker by hitting return/enter key
        datePicker.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        driver.quit();
    }
}
