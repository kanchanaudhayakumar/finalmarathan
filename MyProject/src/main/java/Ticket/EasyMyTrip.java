package Ticket;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EasyMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.id("oway")).click();
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.xpath("(//div[@class='mflexcol']//p)[13]")).click();
		driver.findElement(By.id("a_Editbox13_show")).click();
		driver.findElement(By.xpath("//div[@id='toautoFill']/ul[1]/li[2]/div[1]/div[1]/p[1]")).click();
		driver.findElement(By.xpath("//li[@class='active-date']/following-sibling::li[1]")).click();
		//driver.findElement(By.id("rdate")).click();
		//driver.findElement(By.xpath("//li[@class='active-date']/following-sibling::span[2]")).click();
		driver.findElement(By.xpath("//i[@class='downArwSe']")).click();
		driver.findElement(By.xpath("//button[@id='add']")).click();
		driver.findElement(By.xpath("(//button[@id='add'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='dn_btn']")).click();
		driver.findElement(By.xpath("//button[text()=' Search']")).click();
		
		Actions act =new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all')]"));
		act.dragAndDropBy(drag,20, 0).build().perform();
		WebElement drop= driver.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle ui-corner-all')])[2]"));
		act.dragAndDropBy(drop,200, 0).build().perform();
		//driver.findElement(By.xpath("//div[@class='prc_val pr1-sec']")).click();

		 driver.findElement(By.xpath("//div[@class='d-up']")).click();
		 driver.findElement(By.xpath("//li[text()='Fare Details & Rules']")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'btn book-bt-n')]")).click();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("(//strong[@class='ng-binding'])[2]"));
		javascript.executeScript("arguments[0].scrollIntoView();", element);
		  File source = element.getScreenshotAs(OutputType.FILE);
		  File target = new File("./snap/easemytrip.png");
		  FileUtils.copyFile(source, target);
		  System.out.println("Page Title:" + driver.getTitle());
		
		
		
		
	
	}

}
