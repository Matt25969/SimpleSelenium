import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Step3 {
	
	WebDriver driver;
	String url = "http://asp.thedemosite.co.uk/";
	
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
		
		pause(2);
		
		
		
		driver.findElement(By.xpath
				("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/small/strong/a[3]"))
		.click();
		
		pause(2);
		
		
		String result = driver.findElement(By.xpath("/html/body/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[1]/font/small")).getText();
		
		System.out.println(result);
		
		Assert.assertEquals("Add Your test username:", result);
		
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
