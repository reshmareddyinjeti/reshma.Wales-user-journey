package qa.health.com.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "IE":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
    }
    public void setupUrl(String Url){
        driver.get(Url);

    }
    public void maximize() {
        driver.manage().window().maximize();
    }
    public void pageLoadTimeOut(){
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
    }

    public void waits() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }
    public void deleteCookies(){
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser() {
        driver.quit();
    }


}


