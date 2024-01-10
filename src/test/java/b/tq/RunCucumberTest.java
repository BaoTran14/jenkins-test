package b.tq;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("b/tq")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-json/cucumber.json, html:target/cucumber-html/index.html, timeline:target/cucumber-timeline")
@ConfigurationParameter(key = "cucumber.execution.parallel.config.strategy", value = "fixed")
@ConfigurationParameter(key = "cucumber.execution.parallel.config.fixed.parallelism", value = "3")
//@ConfigurationParameter(key = "cucumber.execution.parallel.config.fixed.max-pool-size", value = "3")
@ConfigurationParameter(key = "cucumber.execution.parallel.enabled", value = "true")
public class RunCucumberTest {
}
