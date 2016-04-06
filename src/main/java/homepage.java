import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 25/03/2016.
 */
public class homepage extends BaseMain {
    public String isOnHomePage()
    {
        return driver.getCurrentUrl();
    }

    public void  Loginin(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Fabman");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Narman@123");
//        driver.findElement(By.cssSelector("//*[@id='log']/button")).click();
        driver.findElement(By.xpath("//*[@id='log']/button")).click();
        System.out.println("this is logedinpage succe");
        //return new Myaccount();

    }

}
