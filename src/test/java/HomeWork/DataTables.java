package HomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DataTables extends PreCondition {
    @Test
    public void dataTables() {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")).get(0).getText(), "Smith");
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[2]")).get(0).getText(), "Frank");
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]")).get(0).getText(), "jdoe@hotmail.com");
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[4]")).get(0).getText(), "$50.00");
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[5]")).get(0).getText(), "http://www.jdoe.com");
    }
}