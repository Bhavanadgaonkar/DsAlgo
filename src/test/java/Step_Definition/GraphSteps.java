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
import Pages.Graph;
import Pages.LinkedList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GraphSteps {
	private Graph Gr= new Graph(Driver_Factory.getDriver());
	
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
		Gr.Select_graph_dropdown();
	   
	}

	@Then("The user should be redirected to Graph page")
	public void the_user_should_be_redirected_to_graph_page() {
		String title=Gr.Graph_title();
		System.out.println("the title:"+title);
		String expectedtitle="Graph" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Graph link on Graph page")
	public void the_user_clicks_graph_link_on_graph_page() {
		Gr.Graph_click();
	    
	}

	@Then("The user should be redirected to Graph from Graph page")
	public void the_user_should_be_redirected_to_graph_from_graph_page() {
		String title=Gr.Graph_click_title();
		System.out.println("the title:"+title);
		String expectedtitle="Graph" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user clicks on Tryhere link on the Graph page")
	public void the_user_clicks_on_tryhere_link_on_the_graph_page() {
		Gr.tryhere_click();
	   
	}

	@Then("The user should be directed to Editor page with Run button from the Graph page")
	public void the_user_should_be_directed_to_editor_page_with_run_button_from_the_graph_page() {
		String title=Gr.Graph_editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	  
	}

	@When("The user enters valid graph python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_graph_python_code_in_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("GraphpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000
		Gr.valid_code(code1);
	   
	}

	@When("clicks run button on the Graph editor page")
	public void clicks_run_button_on_the_graph_editor_page() {
		Gr.run_bttn_click();
	   
	}

	@Then("The user is presented with the result after run button is clicked on the Graph editor page")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked_on_the_graph_editor_page() {
	    Gr.success_message();
	}

	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("GraphpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000
		Gr.invalid_code(code1);
		
	  
	}

	@Then("The user gets an error message on the Graph editor page")
	public void the_user_gets_an_error_message_on_the_graph_editor_page() {
		Gr.fail_mess();
	   
	}

	@When("The user clicks on Graph Representations link on the graph page")
	public void the_user_clicks_on_graph_representations_link_on_the_graph_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/graph/");

		Gr.Graph_Rep_click();
	   
	}

	@Then("The user should be redirected to Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_page() {
		String title=Gr.Graph_Rep_title();
		System.out.println("the title:"+title);
		String expectedtitle="Graph Representations" ;
		Assert.assertEquals(title, expectedtitle);
		
	   
	}

	@When("The user clicks on Tryhere link on graph representations page")
	public void the_user_clicks_on_tryhere_link_on_graph_representations_page() {
		Gr.tryhere_click();
	   
	}

	@Then("The user navigates to Editor page with Run button from the graph representation page")
	public void the_user_navigates_to_editor_page_with_run_button_from_the_graph_representation_page() {
		String title=Gr.Graph_editor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user is in graph page and clicks graph representations link")
	public void the_user_is_in_graph_page_and_clicks_graph_representations_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/graph/");
Gr.Graph_Rep_click();
	   
	}

	@When("The user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		Gr.Practice_click();
	    
	}

	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		String title=Gr.Practice_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Gr.sign_out();
		
	}


}
