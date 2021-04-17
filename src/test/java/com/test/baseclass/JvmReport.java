package com.test.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String JsonFile) {
		File reportDirectory = new File(System.getProperty("user.dir") + "\\ReportJson\\Adactinreport.json");
		Configuration configuration = new Configuration(reportDirectory, "Adactin Hotel Booking");
		configuration.addClassifications("Browsername", "Chrome");
		configuration.addClassifications("Browserversion", "86");
		configuration.addClassifications("Testing", "smoke testing");
		configuration.addClassifications("sprint", "21");
		configuration.addClassifications("os", "windows");
		List<String> JsonFiles = new ArrayList<String>();
		JsonFiles.add(JsonFile);
		ReportBuilder reportBuilder = new ReportBuilder(JsonFiles, configuration);
		reportBuilder.generateReports();
	}

}
