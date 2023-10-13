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
import Pages.LinkedList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StackSteps {
	private Stack Stk= new Stack(Driver_Factory.getDriver());

	
	@When("The user select stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
		Stk.Select_stack_dropdown();
	    
	}

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_directed_to_stack_page() {
		String title=Stk.Stack_title();
		System.out.println("the title:"+title);
		String expectedtitle="Stack" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		
	    Stk.Opr_in_stk_click();
	}

	@Then("The user should then be directed to Operations in Stack Page")
	public void the_user_should_then_be_directed_to_operations_in_stack_page() {
		String title=Stk.Opr_in_stk_title();
		System.out.println("the title:"+title);
		String expectedtitle="Operations in Stack" ;
		Assert.assertEquals(title, expectedtitle);
	    
	    
	}

	@When("The user clicks Try Here button in stack page")
	public void the_user_clicks_try_here_button_in_stack_page() {
		Stk.tryhere_click_button();
	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the Stack page code")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_stack_page_code() {
		String title=Stk.editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
		
	    
	}

	@When("The user gets input from excel sheet {string} and {int}")
	public void the_user_gets_input_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("StackpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Stk.valid_code(code1);
	    
	}

	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		Stk.run_click();
	   
	}

	@Then("The user should be presented with Run output for the code")
	public void the_user_should_be_presented_with_run_output_for_the_code() {
		Stk.success_message();
	    
	}

	@When("The user gets invalid input from excel sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("StackpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Stk.invalid_code(code1);
	}

	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		
		Stk.run_click();

	}

	@Then("The user should get the error message for the code")
	public void the_user_should_get_the_error_message_for_the_code() {
	   Stk.fail_mess();
	}

	@When("The user clicks on the Implementation link")
	public void the_user_clicks_on_the_implementation_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/stack/");
		Stk.implementation_click();
	}

	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
		String title=Stk.implementation_title();
		System.out.println("the title:"+title);
		String expectedtitle="Implementation" ;
		Assert.assertEquals(title, expectedtitle);
		
	   
	}

	@When("The user clicks Try Here button in stack Implementation page")
	public void the_user_clicks_try_here_button_in_stack_implementation_page() {
		Stk.tryhere_click_button();

	   
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the Implementation page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_implementation_page() {
		String title=Stk.editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/stack/");
		Stk.Appl_link_click();
	    
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		String title=Stk.Appl_title();
		System.out.println("the title:"+title);
		String expectedtitle="Applications" ;
		Assert.assertEquals(title, expectedtitle);
	  
	}

	@When("The user clicks Try Here button in stack Applications page")
	public void the_user_clicks_try_here_button_in_stack_applications_page() {
		Stk.tryhere_click_button();

	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the stack code")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_stack_code() {
		String title=Stk.editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);

	}

	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		Stk.Practice_click();
	    
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
		
		String title=Stk.Practice_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Stk.sign_out();
	}



}
