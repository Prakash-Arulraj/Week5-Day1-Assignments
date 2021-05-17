package week5.day1.Assiqnments;





import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLead1 extends BaseTest{

	/*
	 * 1. Apply the preCondition and postCondition in the base class ( @BeforeMethod
	 * and @AfterMethod) and implement all the 5 leaftaps testcases (
	 * CreateLead,EditLead,DuplicateLead,MergeLead,DeleteLead). 
	 * 2. Implement all the 5 testcases making the annotation attribute "enabled=false" for DeleteLead
	 * testcase alone. Observe how your testcases run.*/
	

	@Test(enabled = false)
	public void createlead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cts");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arulraj");
		driver.findElement(By.name("submitButton")).click();

		

	}

}
