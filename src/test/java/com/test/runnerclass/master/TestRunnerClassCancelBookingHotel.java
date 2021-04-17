package com.test.runnerclass.master;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\leo\\eclipse-workspace\\cucumberProject\\src\\test\\java\\com\\test\\runnerclass\\master\\TestRunnerClassCancelBookingHotel.java",glue={"com.test.stepdefinition.update"})
public class TestRunnerClassCancelBookingHotel {

}
