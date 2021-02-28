package calcscreens;

import utilities.CommonUtilities;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

import utilities.*;

public class StandardView {
	@FindBy(name = "1")
	WebElement One;
	/*
	 * @FindBy(how=How.NAME, using="1") WebElement One;
	 */

	@FindBy(name = "2")
	WebElement Two;
	
	@FindBy(name = "3")
	WebElement Three;

	@FindBy(name = "Add")
	WebElement Add;

	@FindBy(name = "Equals")
	WebElement Equals;

	@FindBy(id = "158")
	WebElement Result;

	private WiniumDriver driver;

	public StandardView(WiniumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getAdditionResult(int num1, int num2) {
		CommonUtilities.clickOnElement(One);
		CommonUtilities.clickOnElement(Add);
		CommonUtilities.clickOnElement(Two);
		CommonUtilities.clickOnElement(Equals);
		float result = Float.parseFloat(Result.getAttribute("Name"));
		String final_result = CommonUtilities.getFormattedResult(result);		
		return final_result;
	}
	
	public String getAdditionResult(int num1, int num2,int num3) {
		CommonUtilities.clickOnElement(One);
		CommonUtilities.clickOnElement(Add);
		CommonUtilities.clickOnElement(Two);
		CommonUtilities.clickOnElement(Add);
		CommonUtilities.clickOnElement(Three);
		CommonUtilities.clickOnElement(Equals);
		float result = Float.parseFloat(Result.getAttribute("Name"));
		String final_result = CommonUtilities.getFormattedResult(result);		
		return final_result;
	}
}
