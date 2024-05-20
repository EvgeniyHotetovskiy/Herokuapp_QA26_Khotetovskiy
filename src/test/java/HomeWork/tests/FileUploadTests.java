package HomeWork.tests;

import HomeWork.pages.DynamicControlsPage;
import HomeWork.pages.FileUploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    @Test
    public void dynamicControlsTest(){
        fileUploadPage.openFileUploadPage();
        driver.findElement(new By.ByCssSelector("input[id=file-upload]")).sendKeys(FileUploadPage.PATH_TO_LOADING_FILE);
        fileUploadPage.clickUploadButton();



    }
}
