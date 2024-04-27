package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs extends PreCondition {
    @Test
    public void inputs() {
        driver.navigate().to("https://the-internet.herokuapp.com/inputs");
        Assert.assertTrue(driver.findElements(By.cssSelector("input[type=number]")).get(0).getAttribute("value").equals(""));
        driver.findElement(By.cssSelector("input[type=number]")).sendKeys("zxcvb%^&");
        Assert.assertTrue(driver.findElements(By.cssSelector("input[type=number]")).get(0).getAttribute("value").equals(""));
        driver.findElement(By.cssSelector("input[type=number]")).sendKeys("122");
        Assert.assertTrue(driver.findElements(By.cssSelector("input[type=number]")).get(0).getAttribute("value").equals("122"));
        driver.findElement(By.cssSelector("input[type=number]")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.cssSelector("input[type=number]")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.cssSelector("input[type=number]")).sendKeys(Keys.ARROW_DOWN);
        Assert.assertTrue(driver.findElements(By.cssSelector("input[type=number]")).get(0).getAttribute("value").equals("123"));
    }
}
