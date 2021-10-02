import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    String email = "jredecwtheyfrlbbra@sdvrecft.com";
    String password = "abc123";

    private final By emailLocator =By.id("LoginEmail");
    private final By passwordLocator =By.xpath("//*[@id=\"loginForm\"]/div/div/div[4]/input");
    By loginLocater = By.id("loginLink");
    By isLoginLocater = By.id("header-login-section");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
    type(emailLocator,email);
    type(passwordLocator,password);
    click(loginLocater);
    }


    public boolean isLogined() {
    return isDisplayed(isLoginLocater);
    }
}
