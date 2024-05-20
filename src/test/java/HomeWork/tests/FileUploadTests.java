package HomeWork.tests;

import HomeWork.pages.FileUploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    @Test
    public void dynamicControlsTest() {
        fileUploadPage.openFileUploadPage();
        driver.findElement(new By.ByCssSelector("input[id=file-upload]")).sendKeys(FileUploadPage.PATH_TO_LOADING_FILE);
        fileUploadPage.clickUploadButton();
        wait.until(ExpectedConditions.textToBe(FileUploadPage.FILE_UPLOADED_PAGE, "File Uploaded!"));
        Assert.assertEquals(fileUploadPage.getTextFileUploaded(), "Test", "File is not uploaded");
    }
}
