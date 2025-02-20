package Tests;
import Pages.Home;

import static org.junit.Assert.assertEquals;

import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    private WebDriver driver;
    private Home home;
    private LoginPage loginPage;

    // Credentials
    private final String user = "admin";
    private final String password = "admin";


    @Before
        public void startTest() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://quotes.toscrape.com/");
            home = new Home(driver);
            loginPage = new LoginPage(driver);
        }

        @Test
        public void test1Home() {
            home.verifyHeader();
            home.clickLogin();
        }

        @Test
        public void test2Login() {
            home.clickLogin();
            loginPage.verifyNotBlank(user);
            loginPage.verifyLogin(user,password);
            loginPage.verifyError();
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }


}
