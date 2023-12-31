package com.abeyis.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber/cucumber-report.html",
                "rerun:target/rerun.txt",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/abeyis/step_definitions",

        dryRun = false,
        stepNotifications = true,
        publish = true,
        tags = "@smoke1"

)

public class CukesRunner {

}
