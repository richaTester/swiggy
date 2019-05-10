package DataProviders;



import enums.DriverType;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private final String propertyFilePath= ".//lib//Configuration.properties";

    WebDriver driver;

    public ConfigReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath(){
        String driverPath = properties.getProperty("driverPath");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getLocation() {
        String url = properties.getProperty("location");
        if(url != null) return url;
        else throw new RuntimeException("location not specified in the Configuration.properties file.");
    }
    public Map<String, String> getlistcupke() {
        Map<String, String> cartverificationlist = new HashMap<String, String>();
        String cupcke1 = properties.getProperty("cupcke1");
        String cupcke2 = properties.getProperty("cupcke2");
        String cupcke3 = properties.getProperty("cupcke3");
        String cupcke4 = properties.getProperty("cupcke4");

        String cupckequantity1 = properties.getProperty("cupckequantity1");
        String cupckequantity2 = properties.getProperty("cupckequantity2");
        String cupckequantity3 = properties.getProperty("cupckequantity3");
        String cupckequantity4 = properties.getProperty("cupckequantity4");

        cartverificationlist.put(cupcke1,cupckequantity1);
        cartverificationlist.put(cupcke2,cupckequantity2);
        cartverificationlist.put(cupcke3,cupckequantity3);
        cartverificationlist.put(cupcke4,cupckequantity4);
        return cartverificationlist;

    }
    public String getRestaurant () {
        String restaurant_name = properties.getProperty("restaurant_name");
        return restaurant_name;
    }

    public String getUnamePath() {
        String UnamePath = properties.getProperty("Uname");
        if(UnamePath!= null) return UnamePath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
    public String getpwdPath() {
        String pwdPath = properties.getProperty("pwd");
        if(pwdPath!= null) return pwdPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

    public String getRecipientNumber() {
        String ReportPath = properties.getProperty("RecipientNumber");
        if(ReportPath!= null) return ReportPath;
        else throw new RuntimeException("RecipientNumber Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }


}
