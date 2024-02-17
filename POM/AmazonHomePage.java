package com.amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.POM.BasePage;

public class AmazonHomePage extends BasePage{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	public WebElement login;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement textSearch;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[6]/div/div[1]")
	public WebElement suggestion;
	
	public void login() {
		login.click();
	}
	
	public void enterSearch(String str) {
		textSearch.click();
		textSearch.sendKeys(str);
	}
	
	public void Suggestion() {
		suggestion.click();
	}
}
