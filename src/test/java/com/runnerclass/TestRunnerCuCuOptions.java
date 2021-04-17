package com.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\src\\test\\resources\\Feature\\AdactinhotelWithCuCuOptions.feature",glue={"org.StepDefinitionCuCuOption"},dryRun=false,monochrome=true,snippets = SnippetType.CAMELCASE,
plugin= {"html:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\target",
"json:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportJson\\AdactinProj.json",
	"junit:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportXml\\AdactinProj.xml"})
public class TestRunnerCuCuOptions {
	

}
