package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class B_TrialsPage extends BaseClass {
    // old implementation is below and gave null pointer exception - here is new attempt

    public static WebDriver weBdriver;

    public B_TrialsPage(WebDriver ldriver) {
        this.weBdriver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    public void clickTrialsMenuOption(){
        B_TrialsPage.weBdriver.findElement(By.id("trialSearchMenuOption")).click();
//        WebElement element;
//        element = getDriver().findElement(By.id("trialSearchMenuOption"));
//        element.click();
    }
    public void clickIdentifier(){
        WebElement element=weBdriver.findElement(By.id("identifier"));
        element.click();
    }
    public void enterTextInIdentifierBox(){
        WebElement element=weBdriver.findElement(By.id("identifier"));
        element.sendKeys("NCI-2018");
    }
    //public static WebDriver webdriver;

    //public B_TrialsPage(WebDriver driver){
        //this.webdriver=driver;
    //}

    //public void clickTrialsMenuOption(){
      //  WebElement trialsLink=webdriver.findElement(By.id("trialSearchMenuOption"));
        // trialsLink.click();
    //}

    //public void clickIdentifier(){
      //  WebElement identifierBox=webdriver.findElement(By.id("identifier"));
        //identifierBox.click();
    //}

    //public void enterTextInIdentifierBox(String s){
      //  WebElement identifierBox=webdriver.findElement(By.id("identifier"));
        //identifierBox.sendKeys("NCI-2018");
    //}

    public void searchBySubmissionRegistry(){
        WebElement searchBySubmission = weBdriver.findElement(By.cssSelector(".btn:nth-child(1) > .btn_img"));
        searchBySubmission.click();
        WebElement selectSearchBySubmission=weBdriver.findElement(By.cssSelector("tr:nth-child(9) .select2-search__field"));
        selectSearchBySubmission.click();
        selectSearchBySubmission.sendKeys("Registry");

    }
    public void clickRegistry(){
        WebElement selectSearchBySubmission=weBdriver.findElement(By.cssSelector("tr:nth-child(9) .select2-search__field"));
        selectSearchBySubmission.sendKeys(Keys.ENTER);
    }
    public void clickSearch(){
        weBdriver.findElement(By.cssSelector(".search")).click();
    }
    public void assertSearchResults(){
        String assertText="Search Results!!!!";
        Assert.assertTrue(assertText.equals(weBdriver.findElement(By.cssSelector("h2")).getText()));
    }
}
