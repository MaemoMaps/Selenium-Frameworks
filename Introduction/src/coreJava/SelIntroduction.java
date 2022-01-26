package coreJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome- ChromeDriver -> Methods
		//Chrome driver consists of web driver(empty methods) + its own methods
		//ChromeDriver driver = new ChromeDriver();- (this instance does not restrict us to methods that are only available to interface web driver that supports all drivers. It also allows us to access methods unique to chrome driver that will not work in other drivers)
	
		//chromedriver exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maemom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//webdriver.chrome.driver
		WebDriver driver = new ChromeDriver(); //we use web driver to make sure that we access universal methods found in the web driver interface that can be used by all drivers(Firefox, safari, explorer)
		driver.get("https://www.makro.co.za");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
