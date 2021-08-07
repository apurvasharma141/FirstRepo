package SeleniumSessionn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		TakesScreenshot tc=(TakesScreenshot)driver; //Type Casting
		
		File src=tc.getScreenshotAs(OutputType.FILE); //for taking screenshot
		
		FileHandler.copy(src, new File("C:\\Users\\APURVA\\workspace\\SeleniumSession\\test.png")); 
	
	    
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
