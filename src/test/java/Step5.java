
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Step5 {

	WebDriver driver;
	Actions action;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver76.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void addUserTest() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/addauser.php");
//		DemoSignUpPage dsp = new DemoSignUpPage();
		DemoSignUpPage signup = PageFactory.initElements(driver, DemoSignUpPage.class);
		signup.userEntry("Username");
		signup.passwordEntry("Password");
		signup.confirm();
		signup.clickeNextButton();
		DemoLoginPage login = PageFactory.initElements(driver, DemoLoginPage.class);
		login.userLoginEntry("Username");
		login.passwordLoginEntry("Password");
		login.clickeNextButton();
		
		WebElement myElement = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("Expected Login successful", "**Successful Login**", myElement.getText());

	}

}
