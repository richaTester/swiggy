package managers;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import enums.DriverType;

public class WebDriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public WebDriverManager() {
        driverType = managers.FileReader.getInstance().getConfigReader().getBrowser();
    }

    public WebDriver getDriver() throws MalformedURLException {
        if(driver == null) driver = createDriver();
        return driver;
    }

   private WebDriver createDriver() throws MalformedURLException {
        driver = createSTAGEDriver();
        return driver;
    }

    private WebDriver createSTAGEDriver() throws MalformedURLException {
        switch (driverType) {
            case FIREFOX : driver = new FirefoxDriver();
                break;
            case CHROME :
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReader.getInstance().getConfigReader().getDriverPath());
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(FileReader.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

  /*  public void closeDriver() {
        driver.close();
        driver.quit();
    }*/
}
