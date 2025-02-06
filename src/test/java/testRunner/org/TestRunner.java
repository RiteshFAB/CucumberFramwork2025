package testRunner.org;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\Facebook.feature",
glue="stepDefination.org",
monochrome=true,
dryRun=false,
tags="@sainty",
plugin= {"pretty","html:.\\target\\facebook.html"}



		)




public class TestRunner {

}
