package cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ProductsPage;
import runner.CucumberBase;

public class Purchase extends CucumberTest {

    ProductsPage productsPage = new ProductsPage(CucumberBase.getDriver());

    @When("I choose the item to purchase")
    public void i_choose_the_item_to_purchase() {
    }

    @When("I click the Add To Cart button")
    public void i_click_the_add_to_cart_button() {
        productsPage.addToCartClick();
    }

    @Then("I click the shopping cart icon and redirected to the Cart Page")
    public void i_am_redirected_to_the_cart_page() {
        productsPage.shoppingCartClick();
    }

    @When("I click the checkout  button")
    public void i_click_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I am redirected to the CheckOut Information Page")
    public void i_am_redirected_to_the_check_out_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I fill field First Name, Last Name, Zip Code")
    public void i_fill_field_first_name_last_name_zip_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click the Continue Button")
    public void i_click_the_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I am redirected to the CheckOut Overview Page")
    public void i_am_redirected_to_the_check_out_overview_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click the Finish button")
    public void i_click_the_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the Order Message contains the text {string}")
    public void i_verify_the_order_message_contains_the_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
