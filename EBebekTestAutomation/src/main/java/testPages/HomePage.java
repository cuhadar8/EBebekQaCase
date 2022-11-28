package testPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	private By searchBoxPath = By.id("txtSearchBox");   //Sitedeki arama çubuğunun konumunu ID ile belirledim.
	
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void clickSearchButton() throws InterruptedException {
		WebElement searchButton = driver.findElement(searchBoxPath);
		searchButton.click();                //Öncelikle bu butona tıklama emri verdim
		Thread.sleep(3000);
		
	}
	
	public void searchProduct(String prodcutName) throws InterruptedException {
		WebElement searchButton = driver.findElement(searchBoxPath);
		searchButton.sendKeys(prodcutName);    //daha sonra arama çubuğuna aramak istediğimiz ürünün adı buraya yazılıyor.
		Thread.sleep(5000);
		searchButton.sendKeys(Keys.ENTER);		//ürün adı yazıldıktan sonra enter'a basma emrini verdim
		Thread.sleep(5000);
	}

}
