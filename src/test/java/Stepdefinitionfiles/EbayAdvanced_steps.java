package Stepdefinitionfiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Object_reader;

public class EbayAdvanced_steps {
	Object_reader or;
	WebDriver driver;
	
	public EbayAdvanced_steps (Common_steps cs) throws IOException {
		this.driver=cs.getdriver();	
		or = new Object_reader ();
	}
	
	@Given("I am Ebay Advanced Search Page")
	public void i_am_ebay_advanced_search_page() {
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
		   
	}
	@When("I click on Ebay Logo")
	public void i_click_on_ebay_logo() {
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	   
	}
	@Then("I will be navigated to Ebay Home Page")
	public void i_will_be_navigated_to_ebay_home_page() {
		String expUrl = "https://www.ebay.com/";
	    String actUrl = or.getURL();
	    Assert.assertEquals(actUrl, expUrl);
	    
	}

   @Then("I will search for {string}")
public void i_will_search_for(String str) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(str);
	    driver.findElement(By.cssSelector("input[class='btn btn-prim gh-spr']")).click();
	}
   @Then("I validate the number of search items present")
   public void i_validate_the_number_of_search_items_present() {
		String value=driver.findElement(By.cssSelector("h1[class='srp-controls__count-heading']")).getText();
		System.out.println(value);
	  
	}
   //div[class="s-item__title"]
}
