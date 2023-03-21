package com.indeed.step_definitions;

import com.indeed.pages.ContactListStepsPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactListStepDefinitions {

    ContactListStepsPage contactListStepsPage = new ContactListStepsPage();

    @Given("user is on  login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.crmly.net/");
    }
    @Given("user enter valid username, password")
    public void user_enter_valid_username_password() {
        contactListStepsPage.usernameBox.sendKeys("hr1@cybertekschool.com");
        contactListStepsPage.passwordBox.sendKeys("UserUser");
    }
    @When("user click login button to go home page")
    public void user_click_login_button_to_go_home_page() {
        contactListStepsPage.loginButton.click();
    }
    @Then("click on Poll button")
    public void click_on_poll_button() {

        contactListStepsPage.pollButton.click();
        contactListStepsPage.addMoreButton.click();
        contactListStepsPage.addMoreBox.click();


    }



}
