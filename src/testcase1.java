import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1 {
WebDriver driver;
@BeforeMethod
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkipc\\work\\chromedriver.exe");
	
	driver=new ChromeDriver();
}
@Test
public void verify()throws Exception
{
	
driver.get("https://github.com/rails");
WebElement element= driver.findElement(By.xpath("//h1[@class='text-gray-dark lh-condensed mb-1 mb-md-2']"));
String strng=element.getText();
Assert.assertTrue(strng.contains("Ruby on Rails"));
driver.close();
}


}
