import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step1 {
	
	WebDriver driver;
	String url = "http://www.google.com";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver76.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void method1() {
		driver.manage().window().maximize();
		driver.get(url);		
	}


}
