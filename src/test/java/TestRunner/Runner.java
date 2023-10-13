package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Prasanna\\eclipse-workspace\\Maven\\DSALGO_PROJ\\DSALGO\\src\\test\\resources\\Features"},
		glue = {"Step_Definition", "AppHooks"},
		plugin = {"pretty","html:target/DS_Algo.html",
				"junit:target/cucumber-reports/cucumber.xml",
			"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false
		
		
		)
public class Runner {

}
