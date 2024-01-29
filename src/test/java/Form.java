import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Selenium Tutorials\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        //Methods
        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));
        driver.quit();
    }
}