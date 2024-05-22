package HomeWork.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTests extends BaseTest {

    @Test
    public void dynamicControlsTest() {
        dynamicControlsPage.openDynamicControlsPage();
        dynamicControlsPage.clickCheckboxButton();
        dynamicControlsPage.waitLoadingChangeOnPage("It's gone!");
        Assert.assertFalse(dynamicControlsPage.isElementCheckboxPresent(dynamicControlsPage.getCHECK_CHECKBOX()), "Element is present");
        Assert.assertFalse(dynamicControlsPage.isInputAvailable(dynamicControlsPage.getINPUT_LOCATOR()), "Input  is available");
        dynamicControlsPage.clickInputButton();
        dynamicControlsPage.waitLoadingChangeOnPage("It's enabled!");
        Assert.assertTrue(dynamicControlsPage.isInputAvailable(dynamicControlsPage.getINPUT_LOCATOR()), "Input still is disabled");
    }

}
