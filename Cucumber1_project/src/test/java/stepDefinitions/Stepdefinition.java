package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;
	String Expected = "";
	String Actual = "";
	@Given("^Launch url \"([^\"]*)\" in a browser$")
	public void launch_url_in_a_browser(String url) throws Throwable {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    Thread.sleep(2000);
	}

	@When("^Enter user as \"([^\"]*)\" in username$")
	public void enter_user_as_in_username(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^Enter pass as\"([^\"]*)\" in password$")
	public void enter_pass_as_in_password(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		    Thread.sleep(2000); 
	}

	@When("^click pim$")
	public void click_pim() throws Throwable {
		  driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();  
	}

	@When("^Click Add button$")
	public void click_Add_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		  Thread.sleep(2000);
	}

	@When("^Enter fname \"([^\"]*)\" in firstname textbox$")
	public void enter_fname_in_firstname_textbox(String FirstName) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(FirstName);  
	}

	@When("^Enter mname \"([^\"]*)\" in mname textbox$")
	public void enter_mname_in_mname_textbox(String MiddleName) throws Throwable {
		driver.findElement(By.name("middleName")).sendKeys(MiddleName);
	}

	@When("^Enter lname \"([^\"]*)\" in last name textbox$")
	public void enter_lname_in_last_name_textbox(String LastName) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(LastName);   
	}

	@When("^Capture Eid BeforeAdding Employee$")
	public void capture_Eid_BeforeAdding_Employee() throws Throwable {
		  Expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("^Click save button$")
	public void click_save_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@id='btnSave']")).click(); 
	}

	@When("^capture Eid After Adding employee$")
	public void capture_Eid_After_Adding_employee() throws Throwable {
		  Actual = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	}

	@Then("^Valid empoyee id before and after$")
	public void valid_empoyee_id_before_and_after() throws Throwable {
		if(Expected.equals(Actual))
	    {
	    	System.out.println("Add Employee success::"+Expected+"   "+Actual);
	    }
	    else
	    {
	    	System.out.println("Add Employee Fail::"+Expected+"   "+Actual);
	    }
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    driver.quit();
	}
}
