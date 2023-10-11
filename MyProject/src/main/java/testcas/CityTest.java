package testcas;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectEasy;
import pages.City;

public class CityTest extends ProjectEasy{

	
	
	@BeforeTest
	public  void setup() {
		// TODO Auto-generated method stub
		excelFile="card";
}
	
	@Test(dataProvider="fetchData")
	public void runEasyTicket(String Card,String Date,String Cvv,String Name,String Email,String Phone ) throws IOException, InterruptedException
	{
		//System.out.println(driver);
		City et= new City(driver);
		et.selectcity()
		.image()
		.selectday()
		.selectschedule()
		.selectalert()
		.selectseat()
		.confirmTicket()
		.seatDetails()
		.priceDetails()
		.selectCreditcard()
		.entercardno(Card)
		.enterExpairy(Date)
		.enterCvv(Cvv)
		.entername(Name)
		.phone(Phone)
		.email(Email)
		.confirmlink();
		
		
		
		
		
		
	}
}
