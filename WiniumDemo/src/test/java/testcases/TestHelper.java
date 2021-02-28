package testcases;

import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;

public class TestHelper {
	public static String testAppPath;
	public static String winiumDriverPath = "http://localhost:9999";
	// public static WiniumDriver driver;
	public static WiniumDriver driver;

	@BeforeTest
	public static void configureURL() {
		testAppPath = "C:\\Windows\\System32\\calc.exe";
	}

	public static void launchCalculator() throws MalformedURLException, InterruptedException {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath(testAppPath);
		driver = new WiniumDriver(new URL(winiumDriverPath), option);
		Thread.sleep(5000);
	}

	@AfterMethod
	public static void closeCalculator() throws Exception {
		try {
			if (driver != null)
				driver.close();
		} catch (Exception e) {
			throw (e);
		}
	}
}
