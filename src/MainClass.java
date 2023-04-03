//import java.util.Date;
//import java.text.DateFormat;
//import java.time.LocalDate;
//import java.util.Calendar;
//import java.text.DateFormat;
//import java.time.Duration;
//import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Random;

public class MainClass extends Parameters {
	@Test()
	public void check_the_language() {
		WebElement WelcomeMessage = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div[2]/div/div/div/h1"));
		String ActualWelcomeMessage = WelcomeMessage.getText();

		myAssert.assertEquals(ActualWelcomeMessage, expectedWelcomeMsg);
		myAssert.assertAll();
}

//	@Test()
//	public void check_the_currency() {
//		WebElement actualCurrency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//		String ActualCurrencyValue = actualCurrency.getText();
//		myAssert.assertEquals(ActualCurrencyValue, expectedCurrency);
//
//		myAssert.assertAll();
//
//	}

//	@Test()
//	public void check_the_contact_number() {
//		WebElement contactNumber = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong"));
//
//		String actualContactNumberValue = contactNumber.getText();
//
//		myAssert.assertEquals(actualContactNumberValue, expectedContactNumber);
//		myAssert.assertAll();
//
//	}

//	@Test()
//	public void check_the_Qitaf_logo() {
//		WebElement Qitaf_logo = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]/img"));
//		String theLogoSource = Qitaf_logo.getAttribute("src");
//		myAssert.assertEquals(theLogoSource, expectedLogoSource);
//
//	}

//	@Test()
//	public void hotel_tab_is_not_selected_by_default() {
//
//		WebElement hoteltab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String hotelTabIsSelcted = hoteltab.getAttribute("aria-selected");
//		myAssert.assertEquals(hotelTabIsSelcted, "false");
//		myAssert.assertAll();
//	}

//	@Test()
//	public void test_depature_date() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Date now = new Date();
//		DateFormat currentDate = DateFormat.getDateInstance();
//		String dateToString = currentDate.format(now).toString();
//		String dayOfDate[] = dateToString.split(" ");
//		String theDayItSelf = dayOfDate[1].replace(",","");
//		
//		int CurrentDate = Integer.parseInt(theDayItSelf);
//		System.out.println(CurrentDate);
//		String DayintheWebSite = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]")).getText();
//
//		int DayintheWebSiteValue = Integer.parseInt(DayintheWebSite);
//		myAssert.assertEquals(DayintheWebSiteValue, CurrentDate + 1);
//		myAssert.assertAll();
//		
//
//}

//	
//	@Test()
//	public void test_return_date() {
//		Date now = new Date();
//		DateFormat currentDate = DateFormat.getDateInstance();
//		String dateToString = currentDate.format(now).toString();
//		String dayOfDate[] = dateToString.split(" ");
//		String theDayItSelf = dayOfDate[1].replace(",","");
//		
//		int CurrentDate = Integer.parseInt(theDayItSelf);
//		System.out.println(CurrentDate);
//		String DayintheWebSite=driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]")).getText();
//		int DayintheWebSiteValue = Integer.parseInt(DayintheWebSite);
//		myAssert.assertEquals(DayintheWebSiteValue, CurrentDate + 2);
//		myAssert.assertAll();
//		
//	}

//	@Test()
//	public void random_method_to_change_language() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String[] languagelist = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar"};
//		Random rand = new Random();
//		
//		int randomValue = rand.nextInt(1,1000) % 2;
//		System.out.println(randomValue + "**********");
//		driver.get(languagelist[randomValue]);
//		
//		if(randomValue==0) {
//			myAssert.assertEquals(driver.getTitle(), "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
//			myAssert.assertAll();
//		}else {
//			myAssert.assertEquals(driver.getTitle(), "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
//			myAssert.assertAll();
//		}
//	}

//	@Test()
//	public void switch_to_hotel_tab() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		String[] languagelist = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//		Random rand = new Random();
//		int randomValue = rand.nextInt(1, 1000) % 2;
//		driver.get(languagelist[randomValue]);
//		String EnglishRandomCities[] = { "Dubai", "Jeddah", "Riyadh" };
//		String ArabicRandomCities[] = { "جدة", "دبي" };
//		int RandomCitiyNumberEnglish = rand.nextInt(1, 1000) % 3;
//		int RandomCitiyNumberARABIC = rand.nextInt(1, 1000) % 2;
//
//		if (randomValue == 0) {
//			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
//
//			driver.findElement(By.xpath(
//
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"))
//					.sendKeys(EnglishRandomCities[RandomCitiyNumberEnglish]);
//			Thread.sleep(1000);
//			driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/ul/li[2]/div/span[2]"))
//					.click();
//			driver.findElement(
//					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[4]/button"))
//					.click();
//
//		} else {
//			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
//
//			Thread.sleep(1000);
//			driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"))
//					.sendKeys(ArabicRandomCities[RandomCitiyNumberARABIC]);
//			Thread.sleep(1000);
//
//			driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/ul/li[2]/div/span[1]"))
//					.click();
//			driver.findElement(
//					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[4]/button"))
//					.click();
//		}
//
//		WebElement lowestPriceTab = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
//		lowestPriceTab.click();
//			Thread.sleep(3000);
//
//			Random rand2 = new Random();
//			int randomValue2 = rand.nextInt(1, 1000) % 2;
//			WebElement roomSelection = driver.findElement(
//					By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
//			Select mySelect = new Select(roomSelection);
//			mySelect.selectByIndex(randomValue2);
//
//			String completeTheSearchProcess = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"))
//					.getText();
//
//
//			List<WebElement> prices = driver.findElements(By.className("Price__Value"));
//
//			String first_element_price = prices.get(0).getText();
//			int updated_first_element_price = Integer.parseInt(first_element_price);
//			String last_element_price = prices.get(prices.size() - 1).getText();
//			int updated_last_elemenet_price = Integer.parseInt(last_element_price);
//
//			myAssert.assertEquals(updated_last_elemenet_price > updated_first_element_price, true,
//					"to check that the first price is lower than the last one");
//			myAssert.assertEquals(
//					completeTheSearchProcess.contains("found") || completeTheSearchProcess.contains("وجدنا"), true,
//					"if the word found or 'وجدنا' were there the test pass");
//
//			myAssert.assertAll();
//
//
//
//	}

//	@Test()
//
//	public void LOWEST_PRICE() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//		WebElement HotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		HotelTab.click();
//
//		WebElement searchTab = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
//		Random rand = new Random();
//
//		int RandomValue = rand.nextInt(0, 3);
//
//		String EnglishRandomCities[] = { "Dubai", "Jeddah", "Riyadh" };
//
//		searchTab.sendKeys(EnglishRandomCities[RandomValue]);
//
//		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"))
//				.click();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]")).click();
//
//		
//
//
//
//	}

}


	