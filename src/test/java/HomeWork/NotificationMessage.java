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
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
        WebElement row = (WebElement) driver.findElement(By.cssSelector("div[class='flash notice']"));
        Assert.assertEquals(row.getText(), " Action successful");
    }
}
