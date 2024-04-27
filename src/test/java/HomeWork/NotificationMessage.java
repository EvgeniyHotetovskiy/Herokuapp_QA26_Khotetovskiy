package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class NotificationMessage extends PreCondition {
    @Test
    public void notificationMessage() {
        driver.navigate().to("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector("#content > div > p > a")).click();
        List<WebElement> Rows = driver.findElements(By.cssSelector("#dropdown > option"));
        Assert.assertEquals(Rows.size(), 1);
        Assert.assertEquals(Rows.get(0).getAttribute("outerText"), " Action successful\n×");
    }
}
