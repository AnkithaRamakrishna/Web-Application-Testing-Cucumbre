package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
//import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");					

       //System.setProperty("webdriver.gecko.driver", "E://Selenium//Selenium_Jars//geckodriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();	
       Thread.sleep(5000);
       driver.navigate().to("http://www.demo.guru99.com/v4");
       Thread.sleep(5000);
    }		

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys(username);					
       driver.findElement(By.name("password")).sendKeys(password);					
    }		

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}