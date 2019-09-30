import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step4 {

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

		driver.findElement(By
				.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/small/strong/a[3]"))
				.click();
		driver.findElement(
				By.xpath("/html/body/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/input"))
				.sendKeys("Username");
		driver.findElement(
				By.xpath("/html/body/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("Password");
		driver.findElement(
				By.xpath("/html/body/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/input"))
				.click();
		driver.findElement(By
				.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/small/strong/a[4]"))
				.click();
		driver.findElement(
				By.xpath("/html/body/form/div[1]/center/table/tbody/tr/td/div/center/table/tbody/tr[1]/td[2]/input"))
				.sendKeys("Username");
		driver.findElement(
				By.xpath("/html/body/form/div[1]/center/table/tbody/tr/td/div/center/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("Password");

		driver.findElement(
				By.xpath("/html/body/form/div[1]/center/table/tbody/tr/td/div/center/table/tbody/tr[3]/td[2]/input"))
				.click();
		
		String result = driver.findElement(By.xpath("/html/body/big/blockquote/blockquote/div/h2/font/center/b")).getText();
		
		assertEquals("**Successful Login**", result);

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
