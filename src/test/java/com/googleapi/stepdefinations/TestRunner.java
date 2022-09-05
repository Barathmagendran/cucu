package com.googleapi.stepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\google.feature",
                 glue="com\\googleapi\\stepdefinations",
                 monochrome=true,plugin= {"html:target","json:target/reports.json"})

public class TestRunner {

}
