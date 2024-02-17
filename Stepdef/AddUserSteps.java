package Stepdef;

import com.POM.AdminPage;

import io.cucumber.java.en.Then;

public class AddUserSteps {
	
	AdminPage ap = new AdminPage();

	@Then("Click add user")
	public void click_add_user() {
	    ap.addUser();
	}

	@Then("user details are added")
	public void user_details_are_added() {
	    ap.role();
	    
	}
}
