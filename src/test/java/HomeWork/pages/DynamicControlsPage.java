package HomeWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class DynamicControlsPage extends BasePage {
    public final static By AFTER_LOADING_CHANGE = By.cssSelector("p[id=message]");
    public final static By CHECKBOX_BUTTON = By.cssSelector("button[onclick='swapCheckbox()']");
    public final static By CHECK_CHECKBOX = By.cssSelector("input[type=checkbox]");
    public final static By INPUT_BUTTON = By.cssSelector("button[onclick='swapInput()']");
    public final static By INPUT_LOCATOR = By.cssSelector("input[type=text]");


    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicControlsPage (){
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
}

    public void clickCheckboxButton() {
        driver.findElement(CHECKBOX_BUTTON).click();
    }
    public boolean isElementCheckboxPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public void clickInputButton() {
        driver.findElement(INPUT_BUTTON).click();
    }
    public boolean isInputDisabled (WebDriver driver, By by) {
        return driver.findElement(by).getAttribute("disabled") != null;
    }
}
