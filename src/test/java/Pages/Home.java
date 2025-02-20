package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Home {
    WebDriver driver;
    By Header = By.xpath("//a[text()='Quotes to Scrape']");

    public Home(WebDriver driver) {
        this.driver=driver;
    }

    public void verifyHeader() {
        String getHeaderText=driver.findElement(Header).getText();
        assertEquals("Quotes to Scrape", getHeaderText);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }

}
