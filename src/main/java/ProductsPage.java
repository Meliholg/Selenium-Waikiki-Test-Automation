import org.bouncycastle.tsp.TSPUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {
    By moreButtonLocator = By.xpath("//*[@id=\"divModels\"]/div[7]/div/div[4]/a");
    By productNameLocator = By.cssSelector("a.a_model_item");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectMore() {
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        click(moreButtonLocator);
    }

    public void selectRandomProduct() {
        System.out.println("toplam ürün: "+getAllProducts().size());
        int size = getAllProducts().size();
        Random rnd = new Random();
        int index = rnd.nextInt(size);
        System.out.println("random:" +index);
        getAllProducts().get(index).click();
    }
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);

    }
}
