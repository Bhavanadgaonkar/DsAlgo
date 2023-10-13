package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import Util.ExcelReader;

import Driver.Driver_Factory;
import Pages.Array;
import Pages.DataStructures;
import Pages.HomePage;
import Pages.Register;
import Pages.SignIn;
import Pages.Stack;
import Pages.Queue;
import Pages.Tree;
import Pages.LinkedList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TreeSteps {
	private Tree Tr= new Tree(Driver_Factory.getDriver());

	
	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
		Tr.Select_tree_dropdown();
	    
	}

	@Then("The user should be directed to Tree Page")
	public void the_user_should_be_directed_to_tree_page() {
		String title=Tr.Tree_title();
		System.out.println("the title:"+title);
		String expectedtitle="Tree" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		Tr.Tree_overview_click();
	  
	}

	@Then("The user should then be directed to Overview of Trees Page")
	public void the_user_should_then_be_directed_to_overview_of_trees_page() {
		String title=Tr.Tree_overview_title();
		System.out.println("the title:"+title);
		String expectedtitle="Overview of Trees" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}
	
	@When("The user clicks Try Here button in Overview of Tree page")
	public void the_user_clicks_try_here_button_in_overview_of_tree_page() {
		Tr.tryhere_click();
	    
	}



	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the tree code")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_tree_code() {
		String title=Tr.Tree_editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000
		Tr.valid_code(code1);
	    
	}

	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
		Tr.run_bttn_click();
	   
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() {
		Tr.success_message();
	   
	}

	@When("The user gets invalid input from sheet {string} and {int} in trees")
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000
		Tr.invalid_code(code1);
	    
	}

	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
		Tr.run_bttn_click();
	    
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
		Tr.fail_mess();
	   
	}

	@When("The user clicks Terminologies button")
	public void the_user_clicks_terminologies_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Terminology_click();
	    
	}

	@Then("The user should be directed to Terminologies Page")
	public void the_user_should_be_directed_to_terminologies_page() {
		String title=Tr.Terminology_title();
		System.out.println("the title:"+title);
		String expectedtitle="Terminologies" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Try Here button in Terminologies page")
	public void the_user_clicks_try_here_button_in_terminologies_page() {
		Tr.tryhere_click();
	    
	}

	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

	    Tr.Types_of_tree_click();
	}

	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
		String title=Tr.Types_of_tree_title();
		System.out.println("the title:"+title);
		String expectedtitle="Types of Trees" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Try Here button in tree page")
	public void the_user_clicks_try_here_button_in_tree_page() {
		Tr.tryhere_click();
	   
	}

	@When("The user clicks Tree Traversals button")
	public void the_user_clicks_tree_traversals_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Tree_Traversal_click();
	    
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
		String title=Tr.Tree_Traversal_title();
		System.out.println("the title:"+title);
		String expectedtitle="Tree Traversals" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks on the Traversals Illustration button")
	public void the_user_clicks_on_the_traversals_illustration_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Traversal_Illust_click();
	   
	}

	@Then("The user should be directed to Traversals Illustration Page")
	public void the_user_should_be_directed_to_traversals_illustration_page() {
		String title=Tr.Traversal_Illust_title();
		System.out.println("the title:"+title);
		String expectedtitle="Traversals-Illustration" ;
		Assert.assertEquals(title, expectedtitle);
		
	   
	}

	@When("The user clicks on the Binary Trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Btree_click();
	   
	}

	@Then("The user should be directed to Binary Trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
		String title=Tr.Btree_title();
		System.out.println("the title:"+title);
		String expectedtitle="Binary Trees" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks on the types of binary trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Types_Btree_click();
	    
	}

	@Then("The user should be directed to types of binary trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
		String title=Tr.Types_Btree_title();
		System.out.println("the title:"+title);
		String expectedtitle="Types of Binary Trees" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Implement_python_click();
	    
	}

	@Then("The user should be directed to Implementation in Python of tree Page")
	public void the_user_should_be_directed_to_implementation_in_python_of_tree_page() {
		String title=Tr.Implement_python_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation in Python" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks Try Here button in a implementation in python page")
	public void the_user_clicks_try_here_button_in_a_implementation_in_python_page() {
		Tr.tryhere_click();

	    
	}

	@When("The user clicks on the binary tree traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Btree_Traversal_click();
	   
	}

	@Then("The user should be directed to Binary Tree Traversals of tree Page")
	public void the_user_should_be_directed_to_binary_tree_traversals_of_tree_page() {
		String title=Tr.Btree_Traversal_title();
		System.out.println("the title:"+title);
		String expectedtitle="Binary Tree Traversals" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Try Here button in a binary tree traversals page")
	public void the_user_clicks_try_here_button_in_a_binary_tree_traversals_page() {
		Tr.tryhere_click();

	    
	}

	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Btree_Implement_click();
	    
	}

	@Then("The user should be directed to the Implementation of Binary Trees of tree Page")
	public void the_user_should_be_directed_to_the_implementation_of_binary_trees_of_tree_page() {
		String title=Tr.Btree_Implement_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation of Binary Trees" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Try Here button in a Implementation of binary trees page")
	public void the_user_clicks_try_here_button_in_a_implementation_of_binary_trees_page() {
		Tr.tryhere_click();

	    
	}

	@When("The user clicks on the Applications of Binary trees button")
	public void the_user_clicks_on_the_applications_of_binary_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Btree_Application_click();
	    
	}

	@Then("The user should be directed to the Applications of Binary trees of tree Page")
	public void the_user_should_be_directed_to_the_applications_of_binary_trees_of_tree_page() {
		String title=Tr.Btree_Application_title();
		System.out.println("the title:"+title);
		String expectedtitle="Applications of Binary trees" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Try Here button in a Applications of binary trees page")
	public void the_user_clicks_try_here_button_in_a_applications_of_binary_trees_page() {
		Tr.tryhere_click();

	    
	}

	@When("The user clicks on the Binary Search Trees button")
	public void the_user_clicks_on_the_binary_search_trees_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.Btree_Search_click();
	    
	}

	@Then("The user should be directed to the Binary Search Trees of tree Page")
	public void the_user_should_be_directed_to_the_binary_search_trees_of_tree_page() {
		String title=Tr.Btree_Search_title();
		System.out.println("the title:"+title);
		String expectedtitle="Terminologies";
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Try Here button in a Binary Search Trees page")
	public void the_user_clicks_try_here_button_in_a_binary_search_trees_page() {
		Tr.tryhere_click();

	    
	}

	@When("The user clicks on the Implementation Of BST button")
	public void the_user_clicks_on_the_implementation_of_bst_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");

		Tr.BST_Implementation_click();
	    
	}

	@Then("The user should be directed to the Implementation Of BST of tree Page")
	public void the_user_should_be_directed_to_the_implementation_of_bst_of_tree_page() {
		String title=Tr.BST_Implementation_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation Of BST" ;
		Assert.assertEquals(title, expectedtitle);
		
	    }

	@When("The user clicks Try Here button in a Implementation of BST page")
	public void the_user_clicks_try_here_button_in_a_implementation_of_bst_page() {
		Tr.tryhere_click();

	    
	}
	@When("The user clicks on the Overview of Trees link on the tree page")
	public void the_user_clicks_on_the_overview_of_trees_link_on_the_tree_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/tree/");
		Tr.Tree_overview_click();

	}

	@When("The user clicks on the Practice Questions in Overview of Trees")
	public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {

		Tr.Practice_click();
	    
	}

	@Then("The user should be redirected to Practice Questions of tree page")
	public void the_user_should_be_redirected_to_practice_questions_of_tree_page() {
		String title=Tr.Practice_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Tr.sign_out();
	}



}
