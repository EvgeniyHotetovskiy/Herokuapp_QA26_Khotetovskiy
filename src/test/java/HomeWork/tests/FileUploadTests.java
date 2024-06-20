package HomeWork.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    private final String PATH_TO_LOADING_FILE = System.getProperty("user.dir") + "/src/test/resources/Test";

    @Test
    public void dynamicControlsTest() {

        fileUploadPage.openFileUploadPage();
        fileUploadPage.enterFileUploadField(PATH_TO_LOADING_FILE);
        fileUploadPage.clickUploadButton();
        fileUploadPage.waitFileUploadedSuccessPage();
        Assert.assertEquals(fileUploadPage.getTextFileUploaded(), "Test", "File is not uploaded");

    }
}
