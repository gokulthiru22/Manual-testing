 package Runnerclass;

 


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

 

@RunWith(Cucumber.class)

 

@CucumberOptions(features = {"Features/hirepros_CommonLogin.feature", "Features/hirepros_Recruitment.feature"}, glue = {"Hireprostepdef"}, plugin = {
"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },tags="@OneTest")

 

public class runner {

 

}


 //"Features/hirepros_CommonLogin.feature", "Features/hirepros_Configurations.feature", "Features/hirepros_NewServices.feature", "Features/hirepros_Recruitment.feature"