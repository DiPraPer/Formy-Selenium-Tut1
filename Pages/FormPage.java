import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm(WebDriver driver) {

        driver.findElement(By.id("first-name")).sendKeys("Name");
        driver.findElement(By.id("last-name")).sendKeys("Last");
        driver.findElement(By.id("job-title")).sendKeys("Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value = '2']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("12/10/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }//end of submitForm
}//end of class
