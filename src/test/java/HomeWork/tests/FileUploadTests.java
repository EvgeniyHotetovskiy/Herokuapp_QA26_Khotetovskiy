package HomeWork.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {

    @Test
    public void dynamicControlsTest() {
        fileUploadPage.openFileUploadPage();
        fileUploadPage.enterFileUploadField();
        fileUploadPage.clickUploadButton();
        fileUploadPage.waitFileUploadedSuccessPage();
        Assert.assertEquals(fileUploadPage.getTextFileUploaded(), "Test", "File is not uploaded");
    }
}
