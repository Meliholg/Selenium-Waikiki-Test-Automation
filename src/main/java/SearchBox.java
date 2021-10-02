import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search");
    By submitButtonLocator = By.xpath("//*[@id=\"fwds-container\"]/div/div/div/div[1]/a/span");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
    type(searchBoxLocator,text);
    click(submitButtonLocator);
    }
}
