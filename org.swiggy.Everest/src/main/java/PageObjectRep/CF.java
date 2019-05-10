package PageObjectRep;

import managers.Log;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CF {
    public WebDriver driver;

    public static String ReportName() {
        {
            String Outputfilename = "TestReport";
            Date dNow = new Date(System.currentTimeMillis()); //here we have added 5 hours and 35 mintues to sync with server time in linux
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy-hh-mm");
            String datetime = ft.format(dNow);
            String Name = Outputfilename.concat(datetime);
            Log.info(Name);
            return Name;
        }
    }
}
