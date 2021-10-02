import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage extends BasePage {
    public ModalPage(WebDriver driver) {
        super(driver);
    }

    By deleteButtonLocator = By.xpath("//a[normalize-space()='Sil']");


    public void sure() {
        //String asds = driver.findElement(By.cssSelector("div[role='document'] div[class='modal-body']")).getText();
        //System.out.println(asds);
        click(deleteButtonLocator);
       // new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());

    }
}
