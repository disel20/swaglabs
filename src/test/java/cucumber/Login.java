package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.LoginPage;
import pom.ProductsPage;
import runner.CucumberBase;

public class Login extends CucumberTest {

    LoginPage loginPage = new LoginPage(CucumberBase.getDriver());
    ProductsPage productsPage = new ProductsPage(CucumberBase.getDriver());

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {
    }

    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {

        loginPage.loginWithStandardUser();
    }

    @When("I click the Login Button")
    public void i_click_the_login_button() {

        loginPage.loginButtonClick();
    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {
    }

    @Then("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {

        Assert.assertNotNull(productsPage);
        Assert.assertTrue(productsPage.getAppLogo().isDisplayed());
    }

    @When("I fill the account information for account LockedOutUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {

        loginPage.loginWithLockedOutUser();
    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_error_message_contains_the_text(String string) {

        Assert.assertTrue(loginPage.getErrorMessage().getText().contains(string));
    }
}
