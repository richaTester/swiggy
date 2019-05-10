
package runners;

import PageObjectRep.CF;
import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src//test//java//FeatureList",glue = "stepDefinations",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:",
                "junit:target/cucumber-results.xml"},
        tags="@smoke",
        monochrome = true
)
public class TestRunner {
    static String ReportName= CF.ReportName();
    @BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("target/cucumber-reports/"+ReportName+".html");
        PropertyConfigurator.configure(".//src//log4j.properties");
    }
   /* @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(FileReader.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("URL", FileReader.getInstance().getConfigReader().getApplicationUrl());
        Reporter.setSystemInfo("Environment", String.valueOf(FileReader.getInstance().getConfigReader().getEnvironment()));
    }*/
}

