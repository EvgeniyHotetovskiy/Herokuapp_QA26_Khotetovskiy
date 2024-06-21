package HomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Checkboxes extends PreCondition {
    @Test
    public void checkboxes() {
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[type=checkbox]")).isSelected());
        driver.findElement(By.cssSelector("input[type=checkbox]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[type=checkbox]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected());
    }
}
