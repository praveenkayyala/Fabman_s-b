import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;


/**
 * Created by Sudhakar on 25/03/2016.
 */
public class Myaccount extends BaseMain {
    public void gotosupplier(){
        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/input")).click();
        //return this;
    }
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return email;
    }
    public String randomName(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";
        String name = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        name = temp.substring(0, temp.length() - 5);
        return name;
    }
public void enterfield(){
    driver.findElement(By.xpath("//*[@id='sname']")).sendKeys("sudhaandco");
    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(randomEmail(15));
    driver.findElement(By.xpath("//*[@id='saddress']")).sendKeys("hounslow london");
    driver.findElement(By.xpath("//*[@id='cnumber']")).sendKeys("07581143355");
    driver.findElement(By.xpath("//*[@id='key']")).sendKeys("sudhakar.co.uk");
    driver.findElement(By.xpath("//*[@id='uname']")).sendKeys("charan");
    //driver.findElement(By.xpath("//*[@id='uname']")).sendKeys(randomName(15));
    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Kayyala1987");
    driver.findElement(By.xpath("//*[@id='retypepassword']")).sendKeys("Kayyala1987");
    driver.findElement(By.xpath("//*[@id='newsupplier']/div/div[1]/div/div[1]/div[10]/p/div/div/span[3]")).click();
    driver.findElement(By.xpath("//*[@id='submit']")).click();
    //return new addsupplier();
}

}
