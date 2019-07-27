package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class SeleniumHomePage extends Annotations {
	
	public SeleniumHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME, using="dropdown-toggle") WebElement input_DropDown;

	@FindBy(how=How.LINK_TEXT, using="Select Dropdown List") WebElement drop_down_select;

	public DropDownSelectPage selectDropDown()
	{
		click(input_DropDown);
		click(drop_down_select);
		return new DropDownSelectPage();

	}
}
