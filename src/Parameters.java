import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class Parameters {
	WebDriver driver = new ChromeDriver();
	String expectedWelcomeMsg = "Let’s book your next trip!";
	String expectedCurrency = "SAR";
	String expectedContactNumber = "+966554400000";
	String expectedLogoSource = "https://tjwlcdn.com/next/images/apple-pay.svg"; 
	SoftAssert myAssert = new SoftAssert();
	

@BeforeTest
public void setup() {

		driver.get("https://www.almosafer.com/en");

}
}
