import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{

    MainPage(WebDriver driver){
        super(driver);
        assert searchField.isEnabled();
    }

    @FindBy(id = "text")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(@class, 'suggest2__content suggest2__content_theme_normal')]/li[1]")
    private WebElement firstMatch;

    public void enterSearchRequest(String searchRequest){
        this.searchField.clear();
        this.searchField.sendKeys(searchRequest);
        assert firstMatch.isDisplayed();
    }

    public String getTextFromFirstMatch(){
        this.firstMatch.findElement(By.xpath("span[1]"));
        //todo
        return null;
    }
}
