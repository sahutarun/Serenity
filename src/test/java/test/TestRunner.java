package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features" , glue ={"stepDefination"})
public class TestRunner {

}
