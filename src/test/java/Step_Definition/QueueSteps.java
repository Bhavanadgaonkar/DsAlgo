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
import Pages.LinkedList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QueueSteps {

	private Queue Qu= new Queue(Driver_Factory.getDriver());
	
	@When("The user clicks the Queue item from drop down menu")
	public void the_user_clicks_the_queue_item_from_drop_down_menu() {
		Qu.Select_queue_dropdown();
		
	    
	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		String title=Qu.Queue_title();
		System.out.println("the title:"+title);
		String expectedtitle="Queue" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks on Implementation of queue  in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
	    Qu.Implementation_queue_click();
	}

	@Then("The user should be directed to Implementation of queue  in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		String title=Qu.Implementation_queue_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation of Queue in Python" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks on Try here link in Implementation of queue")
	public void the_user_clicks_on_try_here_link_in_implementation_of_queue() {
		Qu.tryhere_click();
	    
	}

	@Then("The user navigates to Editor page with Run button")
	public void the_user_navigates_to_editor_page_with_run_button() {
		String title=Qu.Queue_editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user enters valid python code in Editor from the queue sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_the_queue_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QueuepythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000
		Qu.valid_code(code1);
		
	    
	}

	@When("clicks Run button in queue editor")
	public void clicks_run_button_in_queue_editor() {
		Qu.run_bttn_click();
	    
	}

	@Then("The user is presented with the result after Run button is clicked for the entered code")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked_for_the_entered_code() {
		Qu.success_message();
	    
	}

	@When("The user enters invalid python code in Editor from the queue sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_the_queue_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QueuepythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Qu.invalid_code(code1);
	}

	@Then("The user gets an Error Message for the entered code")
	public void the_user_gets_an_error_message_for_the_entered_code() {
	    Qu.fail_mess();
	}

	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/queue/");
		Qu.Collection_dequeue_click();
	   
	}

	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		String title=Qu.Collection_dequeue_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation using collections.deque" ;
		Assert.assertEquals(title, expectedtitle);
	    	}

	@When("The user clicks on Tryhere link in implementation using collections page")
	public void the_user_clicks_on_tryhere_link_in_implementation_using_collections_page() {
		Qu.tryhere_click();
	   
	}

	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/queue/");
		Qu.Array_Queue_link_click();
	   	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		String title=Qu.Array_Queue_link_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation using array" ;
		Assert.assertEquals(title, expectedtitle);
	}
	

	@When("The user clicks on Tryhere link in Implementation using array page")
	public void the_user_clicks_on_tryhere_link_in_implementation_using_array_page() {
		Qu.tryhere_click();
	    	}

	@When("The user clicks on Queue Operations  link")
	public void the_user_clicks_on_queue_operations_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/queue/");
		Qu.Queue_Operation_link_click();
	   
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		String title=Qu.Queue_Operation_link_title();
		System.out.println("the title:"+title);
		String expectedtitle="Queue Operations" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks on Tryhere link in Queue Operations page")
	public void the_user_clicks_on_tryhere_link_in_queue_operations_page() {
		Qu.tryhere_click();

	}

	@When("The user clicks on Practice Questions in QueueOp page")
	public void the_user_clicks_on_practice_questions_in_queue_op_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/queue/QueueOp/");
		Qu.Practice_click();

	   
	}

	@Then("The user is directed to Practice  from QueueOp page")
	public void the_user_is_directed_to_practice_from_queue_op_page() {
		String title=Qu.Practice_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Qu.sign_out();
	}


}
