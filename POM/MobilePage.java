package com.amazon.POM;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.POM.BasePage;

public class MobilePage extends BasePage {

	WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	public WebElement mobile;
	
	@FindBy(css = "input#add-to-cart-button[type='submit']")
	public WebElement addToCartButton;
	
	public void mobile() {
		js.executeScript("arguments[0].scrollIntoView();", mobile);
		mobile.click();
		
        String parent_handle= driver.getWindowHandle();
        System.out.println(parent_handle);
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:handles)
            if(!parent_handle.equals(handle1))
            {
                driver.switchTo().window(handle1);            
                break;
            }	
        
        js.executeScript("window.scrollBy(0, 500)");
	}
	
	public void cart() {
		addToCartButton.click();
	}
	
	
}
