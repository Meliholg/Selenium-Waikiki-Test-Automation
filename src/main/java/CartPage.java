import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CartPage extends BasePage {

    By addCartQuantity = By.cssSelector("[id*=Cart_AddQuantity]");
    By quantityLocator = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div/input");
    By trashButtonLocator = By.cssSelector("[title=Sil]");

    By cartEmptyText = By.cssSelector(".cart-empty-title");
    By cartPriceLocator = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span");
    ProductDetailPage productDetailPage = new ProductDetailPage(driver);
    String part2;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void upQuantity() {
    click(addCartQuantity);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void cleanCart() {
        click(trashButtonLocator);
    }

    public boolean isQuantityRight() {
        String asd = find(quantityLocator).getAttribute("value");
        //System.out.println(asd);
    if (asd.equals("2")){
        return true;
    }else{
        return false;
    }
    }

    public boolean isCartClean() {
    return isDisplayed(cartEmptyText);
    }

    public boolean isPriceRight(String part1) {
        String cartPrice = find(cartPriceLocator).getText();
        String[] parts = cartPrice.split(" ");
        part2 = parts[0]; //
        //System.out.println("giden:" + part2);

        if (part1.equals(part2)){
            return true;}else{
            return false;

        }
    }
}
