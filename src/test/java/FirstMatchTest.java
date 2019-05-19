import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class FirstMatchTest {
    private static WebDriver driver;
    private static MainPage mainPage;
    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
        mainPage = new MainPage(driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"погода", "Липецк", "Лото"})
    void parseFirstMatch(String searchField) {
        mainPage.enterSearchRequest(searchField);
        System.out.println(mainPage.getTextFromFirstMatch());
    }

    @AfterAll
    static void cleanUp() {
        driver.quit();
    }
}
