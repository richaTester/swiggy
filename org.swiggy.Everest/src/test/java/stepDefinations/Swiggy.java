package stepDefinations;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import managers.Log;

public class Swiggy {
    TestContext testContext;
    PageObjectRep.Swiggy swiggyPage;

    public Swiggy(TestContext context) {
        testContext = context;
        swiggyPage = testContext.getPageObjectManager().getSwiggyPage();
    }

    @Given("^Navigate to Swiggy$")
    public void navigateToSwiggy() throws Throwable {
        Log.startTestCase("navigate to Application and login with credentials");
        swiggyPage.navigateTo_AppLogin();
    }

    @Then("^Enter delivery location as Indiranagar, Bengaluru$")
    public void enterDeliveryLocationAsIndiranagarBengaluru() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.select_location();

    }

    @Then("^Select first result which is Indiranagar, Bengaluru, Karnataka, India$")
    public void selectFirstResultWhichIsIndiranagarBengaluruKarnatakaIndia() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.locClick();

    }

    @And("^Click on Search$")
    public void clickOnSearch() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.search();
    }

    @Then("^Search for Restaurant called “Bite Me” and Click on it$")
    public void searchForRestaurantCalledBiteMeandClickOnIt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.res();
    }

    @When("^Restaurant loaded$")
    public void restaurantLoaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.bakary();

    }
    @Then("^Click on Bite Me Restaurant$")
    public void clickonBiteMeRestaurant() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.address();

    }
    @When("^Add few items to the cart$")
    public void addFewItemsToTheCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.add();
    }
    @Then("^Add one more red velvet cupcake$")
    public void addOneMoreRedVelvetCupcake() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.clickplus();

    }

    @Then("^click on Tiramisu cupcake$")
    public void click_on_Tiramisu_cupcake() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.addTiramisu();
    }


    @Then("^click on plus to add more Tiramisu cupcake$")
    public void click_on_plus_to_add_more_Tiramisu_cupcake() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.clickplusTiramisu();
    }

    @Then("^click on add for Irish Coffee Cupcake$")
    public void click_on_add_for_IrishCoffeeCupcake() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.addIrishCoffeeCupcake();
    }


    @Then("^click on add for Choco Choco Cupcake$")
    public void click_on_add_for_Choco_Choco_Cupcake() {
        swiggyPage.addChocoChocoCupcake();

    }

    @Then("^click on checkout$")
    public void click_on_checkout() {
        swiggyPage.checkout();

    }


    @Then("^verify item added in chechout page$")
    public void verify_item_added_in_chechout_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.chechout_page();
    }

    @Then("^click on new swiggy$")
    public void click_on_new_swiggy_SIGN_UP() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.SIGN_UP();

    }

    @Then("^pass phone number$")
    public void pass_phone_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.phone();

    }
    @Then("^pass name$")
    public void pass_name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.name();

    }

    @Then("^Enter email$")
    public void Enter_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.Email();

    }

    @Then("^Enter passwordl$")
    public void Enter_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


    }
    @Then("^Enter password$")
    public void enterPassword() throws Throwable {
        swiggyPage.password();
    }
    @Then("^click on CONTINUE$")
    public void click_on_CONTINUE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.CONTINUE();

    }

    @But("^Error message at Email field ​“Email id already exists”​ and  Capture screenshot$")
    public void errorMessageAtEmailField​EmailIdAlreadyExists​AndCaptureScreenshot() throws Throwable {
        swiggyPage.verifyemail();
    }

    @Then("^Change Red Velvet cupcake quantity to One$")
    public void change_Red_Velvet_cupcake_quantity_to_One() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.deccount();

    }


    @And("^Capture screenshot and close  browser$")
    public void captureScreenshotAndCloseBrowser() {
    }

}