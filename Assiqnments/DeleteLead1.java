package week5.day1.Assiqnments;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead1 extends BaseTest{

	@Test(enabled = false)
	public void deletelead() throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("prakash");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();		
		driver.findElement(By.linkText("Delete")).click();
		/*
		 * driver.findElement(By.linkText("Find Leads")).click();
		 * driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(name
		 * ); driver.findElement(By.xpath("//td[text()='Find Leads']")).click();
		 * Thread.sleep(3000); String text =
		 * driver.findElement(By.className("x-paging-info")).getText();
		 * if(text.equals("No records to display")) {
		 * System.out.println("text matched"); }else {
		 * System.out.println("text not matched"); }
		 */

	}

}
