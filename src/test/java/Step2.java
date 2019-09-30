import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step2 {
	
	WebDriver driver;
	String url = "http://www.google.com";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver76.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void method1() {
		driver.manage().window().maximize();
		driver.get(url);
		
		pause(5);
		
	}
	
	public void pause(int length) {
		try {
			Thread.sleep(length * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
