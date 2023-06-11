package Stepdefinitionfiles;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Object_reader;

public class Common_steps {
	
	WebDriver driver;
	Object_reader or;
	
	public WebDriver getdriver() {
		return driver;
	}
	@Before
		public void setup() throws IOException, InterruptedException  {
		or=new Object_reader ();
		System.setProperty(or.getEdgekey(), or.getEdgepath());
		 driver = new EdgeDriver();		
		 Thread.sleep(1000);   		
		}
	@After
	public void teardown() {
		driver.quit();
		
	}
}

