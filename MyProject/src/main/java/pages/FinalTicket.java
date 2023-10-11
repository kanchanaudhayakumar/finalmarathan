package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectEasy;

public class FinalTicket extends ProjectEasy {
	public FinalTicket(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public FinalTicket seatDetails() throws InterruptedException
	{
		WebElement selectedSeats = driver.findElement(By.xpath("(//div[@class='box'])[1]"));
        Thread.sleep(500);
        return this;
}
	public Card priceDetails() throws InterruptedException
	{
	 WebElement totalAmount = driver.findElement(By.xpath("(//div[@class='box'])[3]"));
     Thread.sleep(500);
     return new Card(driver);
}

}
