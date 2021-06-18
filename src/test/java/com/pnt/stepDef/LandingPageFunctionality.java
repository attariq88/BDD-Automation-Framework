package com.pnt.stepDef;

import com.pnt.base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

public class LandingPageFunctionality {
    @Given("^user opens the browser and navigate to facebook\\.com$")
    public void user_opens_the_browser_and_navigate_to_facebook_com() {
        TestBase.setupDriver();
        TestBase.driver.get("https://www.facebook.com");

    }

    @When("^user fills username field$")
    public void user_fills_username_field() {


    }

    @Then("^user fills password field$")
    public void user_fills_password_field() {

    }

    @Then("^user clicks on sign in button$")
    public void user_clicks_on_sign_in_button() {

    }

    @Then("^user is logged in successfully$")
    public void user_is_logged_in_successfully() {

    }
}
