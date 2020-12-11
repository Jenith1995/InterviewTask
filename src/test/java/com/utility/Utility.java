package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;

	public static void launchDriver() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notification");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
	}

	public static void insert(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void click(WebElement element) {

		element.click();

	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {

		driver.get(url);

	}
	
	public static void implicitWait(int timeout) {
		
            driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);	

	}

	public static  void excelRead() throws FileNotFoundException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\InputDatas\\InputDatas.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		
		
		  
		
	}

}
