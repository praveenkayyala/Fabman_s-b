import org.openqa.selenium.By;

/**
 * Created by Sudhakar on 26/03/2016.
 */
public class LogoutAC extends BaseMain {
    public void myaccountlogout(){
        System.out.println("going to logout");
        driver.findElement(By.xpath("//*[@id='drop2']")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/ul/li[2]/ul/li[4]/a")).click();
        System.out.println("logout successfullyyyyyyyyy");
    }
}
