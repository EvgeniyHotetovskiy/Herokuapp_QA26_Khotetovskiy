package HomeWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicControlsPage extends BasePage {
    private final static By AFTER_LOADING_CHANGE = By.cssSelector("p[id=message]");

    private final static By CHECKBOX_BUTTON = By.cssSelector("button[onclick='swapCheckbox()']");
    private final static By CHECK_CHECKBOX = By.cssSelector("input[type=checkbox]");

    private final static By INPUT_BUTTON = By.cssSelector("button[onclick='swapInput()']");
    private final static By INPUT_LOCATOR = By.cssSelector("input[type=text]");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }


    public void openDynamicControlsPage() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    public void clickCheckboxButton() {
        driver.findElement(CHECKBOX_BUTTON).click();
    }

    public boolean isElementCheckboxPresent() {
        try {
            driver.findElement(CHECK_CHECKBOX);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickInputButton() {
        driver.findElement(INPUT_BUTTON).click();
    }

    public boolean isInputAvailable() {
        return driver.findElement(INPUT_LOCATOR).isEnabled();
    }

    public void waitLoadingChangeOnPage(String expectedValue) {
        wait.until(ExpectedConditions.textToBe(AFTER_LOADING_CHANGE, expectedValue));
    }

}
