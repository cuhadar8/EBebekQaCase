package testPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {

	private WebDriver driver;
	

	public SearchPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public void scrollBar() throws InterruptedException {  //Bu method ile sayfayı aşağı kaydırıyoruz
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");  
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);          //Dinamik olarak kaydırdıkça yüklendiği için iki kez aşağı indirdim ve yüklenmesi için
	}								//bekleme emri verdim
	
	public void openProductPage() throws InterruptedException {
		
		WebElement product = driver.findElement(By.xpath("//eb-product-list-item[43]"));
		product.click();  //xpath'i ile konumuna eriştiğimiz ürünün tıklama emrini verdim
		Thread.sleep(5000);
		
	}

}
