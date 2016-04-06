import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sudhakar on 28/03/2016.
 */
public class Buyer extends BaseMain{
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return email;
    }
public void  enterbuyerdetail() throws InterruptedException {

    System.out.println("this page entering buyer details ");
    driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/a")).click();// - to click on user management
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[contains(.,'Buyers')]")).click(); //- to click on buyer
    driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/input")).click(); //- to click on add new buyer
    driver.findElement(By.xpath("//*[@id='sname']")).sendKeys("SUPERSTAR");
    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(randomEmail(15));
    driver.findElement(By.xpath("//*[@id='saddress']")).sendKeys("hounlow");
    driver.findElement(By.xpath("//*[@id='cnumber']")).sendKeys("07862335455");
    driver.findElement(By.xpath("//*[@id='key']")).sendKeys("ksr");
    driver.findElement(By.xpath("//*[@id='atitle']")).sendKeys("london hounslow");
    driver.findElement(By.xpath("//*[@id='address']")).sendKeys("charthworth");
    driver.findElement(By.xpath("//*[@id='uname']")).sendKeys("rambabu");
    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("London123");
    driver.findElement(By.xpath("//*[@id='retypepassword']")).sendKeys("London123");
    driver.findElement(By.xpath("//*[@id='newsupplier']/div/div[1]/div/div[1]/div[11]/p/div/div/span[3]")).click();
    driver.findElement(By.xpath("//*[@id='submit']")).click();
}

}
