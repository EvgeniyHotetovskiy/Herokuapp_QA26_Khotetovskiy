package HomeWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    public final static By UPLOAD_BUTTON = By.cssSelector("input[id=file-submit]");
    public final static By FILE_UPLOADED_SUCCESS = By.cssSelector("div[class='panel text-center']");
    public final static By FILE_UPLOADED_PAGE = By.xpath("//*[@id=\"content\"]/div/h3");
    public static String PATH_TO_LOADING_FILE = System.getProperty("user.dir") + "/src/test/resources/Test";


    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void clickUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getTextFileUploaded() {
        return this.driver.findElement(FILE_UPLOADED_SUCCESS).getText();
    }

    public String getTextFileUploadedPageDone() {
        return this.driver.findElement(FILE_UPLOADED_PAGE).getText();
    }
}
