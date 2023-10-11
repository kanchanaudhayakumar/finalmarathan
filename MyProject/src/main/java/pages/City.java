package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectEasy;

public class City extends ProjectEasy {
	public  City(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public City selectcity()
	{
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@class='search']")).sendKeys("Chennai",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Chennai'])[2]")).click();
		System.out.println("Page Title:" + driver.getTitle());
		return this;
		
	}
	public Dateselect image()
	{

		driver.findElement(By.xpath("(//div[@class='movie-info full-width'])[1]")).click();
		//return this;
		 return new Dateselect(driver);
		
	}

	
	
	
}
