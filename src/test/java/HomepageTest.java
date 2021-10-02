import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class HomepageTest extends BaseTest{

    HomePage homepage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    ModalPage modalPage;

    @Test
    @Order(1)
    public void homepage_start(){
        homepage = new HomePage(driver);

        Assertions.assertTrue(homepage.isOnHomepage(), "Not on a Home Page");
        homepage.selectLogin();
    }
    @Test
    @Order(2)
    public void login() {
        loginPage = new LoginPage(driver);
        loginPage.login();
        Assertions.assertTrue(loginPage.isLogined(), "Login Failed");
    }

    @Test
    @Order(3)
    public void search_product() {
    homepage.searchBox().search("pantolon");

    }

    @Test
    @Order(4)
    public void select_product() {
        productsPage = new ProductsPage(driver);
        productsPage.selectMore();
        productsPage.selectRandomProduct();

    }

    @Test
    @Order(5)
    public void add_to_cart() {
        productDetailPage = new ProductDetailPage(driver);
        cartPage = new CartPage(driver);
        productDetailPage.AddToCart();
        //System.out.println(productDetailPage.part1);
        Assertions.assertTrue(cartPage.isPriceRight(productDetailPage.part1),"Price is not Right");


    }

    @Test
    @Order(6)
    public void go_to_cart() {

    cartPage.upQuantity();
    Assertions.assertTrue(cartPage.isQuantityRight(),"Quantity is not 2");
    }

    @Test
    @Order(7)
    public void clean_cart(){
        modalPage = new ModalPage(driver);
        cartPage.cleanCart();
        modalPage.sure();
        Assertions.assertTrue(cartPage.isCartClean(),"Cart is not clean");
    }


}