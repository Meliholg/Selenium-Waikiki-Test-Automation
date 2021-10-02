import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class HomePage extends BasePage {
    SearchBox searchBox;
    By loginButtonLocator = By.xpath("//*[@id=\"header-user-section\"]/div");
    By homepageLocator = By.xpath("//*[@id=\"navbar-lcw-groups\"]/div[3]/div/a[1]/span");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isOnHomepage() {
    return isDisplayed(homepageLocator);
            }

    public void selectLogin() {
        click(loginButtonLocator);
    }
}
