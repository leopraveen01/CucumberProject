package org.StepDefinitionHookConcept;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.baseclass.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends LibGlobal{
	
	@Before("@reg")
	public void beforeHooks() {
         System.out.println("hook 1");
     	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
	}
	
	@After
	public void After1Hooks() {
        System.out.println("After hooks 1");

	}
	
	

}
