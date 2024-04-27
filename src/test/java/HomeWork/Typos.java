package HomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Typos extends PreCondition {
    @Test
    public void typos() {
        driver.navigate().to("https://the-internet.herokuapp.com/typos");
        Assert.assertTrue(driver.findElements(By.cssSelector("#content > div > p:nth-child(3)")).get(0).getText().equals("Sometimes you'll see a typo, other times you won't."));
    }
}