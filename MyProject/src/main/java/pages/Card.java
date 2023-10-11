package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectEasy;

public class Card  extends ProjectEasy {
	public Card(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public Card selectCreditcard() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='Pay with  Credit / Debit Card ']")).click();
	Thread.sleep(500);	
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'bill shadow-small')]//table"));
		
		
		
		File source = element.getScreenshotAs(OutputType.FILE);
		  File target = new File("./snap/justtickets.png");
		  FileUtils.copyFile(source, target);
		return this;
		
	}
	public Card entercardno(String Card)
	{
		 driver.findElement(By.xpath("//label[text()='Card Number']/following::input")).sendKeys(Card);
		return this;
		
	}
	public Card enterExpairy(String Date)
	{
		  driver.findElement(By.xpath("//label[text()='Expiry Date']/following::input")).sendKeys(Date);
		return this;
	}
	
	public Card enterCvv(String Cvv)
	{
		  //driver.findElement(By.xpath("//label[text()='Expiry Date']/following::input")).sendKeys(Date);
		  driver.findElement(By.xpath("(//span[text()=' with Moviepass to autofill your details.']/following::input)[3]")).sendKeys(Cvv);
		return this;
	}
	public Card entername(String Name)
	{
	
		  driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys(Name);
		  
		  return this;
		  		  
	}
	
	public Card email(String Email)
	{
		driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[2]")).sendKeys(Email);
		return this;
		
	}
	public Card phone(String Phone)
	{
		  driver.findElement(By.xpath("//span[text()='+91']/following::input")).sendKeys(Phone);
		  return this;
		  
		
	}
	public Card confirmlink()
	{
	 boolean enabled = driver.findElement(By.xpath("//span[@class='disabled']")).isSelected();
	 System.out.println("Link is :" +enabled);
    return this;
	}
	
}