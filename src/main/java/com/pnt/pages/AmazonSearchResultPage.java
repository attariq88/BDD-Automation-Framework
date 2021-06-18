package com.pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultPage {

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    private WebElement searchResult;

    public void validateSearchResult(){
        searchResult.isDisplayed();
    }
}
