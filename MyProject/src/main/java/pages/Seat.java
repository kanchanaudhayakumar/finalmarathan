package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectEasy;

public class Seat extends ProjectEasy{
	
	public  Seat(ChromeDriver driver)
	{
		this.driver=driver;
		
	}

	public Seat selectseat()
	{
		driver.findElement(By.xpath("//div[text()='J12']")).click();
		driver.findElement(By.xpath("//div[text()='J13']")).click();
		return this;
	}
	
	 public FinalTicket confirmTicket()
	 {
		 driver.findElement(By.xpath("//div[@class='box progress enabled']")).click();
		// driver.findElement(By.xpath("//button[text()='Okay']")).click();
		// return this;
		 return new FinalTicket(driver);
	 }
	
	
}
