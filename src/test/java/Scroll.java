import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Scroll {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Selenium Tutorials\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        //find element by ID "name"
        WebElement name = driver.findElement(By.id("name"));
        //move to element
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Diana Prado");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("11/14/2023");

        Thread.sleep(1000);
        driver.quit();
    }

}
