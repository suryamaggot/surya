import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitter_automasion {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver,2);
        driver.get("https://en-gb.facebook.com/login/");
        WebElement Id = driver.findElement(By.id("email"));
        Id.sendKeys("abdurrahmansholeh13@yahoo.co.id");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("psychosocial");
        WebElement login = driver.findElement(By.id("loginbutton"));
        login.click();


    }
}
