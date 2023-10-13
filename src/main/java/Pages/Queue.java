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

public class Queue {
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement DropDowntoggle;
    @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]") WebElement Queuedroplist;
	@FindBy(xpath="//pre[@role='presentation']") WebElement CodeEditor1;
	@FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement runclick;
	@FindBy(xpath="//*[@id=\"output\"]") WebElement output;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/a") WebElement Tryherebttn1;
	@FindBy(xpath="/html/body/div[2]/ul[1]/a") WebElement ImplmentationQueuelnk;
	@FindBy(xpath="/html/body/div[2]/ul[2]/a") WebElement CollectiondeQueuelnk;
	@FindBy(xpath="/html/body/div[2]/ul[3]/a") WebElement ArrayQueuelnk;
	@FindBy(xpath="/html/body/div[2]/ul[4]/a") WebElement QueueOprlnk;
    @FindBy(xpath="//*[@id=\"content\"]/a") WebElement Practice;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;


	




public Queue(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}
public void sign_out()
{
	signout.click();
}
public void Select_queue_dropdown()
{
	DropDowntoggle.click();
	Queuedroplist.click();
}
public String Queue_title()
{
	return dr.getTitle();
}
public void Implementation_queue_click()
{
	ImplmentationQueuelnk.click();
}
public String Implementation_queue_title()
{
	return dr.getTitle();
}
public void tryhere_click()
{
	Tryherebttn1.click();
}
public String Queue_editor_title()
{
	return dr.getTitle();
}
public void valid_code(String code2)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(CodeEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(CodeEditor1,code2).build().perform();
}
public void invalid_code(String code3)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(CodeEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(CodeEditor1,code3).build().perform();
}
public void run_bttn_click()
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
public void Collection_dequeue_click()
{
	CollectiondeQueuelnk.click();
}
public String Collection_dequeue_title()
{
	return dr.getTitle();
}

public void Array_Queue_link_click()
{
	ArrayQueuelnk.click();
}
public String Array_Queue_link_title()
{
	return dr.getTitle();
}
public void Queue_Operation_link_click()
{
	QueueOprlnk.click();
}
public String Queue_Operation_link_title()
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
