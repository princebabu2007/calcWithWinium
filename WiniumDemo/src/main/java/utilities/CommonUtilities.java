package utilities;

import java.text.DecimalFormat;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtilities {

	public static void selectFromDropDown(WebElement lstBox, String itemToSelect) {
		Select listItems = new Select(lstBox);
		List<WebElement> items = listItems.getOptions();
		for (WebElement e : items) {
			String str = (e.getText()).trim();
			if (str.equals(itemToSelect.trim())) {
				e.click();

			}
		}
	}

	public static void selectOption(List<WebElement> optionbtn, String itemToSelect) {
		for (WebElement e : optionbtn) {
			if (e.getAttribute("value").equals(itemToSelect))
				e.click();
		}
	}

	public static Boolean clickOnElement(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String getFormattedResult(float res) {
		try {
			DecimalFormat format = new DecimalFormat("0.#");
			System.out.println(format.format(res));
			String str_result = Float.toString(res);
			str_result = str_result.contains(".") ? str_result.replaceAll("0*$", "").replaceAll("\\.$", "")
					: str_result;
			return str_result;
		} catch (Exception e) {
			return null;
		}
	}

}