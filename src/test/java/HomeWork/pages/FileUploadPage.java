package HomeWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    private final static By UPLOAD_BUTTON = By.cssSelector("input[id=file-submit]");
    private final static By FILE_UPLOADED_SUCCESS = By.cssSelector("div[class='panel text-center']");
    private final static By FILE_UPLOAD_FIELD = By.cssSelector("input[id=file-upload]");
    private final static By FILE_UPLOADED_PAGE = By.xpath("//*[@id=\"content\"]/div/h3");

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

    public void enterFileUploadField(String PATH_TO_LOADING_FILE) {
        driver.findElement(FILE_UPLOAD_FIELD).sendKeys(PATH_TO_LOADING_FILE);
    }

    public void waitFileUploadedSuccessPage() {
        this.wait.until(ExpectedConditions.textToBe(FILE_UPLOADED_PAGE, "File Uploaded!"));
    }

}
