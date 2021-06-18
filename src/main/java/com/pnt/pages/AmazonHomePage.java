package com.pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    public void validateSearchIsDisplayed(){
        Assert.assertTrue(searchBar.isDisplayed());
    }

    public void typeInSearchBar(String data){
        searchBar.sendKeys(data);
    }

    public void clickOnSearchButtom(){
        searchBtn.click();
    }
}
