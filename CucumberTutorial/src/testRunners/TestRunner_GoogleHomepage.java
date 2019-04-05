package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//Diz para o JUnit que a classe seráexecutada como classe Cucumber
@CucumberOptions(features="resources/features", //Localização da feature dentro do projeto
				 glue="stepDefinitions",
				 monochrome = true,
				 snippets   = SnippetType.CAMELCASE,
				 dryRun     = true,
			     strict     = false	) //Localização do pacote das definições dos passos (StepDefs_GoogleHomepage)

public class TestRunner_GoogleHomepage {
		
}
