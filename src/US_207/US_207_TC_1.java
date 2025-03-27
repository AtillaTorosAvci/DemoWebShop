package US_207;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_207_TC_1 extends BaseDriver {

    @Test
    public void Test () {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement loginButton = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginButton.click();

        WebElement email = driver.findElement(By.xpath("//input[@class='email']"));
        email.sendKeys("atillapractice@hotmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("GreenCard123");

        WebElement log_in = driver.findElement(By.xpath("//input[@value='Log in']"));
        log_in.click();

        WebElement voteExlnt = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        voteExlnt.click();

        WebElement vote = driver.findElement(By.xpath("//input[@value='Vote']"));
        vote.click();

        WebElement voteResult = driver.findElement(By.xpath("//ul[@class='poll-results']"));
        System.out.println("Vote Result = " + voteResult.getText());

        BekleKapat();

    }
}
