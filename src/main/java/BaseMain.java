import org.junit.AfterClass;
import org.junit.BeforeClass;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Sudhakar on 25/03/2016.
 */
public class BaseMain {
    static WebDriver driver;

    @BeforeClass
    public void openBrowser() throws IOException {
        System.out.println("opening browser");
        Properties prop = new Properties();
        FileInputStream fileInputStreamfs = new FileInputStream("C:\\Users\\Sudhakar\\IdeaProjects\\FANMANS\\src\\test\\resources\\config.properties");
        prop.load(fileInputStreamfs);
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        System.out.print("browser: " + browser);
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
                driver = (new InternetExplorerDriver());
                break;
            default:
                driver = (new FirefoxDriver());
                break;
        }
        driver.get(url);
    }
    public void closeBrowser()
    {
        driver.quit();
    }
}

