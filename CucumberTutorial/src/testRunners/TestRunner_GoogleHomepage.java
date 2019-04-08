package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/GoogleHomepage.feature", 
				 glue="stepDefinitions",
				 monochrome = true,
				 snippets   = SnippetType.CAMELCASE,
				 dryRun     = false,
			     strict     = false	)

public class TestRunner_GoogleHomepage {
		
}
