package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectEasy;

public class Dateselect extends ProjectEasy {
	public  Dateselect(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public Dateselect selectday(){
		driver.findElement(By.xpath("//span[text()='Thu']")).click();
		return this;
		
		
	}
	public Dateselect selectschedule()
	{
		driver.findElement(By.xpath("//div[@class='schedules']//a[1]")).click();
		return this;
	}
	 public Seat selectalert()
	 {
		 
		 driver.findElement(By.xpath("//button[text()='Okay']")).click();
		// return this;
		 return new Seat(driver);
	 }
	 
	
	
	
	
	
	
	
	
	
	
	

}
