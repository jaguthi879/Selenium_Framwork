package Stepdefinitionfiles;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.Object_reader;

public class EbayHome_Step {
	Object_reader or;
	WebDriver driver;
	
	public  EbayHome_Step(Common_steps cs) throws IOException {
		this.driver=cs.getdriver();	
		or = new Object_reader ();
		
	}
	@Given("I am on Eaby Home Page")
	public void i_am_on_eaby_home_page() throws IOException {
		
		 driver.get(or.getURL());
	   
	}
	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.linkText("Advanced")).click();
	    
	}
	@Then("I should  navigate to Advanced Search page")
	public void i_should_navigate_to_advanced_search_page() {
		String text=driver.findElement(By.xpath("//div[@class='adv-heading__title large-text-2']")).getText();
		Assert.assertEquals(text, "Advanced Search");
	    
	}
	@When("I serach for {string} in {string} category")
	public void i_serach_for_in_category(String string, String string2) throws InterruptedException {
	   driver.findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input']")).sendKeys(string);
	   
	   /*List<WebElement>cat= (List<WebElement>) driver.findElement(By.xpath("//select[@id='gh-cat']/option"));
	   for(WebElement x:cat) {
		   driver.findElement(By.cssSelector(string2));
		   if(x.getText().trim().equals(string2)) {
			   x.click();
			   break;
		   }
	   }*/
	   Select category = new Select(driver.findElement(By.xpath("//select[@class='gh-sb ']")));
		category.selectByVisibleText(string2);
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[class='btn btn-prim gh-spr']")).click();
	   
}
}

	
