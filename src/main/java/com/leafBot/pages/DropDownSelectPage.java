package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class DropDownSelectPage extends Annotations{
	
	public DropDownSelectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID, using="select-demo") WebElement drop_down_element;

	public void select_dropDown()
	{
		 selectDropDownUsingText(drop_down_element,"india");
	}

}
