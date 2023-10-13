package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.Driver_Factory;

import org.openqa.selenium.WebElement;

public class LinkedList {
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement DropDowntoggle;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]") WebElement LLDropDown;
	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement Introlink;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement TryHere;	
	@FindBy (xpath="//pre[@role='presentation']") WebElement entercode;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement runbuttondown;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement outputresult;
	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement CreateLLlink;
	@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement TypeLLlink;
	@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement ImplementLLlink;
	@FindBy (xpath="/html/body/div[2]/ul[5]/a") WebElement Traversallink;
	@FindBy (xpath="/html/body/div[2]/ul[6]/a") WebElement Insertionlink;
	@FindBy (xpath="/html/body/div[2]/ul[7]/a") WebElement Deletionlink;
	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement Practice_pagelink;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;

	
	
	
	
	
	
public LinkedList(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}
public void sign_out()
{
	signout.click();
}
public void select_LL_from_dropdown()
{
	DropDowntoggle.click();
	LLDropDown.click();
}

public String LL_page_title()
{
	return dr.getTitle();
}

public void intro_link_click()
{
	Introlink.click();	
}

public String into_title()
{
	return dr.getTitle();
}

public void tryhere_click()
{
	TryHere.click();
}

public String tryeditor_title()
{
	return dr.getTitle();
}

public void valid_python_code(String code)
{
	//CodeTxtEditor1.clear();
		Actions act1=new Actions(dr);
		act1.moveToElement(entercode).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

			act1.sendKeys(entercode,code).build().perform();
}

public void invalid_python_code(String code1)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(entercode).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(entercode,code1).build().perform();

}

public void run_button_click()
{
	
	try {
		runbuttondown.click();
	String res=outputresult.getText();
	System.out.println("The Result is:"+res);
		}catch(UnhandledAlertException f) {
		try 
	    {
	Alert alert1 = dr.switchTo().alert();
	String alertMessage1= alert1.getText();
	 System.out.println(alertMessage1);
	 alert1.accept();
	    } catch (NoAlertPresentException e) {

	        e.printStackTrace();

	    }
	}
}

public void run_message()
{
	String res=outputresult.getText();
	System.out.println("The Result is:"+res);
}

public void error_message()
{
	System.out.println("You got an alert");
}
public void createLL_link_click()
{
	CreateLLlink.click();	
}

public String createLL_title()
{
	return dr.getTitle();
}

public void typeLL_link_click()
{
	TypeLLlink.click();	
}

public String typeLL_title()
{
	return dr.getTitle();
}

public void implementLL_link_click()
{
	ImplementLLlink.click();	
}

public String implementLL_title()
{
	return dr.getTitle();
}

public void traversalLL_link_click()
{
	Traversallink.click();	
}

public String traversalLL_title()
{
	return dr.getTitle();
}

public void insertionLL_link_click()
{
	Insertionlink.click();	
}

public String insertionLL_title()
{
	return dr.getTitle();
}

public void deletionLL_link_click()
{
	Deletionlink.click();	
}

public String deletionLL_title()
{
	return dr.getTitle();
}

public void Practice_page_click()
{
	Practice_pagelink.click();
}
public String PPage_title()
{
	return dr.getTitle();
}
}
