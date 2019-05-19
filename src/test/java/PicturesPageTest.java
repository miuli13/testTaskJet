import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PicturesPageTest extends BaseTest {
    private static PicturesPage picturesPage;

    @BeforeEach
    void setUp() {
        picturesPage = new PicturesPage(driver);
        picturesPage.visit();
    }

    @Test
    void picturePageIsCorrect(){
        assertTrue(picturesPage.picturesContainer.isDisplayed());
        assertTrue(picturesPage.picturesMenu.isDisplayed());
    }

}
