package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class DropdownList extends PreCondition {
    @Test
    public void dropdownList() {
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        List<WebElement> Rows = driver.findElements(By.cssSelector("#dropdown > option"));
        Assert.assertEquals(Rows.size(), 3);
        Rows.get(1).click();
        List<WebElement> Rows1 = driver.findElements(By.cssSelector("#dropdown > option"));
        Assert.assertTrue(Rows1.get(1).isSelected());
        Rows.get(2).click();
        List<WebElement> Rows2 = driver.findElements(By.cssSelector("#dropdown > option"));
        Assert.assertTrue(Rows2.get(2).isSelected());
    }
}

