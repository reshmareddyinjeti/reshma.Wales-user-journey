package qa.health.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import qa.health.com.driver.DriverFactory;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser("chrome");
        driverFactory.setupUrl("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        driverFactory.maximize();
        driverFactory.pageLoadTimeOut();
        driverFactory.waits();
        driverFactory.deleteCookies();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}


