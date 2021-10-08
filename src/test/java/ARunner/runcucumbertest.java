package ARunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/2_Seller_Login_and_Logout_Mechanism.feature",
		glue={"stepdefinationcode"},
		plugin = { "pretty", "html:target/test-reports/cucumber-reports.html" },
		//tags = "@wip",
		monochrome=true,
		snippets = SnippetType.CAMELCASE
		)

public class runcucumbertest {

}
