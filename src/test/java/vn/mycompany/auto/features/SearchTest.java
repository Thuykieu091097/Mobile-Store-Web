package vn.mycompany.auto.features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mycompany.auto.steps.serenity.UserSteps;

@RunWith(SerenityRunner.class)
public class SearchTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
 
	@Steps
	public UserSteps anna;

	@Before
	public void open_home_page() {
		anna.is_the_home_page();
	}

	@Issue("#WIKI-1")
	@Test
	public void searching_by_keyword_samsung() {
		anna.looks_for("samsung");
	}

	@Test
	public void searching_by_keyword_iphone() {
		anna.looks_for("iphone");
	}

}