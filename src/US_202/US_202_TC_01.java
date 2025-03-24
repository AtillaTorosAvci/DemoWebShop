package US_202;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_202_TC_01 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement RegisterHomePage= driver.findElement(By.className("ico-register"));
        RegisterHomePage.click();

        WebElement GenderMale= driver.findElement(By.cssSelector("input[id='gender-male']"));
        GenderMale.click();

        WebElement Firstname= driver.findElement(By.cssSelector("input[id='FirstName']"));
        Firstname.sendKeys("Nedesek");

        WebElement Lastname= driver.findElement(By.xpath("//input[@id='LastName']"));
        Lastname.sendKeys("Bos");
        MyFunc.Bekle(1);

        WebElement Email= driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("atillapractice@hotmail.com");

        WebElement Password= driver.findElement(By.cssSelector("input[id='Password']"));
        Password.sendKeys("Abbccdd1.");

        WebElement ComfirmPassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ComfirmPassword.sendKeys("Abbccdd1.");
        MyFunc.Bekle(1);

        WebElement register= driver.findElement(By.xpath("//input[@id='register-button']"));
        register.click();
        MyFunc.Bekle(2);

        WebElement NotificationText= driver.findElement(By.xpath("//*[text()='The specified email already exists']"));
        Assert.assertTrue("Uyari mesaji goruntulenemedi!", NotificationText.getText().contains("The specified email already exists"));

        BekleKapat();
    }
}
