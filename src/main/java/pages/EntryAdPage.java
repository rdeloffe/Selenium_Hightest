package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private By clickClose = By.xpath("//div[@class='modal-footer']/p");

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void modal_clickClose(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(clickClose));
        closeButton.click();
    }
}
