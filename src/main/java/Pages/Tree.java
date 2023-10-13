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


public class Tree {
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement DropDowntoggle;
    @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]") WebElement Treedroplist;
    @FindBy(xpath="/html/body/div[2]/ul[1]/a") WebElement TreeOverview;
    @FindBy(xpath="/html/body/div[2]/ul[2]/a") WebElement Terminologieslnk;
    @FindBy(xpath="/html/body/div[2]/ul[3]/a") WebElement TypesofTreeslnk;
    @FindBy(xpath="/html/body/div[2]/ul[4]/a") WebElement TreeTraversallnk;
    @FindBy(xpath="/html/body/div[2]/ul[5]/a") WebElement Traversalillustlnk;
    @FindBy(xpath="/html/body/div[2]/ul[6]/a") WebElement Binarytreelnk;
    @FindBy(xpath="/html/body/div[2]/ul[7]/a") WebElement TypesofBtreelnk;
    @FindBy(xpath="/html/body/div[2]/ul[8]/a") WebElement ImplementPythonlnk;
    @FindBy(xpath="/html/body/div[2]/ul[9]/a") WebElement Btreetraversallnk;
    @FindBy(xpath="/html/body/div[2]/ul[10]/a") WebElement ImplBtree;
    @FindBy(xpath="/html/body/div[2]/ul[11]/a") WebElement ApplBtree;
    @FindBy(xpath="/html/body/div[2]/ul[2]/a") WebElement Btreesearch;
    @FindBy(xpath="/html/body/div[2]/ul[13]/a") WebElement ImplementBstlnk;
    @FindBy(xpath="//pre[@role='presentation']") WebElement CodeEditor1;
	@FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement runclick;
	@FindBy(xpath="//*[@id=\"output\"]") WebElement output;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/a") WebElement Tryherebttn1;
	@FindBy(xpath="//*[@id=\"content\"]/a") WebElement Practice;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;


public Tree(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public void sign_out()
{
	signout.click();
}
public void Select_tree_dropdown()
{
	DropDowntoggle.click();
	Treedroplist.click();
}
public String Tree_title()
{
	return dr.getTitle();
}
public void Tree_overview_click()
{
	TreeOverview.click();
}
public String Tree_overview_title()
{
	return dr.getTitle();
}

public void Terminology_click()
{
	Terminologieslnk.click();
}
public String Terminology_title()
{
	return dr.getTitle();
}

public void Types_of_tree_click()
{
	TypesofTreeslnk.click();
}
public String Types_of_tree_title()
{
	return dr.getTitle();
}

public void Tree_Traversal_click()
{
	TreeTraversallnk.click();
}
public String Tree_Traversal_title()
{
	return dr.getTitle();
}

public void Traversal_Illust_click()
{
	Traversalillustlnk.click();
}
public String Traversal_Illust_title()
{
	return dr.getTitle();
}

public void Btree_click()
{
	Binarytreelnk.click();
}
public String Btree_title()
{
	return dr.getTitle();
}

public void Types_Btree_click()
{
	TypesofBtreelnk.click();
}
public String Types_Btree_title()
{
	return dr.getTitle();
}

public void Implement_python_click()
{
	ImplementPythonlnk.click();
}
public String Implement_python_title()
{
	return dr.getTitle();
}

public void Btree_Traversal_click()
{
	Btreetraversallnk.click();
}
public String Btree_Traversal_title()
{
	return dr.getTitle();
}

public void Btree_Implement_click()
{
	ImplBtree.click();
}
public String Btree_Implement_title()
{
	return dr.getTitle();
}

public void Btree_Application_click()
{
	ApplBtree.click();
}
public String Btree_Application_title()
{
	return dr.getTitle();
}

public void Btree_Search_click()
{
	Btreesearch.click();
}
public String Btree_Search_title()
{
	return dr.getTitle();
}

public void BST_Implementation_click()
{
	ImplementBstlnk.click();
}
public String BST_Implementation_title()
{
	return dr.getTitle();
}

public void tryhere_click()
{
	Tryherebttn1.click();
}
public String Tree_editor_title()
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

public void Practice_click()
{
	Practice.click();
}
public String Practice_title()
{
	return dr.getTitle();
}
}
