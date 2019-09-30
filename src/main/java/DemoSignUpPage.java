
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSignUpPage {

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	private WebElement userBox;
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	private WebElement passwordBox;
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement nextButton;
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement confirmButton;

	public void userEntry(String userName) {
		userBox.sendKeys(userName);
	}

	public void passwordEntry(String password) {
		passwordBox.sendKeys(password);
	}

	public void clickeNextButton() {
		nextButton.click();
	}

	public void confirm() {
		confirmButton.click();

	}

}
