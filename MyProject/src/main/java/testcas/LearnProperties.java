package testcas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop =new Properties();
		//path
		FileInputStream fis =new FileInputStream(new File("./src/main/resources/config.properties"));
		//load
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("search"));
	}

}
