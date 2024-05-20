package HomeWork.tests;

import HomeWork.pages.DynamicControlsPage;
import HomeWork.pages.FileUploadPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected DynamicControlsPage dynamicControlsPage;
    protected FileUploadPage fileUploadPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        this.dynamicControlsPage = new DynamicControlsPage(driver);
        this.fileUploadPage = new FileUploadPage(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}