import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Sudhakar on 25/03/2016.
 */
public class StepDef {
    homepage home=new homepage();
    Myaccount myac= new Myaccount();
    addsupplier newsupplier =new addsupplier();
    LogoutAC logout= new LogoutAC();
    Buyer buyer= new Buyer();
    verifyingnewbuyer verifybuyer= new verifyingnewbuyer();


    @Given("^I am navigavitive to the Narmans web page$")
    public void i_am_navigavitive_to_the_Narmans_web_page() throws Throwable {
        Assert.assertTrue(home.isOnHomePage().endsWith(".php"));
    }
    @And("^I enter the username and password$")
    public void i_enter_the_username_and_password() throws Throwable {
  home.Loginin();
    }

    @When("^I goto supplier and enter the details$")
    public void i_goto_supplier_and_enter_the_details() throws Throwable {
        myac.gotosupplier();
        myac.enterfield();

    }

    @Then("^I am check new supplier$")
    public void i_am_check_new_supplier() throws Throwable {
        newsupplier.verifyingsupplier();

    }

    @And("^I am logout my account$")
    public void i_am_logout_my_account() throws Throwable {
    logout.myaccountlogout();

    }
    //create buyer steps
    @Given("^I am goto buyers and enter the details$")
    public void i_am_goto_buyers_and_enter_the_details() throws Throwable {
        System.out.println("its going to buyer.....");
        buyer.enterbuyerdetail();
    }

    @When("^I am check new buyers$")
    public void i_am_check_new_buyers() throws Throwable {
        System.out.println("this is verifying detalis");
       verifybuyer.verifybuyer();
    }
    @Then("^I am logout my accounts$")
    public void i_am_logout_my_accounts() throws Throwable {
        logout.myaccountlogout();
    }
}
