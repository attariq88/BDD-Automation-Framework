package com.pnt.stepDef;

import com.pnt.base.TestBase;
import com.pnt.pages.AmazonHomePage;
import com.pnt.pages.AmazonSearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.tr.Ama;
import gherkin.lexer.Pa;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class AmazonHomePageFunctionality {

    private AmazonHomePage amazonHomePage;
    private AmazonSearchResultPage amazonSearchResultPage;

    @BeforeMethod()
    public void setupPom(){
        amazonHomePage = PageFactory.initElements(TestBase.driver,AmazonHomePage.class);
        amazonSearchResultPage = PageFactory.initElements(TestBase.driver,AmazonSearchResultPage.class);
    }


    @Given("^user opens the browser and navigate to amazon\\.com$")
    public void user_opens_the_browser_and_navigate_to_amazon_com() {
        TestBase.setupDriver();
        TestBase.driver.get("https://www.amazon.com");
        amazonHomePage = PageFactory.initElements(TestBase.driver,AmazonHomePage.class);
        amazonSearchResultPage = PageFactory.initElements(TestBase.driver,AmazonSearchResultPage.class);
    }

    @When("^user can see the search bar$")
    public void user_can_see_the_search_bar() {
        amazonHomePage.validateSearchIsDisplayed();
    }

    @Then("^user types Nike Shoes in the search bar$")
    public void user_types_Nike_Shoes_in_the_search_bar() {
        amazonHomePage.typeInSearchBar("Nike Shoes");
    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_search_button() {
        amazonHomePage.clickOnSearchButtom();
    }

    @Then("^user can see search result of Nike Books$")
    public void user_can_see_search_result_of_Nike_Books() {
        amazonSearchResultPage.validateSearchResult();
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() {
        TestBase.driver.close();
    }

    @Then("^user types (.*) in the search bar$")
    public void user_types_brandName_in_the_search_bar(String data) {
        amazonHomePage.typeInSearchBar(data);
    }
}
