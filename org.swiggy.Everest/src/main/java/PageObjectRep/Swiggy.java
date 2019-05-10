package PageObjectRep;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Swiggy {
    WebDriver driver;

    public Swiggy(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@class='_381fS _1oTLG _3BIgv']")
    @CacheLookup
    WebElement location_path;
    String Location="Indiranagar, Bengaluru, Karnataka, India";
    @FindBy(xpath = ".//span[text()='Indiranagar, Bengaluru, Karnataka, India']")
    @CacheLookup
    WebElement loc;

   /* @FindBy(xpath = ".//span[text()='FIND FOOD']")
    @CacheLookup
    WebElement findfood;*/

    @FindBy(xpath = ".//*[@href='/search']")
    @CacheLookup
    WebElement search;

    @FindBy(xpath = ".//*[@class='_2BJMh'][@placeholder='Search for restaurants or dishes']")
    @CacheLookup
    WebElement restaurant;

    @FindBy(xpath = ".//*[@class='_2BJMh'][@placeholder='Search for restaurants or dishes']")
    @CacheLookup
    WebElement bakary_test;

    @FindBy(xpath = ".//*[@href=\"/restaurants/bite-me-100-feet-road-indiranagar-bangalore-505\"]")
    @CacheLookup
    WebElement address;

 /*   @FindBy(xpath = ".//*[@class='_16j1h']//a[@href='/bangalore/bite-me-cupcakes-100-feet-road-indiranagar']")
    @CacheLookup
    WebElement link;*/

    @FindBy(xpath = ".//div[contains(text(),'Red Velvet Cupcake')]/../../../following-sibling::div[1]/div[2]")
    @CacheLookup
    WebElement add;
    @FindBy(xpath = ".//div[contains(text(),'Red Velvet Cupcake')]/../../../following-sibling::div[1]/div[2]/div[2]")
    @CacheLookup
    WebElement clickplus;

    @FindBy(xpath = ".//div[contains(text(),'Tiramisu  Cupcake')]/../../../following-sibling::div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement addTiramisu;

    @FindBy(xpath = ".//div[contains(text(),'Tiramisu  Cupcake')]/../../../following-sibling::div[1]/div[2]/div[2]")
    @CacheLookup
    WebElement clickplusTiramisu;

    @FindBy(xpath = ".//div[contains(text(),'Irish Coffee Cupcake')]/../../../following-sibling::div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement addIrishCoffeeCupcake;

    @FindBy(xpath = ".//div[contains(text(),'Choco Choco Cupcake')]/../../../following-sibling::div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement addChocoChocoCupcake;

    @FindBy(xpath = ".//div[@class='EEeV3']/div[3]")
    @CacheLookup
    WebElement checkout;

    @FindBy(xpath = ".//div[text()='SIGN UP']")
    @CacheLookup
    WebElement signup;

    @FindBy(xpath = ".//input[@id='mobile']")
    @CacheLookup
    WebElement phone;


    @FindBy(xpath = ".//input[@id='name']")
    @CacheLookup
    WebElement name;

    @FindBy(xpath = ".//input[@id='email']")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = ".//input[@id='password']")
    @CacheLookup
    WebElement password;

    //

    @FindBy(xpath = ".//a[text()='CONTINUE']")
    @CacheLookup
    WebElement CONTINUE;

    @FindBy(xpath = "(//div[text()='+'])[1]/following-sibling::div[1]")
    @CacheLookup
    WebElement decRedVelvetCupcake;
//

    //@FindBy(how= How.LINK_TEXT,using="Lost your password?")
    //@CacheLookup
    //WebElement forget_password_link;
    public void navigateTo_AppLogin() {
        driver.get(managers.FileReader.getInstance().getConfigReader().getApplicationUrl());
    }

    public void select_location(){
        String location= managers.FileReader.getInstance().getConfigReader().getLocation();
        location_path.sendKeys(location);

        //findfood.click();

    }
public void locClick(){
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    loc.click();

}
    public void search(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        search.click();

    }

    public void res(){
        String resturdent= managers.FileReader.getInstance().getConfigReader().getRestaurant();
        restaurant.sendKeys(resturdent);

    }

    public void bakary(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bakary_test.click();

    }

    public void address(){
        address.click();
      /*  try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            link.isDisplayed();
            link.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        //link.click();*/


    }

    public void add(){
        System.out.println("**************************************************************** ");
        System.out.println("in add method ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**************************************************************** ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)"); //Scroll vertically down by 1000 pixels
       // js.executeScript("arguments[0].scrollIntoView();",add );

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        add.click();

        System.out.println("**************************************************************** ");
    }
    public void clickplus(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickplus.click();

    }

    public void addTiramisu(){
        System.out.println("**************************************************************** ");
        System.out.println("in addTiramisu add method ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**************************************************************** ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)"); //Scroll vertically down by 1000 pixels
        // js.executeScript("arguments[0].scrollIntoView();",add );

        addTiramisu.click();

        System.out.println("**************************************************************** ");
    }
    public void clickplusTiramisu(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickplusTiramisu.click();

    }
   public void addIrishCoffeeCupcake(){
       System.out.println("**************************************************************** ");
       System.out.println("in Irish Coffee Cupcake add method ");
       try {
           Thread.sleep(10000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("**************************************************************** ");
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,300)"); //Scroll vertically down by 1000 pixels
       // js.executeScript("arguments[0].scrollIntoView();",add );

       addIrishCoffeeCupcake.click();

       System.out.println("**************************************************************** ");
   }
    public void addChocoChocoCupcake(){
        System.out.println("**************************************************************** ");
        System.out.println("in Choco Choco  Cupcake add method ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**************************************************************** ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)"); //Scroll vertically down by 1000 pixels
        // js.executeScript("arguments[0].scrollIntoView();",add );

        addChocoChocoCupcake.click();

        System.out.println("**************************************************************** ");
    }

    public void checkout(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkout.click();

    }
  /*  @FindBy(xpath = "//div[@class='_2pdCL']/div[i]/div/div[2]")
    @CacheLookup
    WebElement cupnameXpath;

    @FindBy(xpath = "//div[@class='_2pdCL']/div[i]/div[2]/div/div/div[4]")
    @CacheLookup
    WebElement cupquantityXpath;*/
    public void chechout_page() {

        Map<String, String> cartverification = new HashMap<String, String>();
        for (int i = 1; i < 5; i++) {
            String cupname=driver.findElement(By.xpath("//div[@class='_2pdCL']/div["+ i + "]/div/div[2]")).getText();
            String cupquantity=driver.findElement(By.xpath("//div[@class='_2pdCL']/div["+ i + "]/div[2]/div/div/div[4]")).getText();
            cartverification.put(cupname, cupquantity);

        }
        /*System.out.println(cartverification);
        System.out.println("******************************************************88");*/
        Map<String, String> cupcakelist= managers.FileReader.getInstance().getConfigReader().getlistcupke();
       /* System.out.println(cupcakelist);
        System.out.println(cartverification.equals(cupcakelist));*/
        Assert.assertEquals(cartverification,cupcakelist);


    }

    public void SIGN_UP(){

        signup.click();


    }
    public void phone(){
        phone.sendKeys("7717770453");

    }
    public void name(){
        name.sendKeys("Richa");

    }

    public void Email(){
        email.sendKeys("richasinha319@gmail.com");

    }
    public void password(){
        password.sendKeys("Richa123*");

    }

    public void CONTINUE(){
        CONTINUE.click();

    }

    public void verifyemail(){
        String expected="Email id already exists";
        Assert.assertEquals(expected,driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div[3]/label")).getText());
    }

    public void deccount(){

        decRedVelvetCupcake.click();
        System.out.println("deccount the cake********************");
    }



}