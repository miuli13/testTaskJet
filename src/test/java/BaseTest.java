import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class BaseTest {
    static WebDriver driver;
    static Properties properties = new Properties();
    static FileInputStream fis;

    @BeforeAll
    static void setUpAll() {
        try{
            fis = new FileInputStream("src/main/resources/properties.properties");
            properties.load(fis);
            System.setProperty("webdriver.chrome.driver", properties.getProperty("pathToChromium"));
            driver = new ChromeDriver();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    static void cleanUp() {
        driver.quit();
    }
}
