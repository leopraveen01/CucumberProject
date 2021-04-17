package com.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\src\\test\\resources\\Feature\\AdactinhotelHookOptions.feature",glue={"org.StepDefinitionHookConcept"}
,monochrome=true,dryRun=false,tags="@reg")
public class AdactinHooksTestRunner {

}
