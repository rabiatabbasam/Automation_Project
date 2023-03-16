package com.indeed.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

  /*
    This method will accept int (int seconds) and execute Thread.sleep
    for given duration
     */

    public  static void sleep(int second){
        second *=1000;

        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }

    /*
    This method accepts 3 arguments
    Arg1: webdriver
    Arg 2: expectedUrl : for verify if the url contains given String.
    -if condition matches, will break loop.
    arg 3: expectedTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL:" + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
        //5. Assert:Title contains "Etsy"
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts a String "expectedTitle"and Asserts if it is true
     */
    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    /*
    creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }


    /**
     * this method will accept a String as expected value and compare with actual URL  CONTAINS the value.
     * @param expectedInURL
     */

    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    /**
     * this method will accept a dropdown as a WebElement
     * and return all of the options' text in a List of string.
     * @param dropdownElement
     * @return List<String> actualOptionsAsString</String>
     */


 public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
     Select select = new Select(dropdownElement);

     //List of all Actual month <options> as a web element
     List<WebElement> actualOptionsAsWebElement = select.getOptions();

     //List of all Actual month <options> as a string
     List<String> actualOptionsAsString = new ArrayList<>();

     for (WebElement each : actualOptionsAsWebElement) {
         actualOptionsAsString.add( each.getText());
     }
return actualOptionsAsString;
 }

    /**
     * This method will accept a group radio buttons as a List of WebElement.
     * It will loop through the List, and click to the radio button with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */




 public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){

     for (WebElement each : radioButtons) {
         if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
             each.click();
         }

     }
 }


    /**
     * swithches to new window by the exact title. Returns to original window if target title not found
     * @param targetTitle
     */


 public static void switchToWindow(String targetTitle){
     String origin = Driver.getDriver().getWindowHandle();
     for (String handle: Driver.getDriver().getWindowHandles()){
         Driver.getDriver().switchTo().window(handle);
         if(Driver.getDriver().getTitle().equals(targetTitle)){
             return;
         }
        Driver.getDriver().getTitle().equals(origin);

     }





    }


    /**
     * Moves the mouse to given element
     * @param element
     */
    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }





}
