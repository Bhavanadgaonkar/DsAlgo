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

public class Stack {
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement DropDowntoggle;
    @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]") WebElement Stackdroplist;
	@FindBy(xpath="/html/body/div[2]/ul[1]/a") WebElement Operationinstacklink;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/a") WebElement Tryherebttn;
	@FindBy(xpath="//pre[@role='presentation']") WebElement CodeEditor;
	@FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement runclick;
	@FindBy(xpath="//*[@id=\"output\"]") WebElement output;
	@FindBy(xpath="/html/body/div[2]/ul[2]/a") WebElement implemenationlnk;
	@FindBy(xpath="/html/body/div[2]/ul[3]/a") WebElement Applicationlnk;
	@FindBy(xpath="//*[@id=\"content\"]/a") WebElement Practice;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;




	
public Stack(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}
public void sign_out()
{
	signout.click();
}
public void Select_stack_dropdown()
{
	DropDowntoggle.click();
	Stackdroplist.click();
}
public String Stack_title()
{
	return dr.getTitle();
}
public void Opr_in_stk_click()
{
	Operationinstacklink.click();	
}
public String Opr_in_stk_title()
{
	return dr.getTitle();
}
public void tryhere_click_button()
{
	Tryherebttn.click();
}
public String editor_title()
{
	return dr.getTitle();
}
public void valid_code(String code2)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(CodeEditor).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(CodeEditor,code2).build().perform();
}
public void invalid_code(String code3)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(CodeEditor).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(CodeEditor,code3).build().perform();
}
public void run_click()
{
	try {
		runclick.click();
	String res=output.getText();
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
public void success_message()
{
	String res=output.getText();
	System.out.println("The Result is:"+res);
}
public void fail_mess()
{
	System.out.println("You accepted an Alert");
}
public void implementation_click()
{
	implemenationlnk.click();
}
public String implementation_title()
{
	return dr.getTitle();
}

public void Appl_link_click()
{
	Applicationlnk.click();
}
public String Appl_title()
{
	return dr.getTitle();
}
public void Practice_click()
{
	Practice.click();
}
public String Practice_title()
{
	return dr.getTitle();
}
}
