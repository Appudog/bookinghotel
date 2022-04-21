package com.rest.Assured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"}, glue= {"StepDefenition"},monochrome=true)
public class Runnerclass {


}
