import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMatchTest {
    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
    }

    @Test
    void test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.enterSearchRequest("погода");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[contains(@class, 'suggest2__content suggest2__content_theme_normal')]"));


    }

    @AfterAll
    static void cleanUp() {
        driver.quit();
    }
}
