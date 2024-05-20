package HomeWork.tests;

import HomeWork.pages.DynamicControlsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTests extends BaseTest {

    @Test
    public void dynamicControlsTest(){
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickCheckboxButton();
        wait.until(ExpectedConditions.textToBe(DynamicControlsPage.AFTER_LOADING_CHANGE, "It's gone!"));
        Assert.assertFalse(dynamicControlsPage.isElementCheckboxPresent(driver, DynamicControlsPage.CHECK_CHECKBOX), "Element is present");
        Assert.assertTrue(dynamicControlsPage.isInputDisabled(driver, DynamicControlsPage.INPUT_LOCATOR), "Input  is available");
        dynamicControlsPage.clickInputButton();
        wait.until(ExpectedConditions.textToBe(DynamicControlsPage.AFTER_LOADING_CHANGE, "It's enabled!"));
        Assert.assertFalse(dynamicControlsPage.isInputDisabled(driver, DynamicControlsPage.INPUT_LOCATOR), "Input still is disabled");
    }

}
