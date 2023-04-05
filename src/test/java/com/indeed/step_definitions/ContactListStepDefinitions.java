package com.indeed.step_definitions;

import com.indeed.pages.ContactListStepsPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        contactListStepsPage.messageBox.click();
    }


    @When("user clicks on the add more button")
    public void userClicksOnTheAddMoreButton() {
         contactListStepsPage.addMoreButton.click();
    }

    @And("user adds multiple contacts for polling")
    public void userAddsMultipleContactsForPolling() throws InterruptedException {
        contactListStepsPage.addMoreBox.click();
        contactListStepsPage.addMultipleContactsButton.click();
        contactListStepsPage.addMoreContacts.click();
        contactListStepsPage.addContacts.click();
        contactListStepsPage.closeButton.click();
    }

    @Then("User sees multiple contacts in the polling list")
    public void userSeesMultipleContactsInThePollingList() {
        System.out.println("User sees multiple contacts in the polling list");
    }




    @When("user clicks on Add question button")
    public void userClicksOnAddQuestionButton() {
        contactListStepsPage.addQuestionButton.click();
    }


    @Then("user sees a question and multiple answers added to polling section")
    public void userSeesAQuestionAndMultipleAnswersAddedToPollingSection() {
        System.out.println("user sees a question and multiple answers added to polling station");
    }

   @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        contactListStepsPage.deleteQuestion.click();


    }

    @Then("delete question button is clickable on the page")
    public void deleteQuestionButtonIsClickableOnThePage() {
        contactListStepsPage.deleteButton.click();
    }


    @When("user clicks Allow multiple choice checkbox")
    public void userClicksAllowMultipleChoiceCheckbox() {
    contactListStepsPage.allowMultipleChoiceButton.click();
    }


    @Then("user sees the checkbox is selected")
    public void userSeesTheCheckboxIsSelected() {
        contactListStepsPage.allowMultipleChoiceButton.isSelected();


    }

    @When("user create a poll without adding persons for the poll")
    public void userCreateAPollWithoutAddingPersonsForThePoll() {
        contactListStepsPage.deleteAllEmployees.click();
      //  contactListStepsPage.deleteQuestion.click();
       // contactListStepsPage.deleteButton.click();
        contactListStepsPage. sendButton.click();



    }

    @Then("please specify at least one person error message is displayed on the page")
    public void pleaseSpecifyAtLeastOnePersonErrorMessageIsDisplayedOnThePage() {
      Assert.assertTrue( contactListStepsPage.errorPerson.isDisplayed());

    }

    @When("user creates a poll leaving message title empty")
    public void userCreatesAPollLeavingMessageTitleEmpty() {
          contactListStepsPage.deleteQuestion.click();
         contactListStepsPage.deleteButton.click();
         contactListStepsPage.sendButton.click();
    }

    @Then("the message title is not specified error message is displayed  on the page")
    public void theMessageTitleIsNotSpecifiedErrorMessageIsDisplayedOnThePage() {
        Assert.assertTrue(contactListStepsPage.errorMessageTitle.isDisplayed());

    }


    @When("user create a poll without question text")
    public void userCreateAPollWithoutQuestionText() {
        contactListStepsPage.questionText.getText();
    }

    @Then("the question text is not specified error message is displayed on the page")
    public void theQuestionTextIsNotSpecifiedErrorMessageIsDisplayedOnThePage() {
        contactListStepsPage.sendButton.click();
        Assert.assertTrue(contactListStepsPage.errorQuestion.isDisplayed());
    }
}
