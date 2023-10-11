package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadData;


public class ProjectEasy {
	
	

	public ChromeDriver driver;
	public String excelFile;
	public static Properties prop1,prop;
	
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException
	{
		String[][] readData = ReadData.readData(excelFile);
		return readData;
	}
	 
	@BeforeMethod
	public void lauchBrowser()throws IOException{
		

		driver = new ChromeDriver();
	 ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("//www.justickets.in/");
		Properties prop =new Properties();
		//path
		FileInputStream fis =new FileInputStream(new File("./src/main/resources/config.properties"));
		//load
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		String  srch = prop.getProperty("search");
		
		 prop1 =new Properties();
		//path
		FileInputStream fis1 =new FileInputStream(new File("./src/main/resources/config.properties"));
		//load
		prop1.load(fis1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

}
		
	@AfterMethod
	public void tearDown()
		{
	driver.close();	
	}
	
}