package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features", glue={"stepdefinitions"},
monochrome=true,
plugin={"pretty", "html:target/HtmlReports", 
		"json:target/JSONReports/report.json", 
		"html:target/HtmlReports"},
tags="@smoketest"
)//reporting options
public class TestRunner {

}
