import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.get("http://localhost:8181/SeleniumDemo/");
		System.out.println(d.getTitle());
		//d.findElement(By.tagName("a")).click();
		//d.findElement(By.id("Link1")).click();
		d.findElement(By.className("someeffect")).click();
		
		d.findElement(By.id("uname")).sendKeys("surbhi");
		d.findElement(By.id("pwd")).sendKeys("12345");
		d.findElement(By.id("login")).click();
		d.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(d.findElement(By.id("text")).getText());
		try {Thread.sleep(2000);} 
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		d.close();
				

	}

}