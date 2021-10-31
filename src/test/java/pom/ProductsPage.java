package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BaseModel {

    @FindBy(className = "app_logo")
    private WebElement appLogo;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement addToCart;

    @FindBy(id = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAppLogo() {
        return appLogo;
    }

    public ProductsPage addToCartClick() {
        addToCart.click();
        return new ProductsPage(getDriver());
    }

    public ProductsPage shoppingCartClick() {
        shoppingCartButton.click();
        return new ProductsPage(getDriver());
    }
}
