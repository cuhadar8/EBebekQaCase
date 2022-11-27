package testPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.junit.Assert;

public class ProductPage {
	
	private WebDriver driver;
	public Actions actions;
	public String productName = "Mama Kaşığı 2’li Aqua Green- Mellow Yellow";
	
	public ProductPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
    }
	
	public void checkProduct() {//Bu method ile arama sayfasında tıkladığımız ürünler, açılan ürünün aynı olup olmadığını
								//kontrol ettim
		WebElement productInCart = driver.findElement(By.xpath("//div/h1/b"));
		System.out.println(productInCart.getText());
		Assert.assertEquals(productName,productInCart.getText());
		
	}
	
	public void addToCart() throws InterruptedException {//ürünü sepete ekledim
		
		WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='btn btn-add ng-star-inserted']"));
		addToCartButton.click();
		Thread.sleep(3000);
		
	}
	
	public void seeTheCart() throws InterruptedException {//sepeti gör emri verdim
		WebElement seeTheCartButton = driver.findElement(By.xpath("//a[@class='btn add']"));
		seeTheCartButton.click();
		Thread.sleep(3000);
	}

}
