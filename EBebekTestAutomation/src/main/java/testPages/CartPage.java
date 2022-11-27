package testPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage {
	
	private WebDriver driver;
	public Actions actions;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
	}
	
	public void completeShopping() throws InterruptedException {  //alışverişi tamamla butonuna tıkladım
		WebElement completeShoppingButton = driver.findElement(By.xpath("//button[@id='btnGoToShippingAddress']"));
		completeShoppingButton.click();
		Thread.sleep(5000);
	}

}
