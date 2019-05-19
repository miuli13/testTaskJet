import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class FirstMatchTest extends BaseTest {
    private static MainPage mainPage;
    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        mainPage.visit();
    }

    @ParameterizedTest
    @ValueSource(strings = {"погода", "Липецк", "Лото"})
    void parseFirstMatch(String searchField) {
        mainPage.enterSearchRequest(searchField);
        System.out.println(mainPage.getTextFromFirstMatch());
    }
}
