package testng;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

public class test1 {
	WebDriver driver;
String str;
	@BeforeClass
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkipc\\work\\chromedriver.exe");
		
			driver=new ChromeDriver();
	}
	@Test(priority = 1)
	public void readfromnotepad() throws IOException{
		String TestFile="C:\\Users\\venkipc\\Documents\\data.txt";
		FileReader FR= new FileReader(TestFile);
		BufferedReader BR= new BufferedReader(FR);
		String Content="";
		
		if((Content= BR.readLine())!=null){
			
			String str= Content;
			System.out.println(str);
		
		
		}
		
		
	}
	
	
	
	
	@Test(priority = 2)
	public  void verify()  throws IOException{
		// TODO Auto-generated method stub

driver.get("https://github.com/rails");
WebElement element= driver.findElement(By.xpath("//input[@class='form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus js-site-search-field is-clearable']"));

element.sendKeys("rails");
element.sendKeys(Keys.ENTER);


String source= driver.getPageSource();

Assert.assertTrue(source.contains("44 repository results"));
	
		
	}

	@AfterClass
	public void close() {
		
		driver.quit();
	}
	}




