import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 29/03/2016.
 */
public class verifyingnewbuyer extends BaseMain {
    public void verifybuyer() throws InterruptedException {
        System.out.println("its clicking popup nowwwwww");
        Thread.sleep(5000);
       // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//html/body/div[2]/div[3]/div/div/div/div/div[2]/a/button
        WebElement element = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div/div/div[2]/a/button"));
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();

        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        System.out.println("its searching buyer");
        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys("rambabu");
        Assert.assertTrue("Checking the suppliers ",driver.findElement(By.tagName("body")).getText().contains("rambabu"));


    }
}
