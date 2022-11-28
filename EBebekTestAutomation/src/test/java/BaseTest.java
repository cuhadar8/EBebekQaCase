import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import testPages.CartPage;
import testPages.HomePage;
import testPages.LoginPage;
import testPages.ProductPage;
import testPages.SearchPage;

public class BaseTest {

	private static WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		String baseUrl = "https://www.e-bebek.com/";    
		ChromeOptions options = new ChromeOptions();        //Options objesini site açıldığında çıkan bildirimlere izin ver
		options.addArguments("--disable-notifications");	//pencerisini doğrudan kapatmak için tanımladım ve kullandım
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();                //Açılan pencereyi büyütmek için kullandım.
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get(baseUrl);                               	//Sayfayı açmak için kullandığımız methot
	}
	
	@Test
	public void Test() throws InterruptedException  {
		HomePage homePage = new HomePage(driver);
		homePage.clickSearchButton();
		homePage.searchProduct("kaşık maması");
		
		SearchPage searchPage = new SearchPage(driver);
		searchPage.scrollBar();
		searchPage.openProductPage();	
		
		ProductPage productPage = new ProductPage(driver);
		productPage.checkProduct();
		productPage.addToCart();
		productPage.seeTheCart();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.completeShopping();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.checkTitle();
	}
	
	
}
