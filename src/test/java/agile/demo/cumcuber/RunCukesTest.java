package agile.demo.cumcuber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(tags ={"@StockSpec"},format = {"pretty", "html:target/cucumber-html-report", "junit:target/cucumber-junit-report.xml","json-pretty:target/cucumber-json-report.json"})
public class RunCukesTest {
}
