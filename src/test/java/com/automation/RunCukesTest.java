package com.automation;

import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:build/cucumber-report.json","pretty", "html:build/cucumber-html-report"},
        features = "classpath:features",
        glue = {"com.automation"}
        //tags = {}
)
public class RunCukesTest {

}