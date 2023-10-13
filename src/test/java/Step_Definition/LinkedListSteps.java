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
import Pages.LinkedList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedListSteps {

	private LinkedList LL= new LinkedList(Driver_Factory.getDriver());
	
	@When("The user selecting linkedlist item from the drop down menu")
	public void the_user_selecting_linkedlist_item_from_the_drop_down_menu() {
		LL.select_LL_from_dropdown();
	   
	}

	@Then("The user should be directed to Linked List  Page")
	public void the_user_should_be_directed_to_linked_list_page() {
		String title=LL.LL_page_title();
		System.out.println("the title:"+title);
		String expectedtitle="Linked List" ;
		Assert.assertEquals(title, expectedtitle);
	   }

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		
		LL.intro_link_click();
	    
	}

	@Then("The user should be directed to Introduction of Linked List Page")
	public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
		String title=LL.into_title();
		System.out.println("the title:"+title);
		String expectedtitle="Introduction" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Try Here button in the introduction page")
	public void the_user_clicks_try_here_button_in_the_introduction_page() {
		LL.tryhere_click();
	    	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the code")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_code() {
		String title=LL.tryeditor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("LLpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		LL.valid_python_code(code1);
	   
	}

	@When("user click on Run button to run the code")
	public void user_click_on_run_button_to_run_the_code() {
		LL.run_button_click();
	    
	}

	@Then("The user should be presented with the Run output for the executed code")
	public void the_user_should_be_presented_with_the_run_output_for_the_executed_code() {
		LL.run_message();
	    
	}

	@When("The user Enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("LLpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		LL.invalid_python_code(code1);
	    
	}
	@Then("The user should be presented with the error message for the executed code")
	public void the_user_should_be_presented_with_the_error_message_for_the_executed_code() {
	    LL.error_message();
	}

	@When("The user clicks the Creating a Linked List button")
	public void the_user_clicks_the_creating_a_linked_list_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
LL.createLL_link_click();
	    
	}
	@Then("The user should be directed to Creating Linked List Page")
	public void the_user_should_be_directed_to_creating_linked_list_page() {
		String title=LL.createLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Creating Linked LIst" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks Try Here button in the creating linked list page")
	public void the_user_clicks_try_here_button_in_the_creating_linked_list_page() {
		LL.tryhere_click();

	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the Linked List")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_linked_list() {
		String title=LL.tryeditor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks the Types of Linked List button")
	public void the_user_clicks_the_types_of_linked_list_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
		LL.typeLL_link_click();
	   
	}

	@Then("The user should be directed to Types of Linked List Page")
	public void the_user_should_be_directed_to_types_of_linked_list_page() {
		String title=LL.typeLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Types of Linked List" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks Try Here button in the types of linked list page")
	public void the_user_clicks_try_here_button_in_the_types_of_linked_list_page() {
		LL.tryhere_click();

	    
	}

	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
LL.implementLL_link_click();
	    
	}

	@Then("The user should be directed to Implement Linked List in Python Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_page() {
		String title=LL.implementLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implement Linked List in Python" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Try Here button in the implemented linked list in python page")
	public void the_user_clicks_try_here_button_in_the_implemented_linked_list_in_python_page() {
		LL.tryhere_click();

	}

	@When("The user clicks the Traversal button")
	public void the_user_clicks_the_traversal_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
		LL.traversalLL_link_click();

	}

	@Then("The user should be directed to Traversal Page")
	public void the_user_should_be_directed_to_traversal_page() {
		String title=LL.traversalLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Traversal" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks Try Here button in the traversal page")
	public void the_user_clicks_try_here_button_in_the_traversal_page() {
		LL.tryhere_click();

	}

	@When("The user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
LL.insertionLL_link_click();
	   
	}

	@Then("The user should be directed to Insertion Page")
	public void the_user_should_be_directed_to_insertion_page() {
		String title=LL.insertionLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Insertion" ;
		Assert.assertEquals(title, expectedtitle);
	  
	}

	@When("The user clicks Try Here button in the Insertion page")
	public void the_user_clicks_try_here_button_in_the_insertion_page() {
		LL.tryhere_click();

	   
	}

	@When("The user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
		LL.deletionLL_link_click();

	    
	}

	@Then("The user should be directed to Deletion Page")
	public void the_user_should_be_directed_to_deletion_page() {
		String title=LL.deletionLL_title();
		System.out.println("the title:"+title);
		String expectedtitle="Deletion" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks Try Here button in the Deletion page")
	public void the_user_clicks_try_here_button_in_the_deletion_page() {
		LL.tryhere_click();

	}
	
	@When("The user clicks Introduction link from the linked list page")
	public void the_user_clicks_introduction_link_from_the_linked_list_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/linked-list/");
		LL.intro_link_click();
	}

	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
		
		LL.Practice_page_click();

	   
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
		String title=LL.PPage_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		LL.sign_out();
	}




}
