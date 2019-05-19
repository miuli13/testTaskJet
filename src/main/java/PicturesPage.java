import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PicturesPage extends MainPage{
    private final String uri = "https://yandex.ru/images/";

    @FindBy(className = "collections-menu")
    WebElement picturesMenu;

    @FindBy(className = "cl-masonry-wrap__container")
    WebElement picturesContainer;

    PicturesPage(WebDriver driver) {
        super(driver);
    }

    public PicturesPage visit(){
        driver.get(this.uri);
        return this;
    }
}
