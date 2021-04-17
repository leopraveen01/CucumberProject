package com.test.runnerclass.master;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.test.baseclass.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\src\\test\\resources\\Feature\\FeatureUpdate\\",glue={"com.test.stepdefinition.update"}
,dryRun=false,monochrome=true,plugin= {"pretty","json:C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportJson\\AdactinProject.json"})
public class TestRunnerClassSearchHotel {
@AfterClass
public static void afterClass() {
JvmReport.generateJvmReport("C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\ReportJson\\AdactinProject.json");
}
}
