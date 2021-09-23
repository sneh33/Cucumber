package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Frontacc.feature",
glue="stepDefinition",
monochrome=true,		//formatting console
dryRun=false,
plugin= {"pretty","html:target/htmlreport.html","json:target/jsonReport/Rep1.json"})			//true-checking every step def has matching step def, false-to actually run


public class FrontRunner {

}
