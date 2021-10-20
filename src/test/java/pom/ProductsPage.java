package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BaseModel {

    @FindBy(className = "app_logo")
    private WebElement appLogo;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAppLogo() {
        return appLogo;
    }
}
