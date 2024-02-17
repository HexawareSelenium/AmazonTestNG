package Stepdef;

import com.POM.AdminPage;
import com.POM.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps {
	
	AdminPage ap = new AdminPage();
	LoginPage lp = new LoginPage();
	
	@When("Add valid username <{string}> and password <{string}>")
	public void add_valid_username_and_password(String string, String string2) {
		lp.enterUsername(string);
	    lp.enterPassword(string2);
	}

	@Then("Click Admin")
	public void click_admin() {
	    ap.Admin();
	}

	@Then("Admin clicked")
	public void admin_clicked() {
	    System.out.println("Admin page is loaded");
	}

}
