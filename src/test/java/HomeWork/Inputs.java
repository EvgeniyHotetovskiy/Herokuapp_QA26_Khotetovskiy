package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Inputs extends PreCondition {
    @Test
    public void inputs() {
        driver.navigate().to("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.cssSelector("input[type=number]"));
        Assert.assertEquals(input.getAttribute("value"), "");
        input.sendKeys("zxcvb%^&");
        Assert.assertEquals(input.getAttribute("value"), "");
        input.sendKeys("122");
        Assert.assertEquals(input.getAttribute("value"), "122");
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(input.getAttribute("value"), "123");
    }
}
