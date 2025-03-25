import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_205_TC_01 extends BaseDriver {

    @Test

    public void test1() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);
        WebElement loginanamenu = driver.findElement(By.linkText("Log in"));
        loginanamenu.click();


        WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));

        email1.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement password1 = driver.findElement(By.xpath("//input[@id='Password']"));
        password1.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        login1.click();
        MyFunc.Bekle(1);


        WebElement email2 = driver.findElement(By.xpath("//input[@id='Email']"));
        email2.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password2 = driver.findElement(By.xpath("//input[@id='Password']"));
        password2.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login2 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(1);

        email2.clear();
        password2.clear();


        WebElement email3 = driver.findElement(By.xpath("//input[@id='Email']"));
        email3.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement password3 = driver.findElement(By.xpath("//input[@id='Password']"));
        password3.sendKeys("GreenCard123");
        MyFunc.Bekle(1);

        WebElement login3 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        login3.click();
        MyFunc.Bekle(1);

        WebElement email4 = driver.findElement(By.xpath("//input[@id='Email']"));
        email4.sendKeys("atillaaaapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password4 = driver.findElement(By.xpath("//input[@id='Password']"));
        password4.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login4 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        login4.click();

        System.out.println("password4 = " + password4.getAttribute("value"));

        BekleKapat();


    }
}
