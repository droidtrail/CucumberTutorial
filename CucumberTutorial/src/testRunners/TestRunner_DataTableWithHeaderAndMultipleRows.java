package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin={"html:reports",
				 "json:reports_Json/CriarNovaConta.json",
				 "junit:reports_JUnit/CriarNovaConta.xml"},
		 
		 features="resources/features/DataTableWithHeaderAndMultipleRows.feature", 
		 glue="stepDefinitions",
		 monochrome = true,
		 snippets   = SnippetType.CAMELCASE,
		 dryRun     = false,
		 strict     = false
		)

public class TestRunner_DataTableWithHeaderAndMultipleRows {

}
