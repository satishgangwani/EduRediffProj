package reUsableFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	
	public WebDriver driver;
	
	public  WebDriver initBrowser(String browser)
	{
		if (browser == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if (browser == "Firefox")
		{
			System.setProperty("webdriver.firefox.driver", "E:\\Selenium_1\\Chrome driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if (browser == "Safari")
		{
			System.setProperty("webdriver.safari.driver", "E:\\Selenium_1\\Chrome driver\\safaridriver.exe");
			driver = new SafariDriver();
		}
		
		return driver;
	}

}
