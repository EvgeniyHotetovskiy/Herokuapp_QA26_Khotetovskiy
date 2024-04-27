package HomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DataTables extends PreCondition {
    @Test
    public void dataTables() {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")).get(0).getText().equals("Smith"));
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[2]")).get(0).getText().equals("Frank"));
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]")).get(0).getText().equals("jdoe@hotmail.com"));
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[4]")).get(0).getText().equals("$50.00"));
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[5]")).get(0).getText().equals("http://www.jdoe.com"));
    }
}