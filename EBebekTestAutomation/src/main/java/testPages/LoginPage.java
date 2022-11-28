package testPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	private WebDriver driver;
	
	private String title = "Üyelik";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkTitle() { //Üyelik ekranının açılıp açılmadığını kontrol ettim
		WebElement membershipTitle = driver.findElement(By.xpath("//h1[@class='title-primary text-center mb-5']"));
		System.out.println(membershipTitle.getText());
		Assert.assertEquals(membershipTitle.getText(), title);//Bu kontrol içinde ekranda çıkan Üyelik yazısının xpath ini kullandım.
	}
	
	
	
	

}
