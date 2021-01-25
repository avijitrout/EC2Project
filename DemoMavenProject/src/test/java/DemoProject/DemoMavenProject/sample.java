package DemoProject.DemoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Maven\\chromedriver_win32\\chromedriver.exe");  
		
		// Instantiate a ChromeDriver class.     
		
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("headless");
		 WebDriver driver=new ChromeDriver(options);
		  // Launch Website  
		  driver.get("http:www.google.com"); 
		 
		//Maximize the browser  
		 driver.manage().window().maximize();  
		 System.out.println(driver.getTitle());

	}

}
