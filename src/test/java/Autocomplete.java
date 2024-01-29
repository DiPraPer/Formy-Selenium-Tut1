import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Autocomplete {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Selenium Tutorials\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://geo-devrel-javascript-samples.web.app/samples/places-autocomplete-addressform/app/dist/");
		/*Number of Frames on a Frame1
        int countIframesInFrame1 =driver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames inside the Frame1:"+countIframesInFrame1);*/

        WebElement autocomplete = driver.findElement(By.id("ship-address"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //sleep to give test some time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //click on the auto complete result
        //WebElement autocompleteResult = driver.findElement(By.className("pac-matched"));
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();
        //quit
        driver.quit();
    }

}