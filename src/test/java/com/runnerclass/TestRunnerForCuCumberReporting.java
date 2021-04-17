package com.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.test.baseclass.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\src\\test\\resources\\Feature\\AdactinhotelWithCuCuOptions.feature", glue = {
		"org.StepDefinitionCuCuOption" }, tags = { "@smoke" }, dryRun = false, monochrome = true, plugin = {"pretty",
				"json:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportJson\\AdactinProj.json",
				"junit:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportXml\\AdactinProj.xml" })
public class TestRunnerForCuCumberReporting {
	@AfterClass
	public static void afterClass() {
		JvmReport.generateJvmReport(
				"C:\\\\Users\\\\leo\\\\eclipse-workspace\\\\cucumberProject\\\\ReportJson\\\\AdactinProj.json");
	}

}
