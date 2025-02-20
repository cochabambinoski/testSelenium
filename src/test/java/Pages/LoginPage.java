package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    By userName = By.xpath("//*[@id='username']");
    By password = By.xpath("//*[@id='password']");
    By loginButton = By.xpath("//*[@class='btn btn-primary']");
    By logoutButton = By.xpath("//a[text()='Logout']");
    By error = By.xpath("//*[@class='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyNotBlank(String username) {
        assertNotEquals("", username);
    }

    public void verifyLogin(String user, String pass) {
        driver.findElement(userName).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
        String logoutb = driver.findElement(logoutButton).getText().trim();
        assertEquals("Logout", logoutb);
    }

    public void verifyError() {
        driver.findElement(logoutButton).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(loginButton).click();
        String errorMessage = driver.findElement(error).getText().trim();
        assertEquals("Error while logging in: please, provide your username.", errorMessage);
    }
}
