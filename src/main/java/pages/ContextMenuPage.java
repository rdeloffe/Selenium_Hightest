package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver;
    private By rightclickSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void contextmenu_RightClick(){
        Actions actions = new Actions(driver);
        WebElement rightSpot = driver.findElement(rightclickSpot);
        actions.contextClick(rightSpot).perform();
    }

    public String contextmenu_getText(){
        return driver.switchTo().alert().getText();
    }


    public void contextmenu_clickAccept(){
        driver.switchTo().alert().accept();
    }


}
