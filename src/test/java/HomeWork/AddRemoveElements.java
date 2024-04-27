package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElements extends PreCondition {

    @Test
    public void addRemoveElements() {
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        List<WebElement> Rows = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(Rows.size(), 1);
    }

}
