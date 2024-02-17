package Stepdef;

import com.Generic.DriverUtils;
import com.POM.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Given("Login url")
	public void login_url() {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

	@When("add valid username <{string}> and password <{string}>")
	public void add_valid_username_and_password(String string, String string2) {
	    lp.enterUsername(string);
	    lp.enterPassword(string2);
	   
	}

	@Then("Login successfull")
	public void login_successfull() {
	    lp.submitButton();
	   
	}
	

}
