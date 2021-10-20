package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseModel {

    private static final String STANDARD_USERNAME = "standard_user";
    private static final String STANDARD_PASSWORD = "secret_sauce";
    private static final String LOCKED_OUT_USERNAME = "locked_out_user";
    private static final String LOCKED_OUT_PASSWORD = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement inputUserName;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//h3[contains(text(),'Sorry, this user has been locked out.')]")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        return new LoginPage(getDriver());
    }

    public LoginPage loginWithStandardUser() {
        login(STANDARD_USERNAME, STANDARD_PASSWORD);
        return new LoginPage(getDriver());
    }

    public void loginWithLockedOutUser() {
        login(LOCKED_OUT_USERNAME, LOCKED_OUT_PASSWORD);
    }

    public LoginPage loginButtonClick() {
        loginButton.click();
        return new LoginPage(getDriver());
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}
