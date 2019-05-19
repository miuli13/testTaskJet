import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class PageObject {
    WebDriver driver;

    PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}