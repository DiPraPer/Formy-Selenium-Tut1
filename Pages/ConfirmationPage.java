import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public static void waitForAlertBanner(WebDriver driver) {
        //confirm the form was submitted
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }//end waitforalert
    public static String getAlertBannerText(WebDriver driver){

        return driver.findElement(By.className("alert")).getText();
    }//end getalert

}