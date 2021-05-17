package week5.day1.Assiqnments;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class EditLead1 extends BaseTest {

	
	@Test(dependsOnMethods = "week5.day1.Assiqnments.CreateLeads.createlead1")
	public void editlead() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("10966");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_firstNameLocal")).sendKeys("prem kumar");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		

	}

}
