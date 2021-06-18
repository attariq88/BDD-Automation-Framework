package com.pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(id = "email")
    private WebElement emailOrPhoneField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "u_0_d_kq")
    private WebElement loginButton;

    public void fillEmailField(String data){
        emailOrPhoneField.sendKeys(data);
    }

    public void fillPasswordField(String data){
        passwordField.sendKeys(data);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }
}
