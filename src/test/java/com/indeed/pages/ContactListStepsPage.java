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




    @FindBy(xpath = "//*[@class=\"bx-finder-box-tab bx-lm-tab-department\"]")
    public WebElement addMultipleContactsButton;

    @FindBy(xpath="//*[@class=\"bx-finder-company-department-employee-name\"]")
    public WebElement addMoreContacts;

    @FindBy(xpath = "//*[.='helpdesk22@cybertekschool.com']")
    public WebElement addContacts;

    @FindBy(xpath = "//*[@class='popup-window-close-icon']")
    public WebElement closeButton;

//    @FindBy(xpath = "//*[.=\"INSTRUCTORS DEPARTMENT\"]")
  //  public WebElement addDepartments;

    //@FindBy(xpath = "//*[@class='bx-finder-company-department-check-arrow']")
    //public WebElement addSubDepartments;

    @FindBy(xpath = "//*[.='Add question']")
    public WebElement addQuestionButton;

    @FindBy(xpath ="//*[@id='question_0']")
    public WebElement deleteQuestion;

    @FindBy(xpath ="(//*[@title='Delete question'])[1]" )
    public WebElement deleteButton;



    @FindBy(xpath = "//label[@class='vote-checkbox-label']")
    public WebElement allowMultipleChoiceButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[1]")
    public WebElement deleteAllEmployees;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
            public WebElement sendButton;

        @FindBy(xpath = "//*[@class='vote-block-title adda']")
         public WebElement questionText;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorPerson;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorMessageTitle;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorQuestion;






}
