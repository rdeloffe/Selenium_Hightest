package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By mailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setMail(String mail){
        driver.findElement(mailField).sendKeys(mail);
    }

    public void ClickButton(){
        driver.findElement(retrieveButton).click();
    }
}
