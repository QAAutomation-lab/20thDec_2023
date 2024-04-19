package autoitexample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example1 extends SeleniumUtility{

	@Test
	public void testUploadFeature() {
		setUp("chrome", "https://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Asus\\Desktop\\download.png");
	}
	
	@Test
	public void testUploadFeatureUsingAutoIT() throws IOException {
		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('file-upload').click();");
		Runtime.getRuntime().exec("F:\\AuotItSample\\FileUpload.exe");
		//driver.findElement(By.xpath("//input[@type='file']")).click();
	}
}
