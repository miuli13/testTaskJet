import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class MainPage extends PageObject {

    MainPage(WebDriver driver) {
        super(driver);
        assert searchField.isDisplayed();
    }

    @FindBy(id = "text")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(@class, 'suggest2__content suggest2__content_theme_normal')]/li[1]")
    private WebElement firstMatch;

    void enterSearchRequest(String searchRequest) {
        this.searchField.clear();
        this.searchField.sendKeys(searchRequest);
        assert this.firstMatch.isDisplayed();
    }

    String getTextFromFirstMatch() {
        String result = this.firstMatch.findElement(By.xpath("span[1]")).getText();
        try {
            result = result.concat(" ").concat(" ").concat(this.firstMatch.findElement(By.xpath("span[3]")).getText());
        } catch (NoSuchElementException e) {}
        return result;
    }
}
