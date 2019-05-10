package managers;

import PageObjectRep.Swiggy;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private Swiggy swiggyPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public Swiggy getSwiggyPage(){

        return (swiggyPage == null) ? swiggyPage = new Swiggy(driver) : swiggyPage;

    }

}



