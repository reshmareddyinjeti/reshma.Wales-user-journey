package qa.health.com.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.health.com.driver.DriverFactory;

public class Search extends DriverFactory {
    @FindBy(css=".button-get-started")
    private WebElement startButton;
    @FindBy(linkText = "Check if you can get help with health costs")
    private WebElement cookies;
    @FindBy(css="#label-wales")
    private WebElement countryRadioButton;
    @FindBy(id="next-button")
    private WebElement nextButton;
    @FindBy(id="dob-day")
    private WebElement dayCheckBox;
    @FindBy(id="dob-month")
    private WebElement monthCeckBox;
    @FindBy(id="dob-year")
    private WebElement yearCheckBox;
    @FindBy(id="label-yes")
    private WebElement yesButton;
    @FindBy (id="label-no")
    private WebElement noButton;
    //result header webelement for validation
    @FindBy(id="result-heading")
    private WebElement resultHeader;




    public void setSearchMethod() {
        startButton.click();
        cookies.click();
        startButton.click();
        //Which country do you live in?
       countryRadioButton.click();
        nextButton.click();

    }
    public void selectOptions(){
        //What is your date of birth?
        dayCheckBox.sendKeys("10");
        monthCeckBox.sendKeys("01");
        yearCheckBox.sendKeys("1991");
        nextButton.click();
        //Do you live with a partner?
        yesButton.click();
        nextButton.click();
        //Do you or your partner claim any benefits or tax credits?
        noButton.click();
        nextButton.click();
        //Are you pregnant or have you given birth in the last 12 months?
        noButton.click();
        nextButton.click();
        //Do you have an injury or illness caused by serving in the armed forces?
        noButton.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        nextButton.click();
        //Do you have diabetes?
        noButton.click();
        nextButton.click();
        //Do you have glaucoma?
        noButton.click();
        nextButton.click();
        //Do you or your partner live permanently in a care home?
        noButton.click();
        nextButton.click();
        //Do you and your partner have more than £16,000 in savings, investments or property?
        noButton.click();
        js.executeScript("window.scrollBy(0,300)");
        nextButton.click();

    }
    public String headerMethodForValidation(){

       return resultHeader.getText();

    }
}
