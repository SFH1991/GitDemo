package mavenproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static void main(String args[])

    {
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.setHeadless(true);
WebDriver driver=new ChromeDriver(options);
driver.get("https://formy-project.herokuapp.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();

	
	
	/*public void intitializedriver() throws IOException
	{
		
		
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\syedf\\eclipse-workspace\\TestAutomation\\src\\main\\java\\MavenProject\\data.properties");
	pro.load(fis);
	String browsername=pro.getProperty("browser");
	
	if(browsername=="firefox")
	{
System.setProperty(webdriver.chrome.driver, value);		
		
	}
	}*/
	            
    }
}
