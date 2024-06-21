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
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> elements = select.getOptions();
        Assert.assertTrue(elements.get(0).isDisplayed(), "Наличие 1го елемента");
        Assert.assertTrue(elements.get(1).isDisplayed(), "Наличие 2го елемента");
        Assert.assertTrue(elements.get(2).isDisplayed(), "Наличие 3го елемента");
        select.selectByIndex(1);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1", "Текст второго выбранного элемента");
        select.selectByIndex(2);
        Assert.assertEquals( select.getFirstSelectedOption().getText(),"Option 2", "Текст третьего выбранного элемента");
    }
}

