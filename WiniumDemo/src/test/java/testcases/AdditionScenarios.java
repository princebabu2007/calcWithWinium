package testcases;

import calcscreens.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionScenarios extends TestHelper {

	//@Test (priority = 0) // Add two numbers 1 and 2
	void verifyAddition_Two_Numbers() throws MalformedURLException, InterruptedException {
		String expected_Res = "3";
		launchCalculator();
		StandardView std = new StandardView(driver);
		//driver.findElement(By.id("131")).click();
		String actualResult = std.getAdditionResult(1, 2);
		System.out.println("Actual Result is " + actualResult);
		Assert.assertEquals(actualResult, expected_Res, "Addition result of two numbers is Wrong!!  ");
	}
	
	//@Test (priority = 0) // Add two numbers 1 , 2 and 3
	void addition_three_Numbers() throws MalformedURLException, InterruptedException {
		String expected_Res = "6"; // Addition result of 1,2 and 3.
		launchCalculator();
		StandardView std = new StandardView(driver);
		String actualResult = std.getAdditionResult(1,2,3);
		System.out.println("Actual Result is " + actualResult);
		Assert.assertEquals(actualResult, expected_Res, "Addition result of three numbers is Wrong!!  ");
	}
	
	//@Test (priority = 0) // This Test case is to read Excel sheet for the input
		void addition_Two_Numbers_From_File() throws MalformedURLException, InterruptedException {
			String expected_Res = "6"; // Addition result of 1,2 and 3.
			launchCalculator();
			StandardView std = new StandardView(driver);
			String actualResult = std.getAdditionResult(1,2,3);
			System.out.println("Actual Result is " + actualResult);
			Assert.assertEquals(actualResult, expected_Res, "Addition result of three numbers is Wrong!!  ");
		}
	
}
