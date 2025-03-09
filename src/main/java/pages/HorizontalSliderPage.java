package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//div[@class='sliderContainer']/input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSliderToValue(double targetValue){
        WebElement sliderElement = driver.findElement(slider);
        sliderElement.click(); // Donne le focus au slider

        while (Double.parseDouble(getRangeValue()) < targetValue) {
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRangeValue(){
        return driver.findElement(range).getText();
    }
}
