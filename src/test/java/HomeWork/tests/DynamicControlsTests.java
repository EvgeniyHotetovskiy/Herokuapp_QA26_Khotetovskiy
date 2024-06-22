package HomeWork.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTests extends BaseTest {

    @Test
    public void dynamicControlsTest() {
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickCheckboxButton();
        dynamicControlsPage.waitLoadingChangeOnPage("It's gone!");
        Assert.assertFalse(dynamicControlsPage.isElementCheckboxPresent(), "Element is present");
        Assert.assertFalse(dynamicControlsPage.isInputAvailable(), "Input  is available");
        dynamicControlsPage.clickInputButton();
        dynamicControlsPage.waitLoadingChangeOnPage("It's enabled!");
        Assert.assertTrue(dynamicControlsPage.isInputAvailable(), "Input still is disabled");
    }

}
