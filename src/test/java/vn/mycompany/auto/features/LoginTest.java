package vn.mycompany.auto.features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mycompany.auto.steps.serenity.UserSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

	public static final String EMAIL = "admin@gmail.com";
	public static final String PASSWORD = "admin";
	public static final String EMAIL_NOT_EXIST = "abc@gmail.com";
	public static final String PASSWORD_FAIL = "abc12345";

	@Managed()
	WebDriver driver;

	@Steps
	UserSteps anna;

	// go to login page from home page
	@Before
	public void go_to_login_page_from_home_page() {
		anna.is_the_home_page();
		anna.click_button_login_at_home_page();
	}

	@Test
	// Don't input data(email, password), click button login at login page
	public void login_with_blank() {
		anna.click_button_login_at_login_page();
	}

	@Test
	// Input email, don't input pass, click button login at login page
	public void login_with_blank_password() {
		anna.input_email_at_login_page(EMAIL);
		anna.click_button_login_at_login_page();
	}

	@Test
	// Input password, don't input email, click button login at login page
	public void login_with_blank_email() {
		anna.input_password_at_login_page(PASSWORD);
		anna.click_button_login_at_login_page();
	}

	@Test
	// Input email not exist
	public void login_with_email_not_exist() {
		anna.input_email_at_login_page(EMAIL_NOT_EXIST);
		anna.input_password_at_login_page(PASSWORD);
		anna.click_button_login_at_login_page();
	}

	@Test
	// Input password fail
	public void login_with_password_fail() {
		anna.input_email_at_login_page(EMAIL);
		anna.input_password_at_login_page(PASSWORD_FAIL);
		anna.click_button_login_at_login_page();
	}

	@Test
	// Input full fields, login success
	public void login_success() {
		anna.input_email_at_login_page(EMAIL);
		anna.input_password_at_login_page(PASSWORD);
		anna.click_button_login_at_login_page();
		anna.is_the_home_page();

	}

}
