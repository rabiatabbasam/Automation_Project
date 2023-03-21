package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListStepsPage {

public ContactListStepsPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;


    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
            public WebElement pollButton;

    @FindBy(xpath = "/html/body")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addMoreButton;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement addMoreBox;






}
