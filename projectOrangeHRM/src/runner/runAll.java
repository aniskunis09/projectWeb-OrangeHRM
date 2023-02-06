package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "resources/features",
        glue = "stepDefinitions",
        plugin = {"html:target/HTML_report.html"} //, "json:target/JSON_report.json", "jUnit:target/XML_report.xml"
//        tags = "@FirstRelease"
)
public class runAll {
}
