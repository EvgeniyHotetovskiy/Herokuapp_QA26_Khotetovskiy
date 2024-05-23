package HomeWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    public static String PATH_TO_LOADING_FILE = System.getProperty("user.dir") + "/src/test/resources/Test";

    public final static By UPLOAD_BUTTON = By.cssSelector("input[id=file-submit]");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    public void openFileUploadPage (){
        driver.get("https://the-internet.herokuapp.com/upload");
    }
    public void clickUploadButton () {
        driver.findElement(UPLOAD_BUTTON);
    }
//    public String getNameOfButtonRemoveProduct (String productName) {
//        return this.getProductCardByName(productName).findElement(REMOVE_TO_CART_BUTTON).getText();
//
//    }

//    System.getProperty("user.dir") + "src/test/resources/Test"

}
