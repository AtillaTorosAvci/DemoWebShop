package Utility;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_209_TC_02 extends BaseDriver {

    @Test

    public void test1() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);
        WebElement loginanamenu = driver.findElement(By.linkText("Log in"));
        loginanamenu.click();


        WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));
        email1.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password1 = driver.findElement(By.xpath("//input[@id='Password']"));
        password1.sendKeys("GreenCard123");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        login1.click();
        MyFunc.Bekle(1);

        WebElement epostasi = driver.findElement(By.linkText("atillapractice@hotmail.com"));
        epostasi.click();
        MyFunc.Bekle(1);

        WebElement orders = driver.findElement(By.linkText("Orders"));
        orders.click();
        MyFunc.Bekle(1);

        WebElement details = driver.findElement(By.cssSelector("input[class=\"button-2 order-details-button\"]"));
        details.click();
        MyFunc.Bekle(1);

        WebElement pdfindir = driver.findElement(By.linkText("PDF Invoice"));
        pdfindir.click();
        MyFunc.Bekle(1);


        BekleKapat();

    }
}
