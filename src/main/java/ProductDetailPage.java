import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By addToCartLocator = By.id("pd_add_to_cart");
    By priceLocator = By.xpath("//*[@id=\"rightInfoBar\"]/div[1]/div/div[2]/div/div/div/span[2]");
    By sizeLocator = By.xpath("//*[@id=\"option-size\"]/a[1]");
    By cartLocator = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a/i");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    String part1;
    public void AddToCart() {
        click(sizeLocator);
        click(addToCartLocator);
        productPrice = find(priceLocator).getText();
        String[] parts = productPrice.split(" ");
        part1 = parts[0]; //
        //System.out.println("gelen:"+part1);
        click(cartLocator);
    }

}
