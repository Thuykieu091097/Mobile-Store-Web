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
public class PayTest {
	public static final String EMAIL = "admin@gmail.com";
	public static final String PASSWORD = "admin";
	
	@Managed()
	private WebDriver webdriver;
	
	@Steps
	UserSteps anna;
	
	@Before
	public void access_home_page() {
		anna.is_the_home_page();
	}
	
	@Test
	//login before buy product
	public void login_before_buy_product() {
		anna.click_button_login_at_home_page();
		anna.input_email_at_login_page(EMAIL);
		anna.input_password_at_login_page(PASSWORD);
		anna.click_button_login_at_login_page();
		anna.is_the_home_page();
		anna.click_choose_a_product();
		anna.click_add_to_cart();
		anna.click_button_cart();
		anna.click_button_go_to_order_to_pay();
		anna.click_button_add_at_payment_page();
	}
	
	@Test
	//buy product is not login
	public void buy_product_is_not_login() {
		anna.click_choose_a_product();
		anna.click_add_to_cart();
		anna.click_button_cart();
		anna.click_button_go_to_order_to_pay();
		anna.input_name_field_at_payment_page("a");
		anna.input_email_field_at_payment_page("a");
		anna.input_phone_field_at_payment_page("a");
		anna.input_address_field_at_payment_page("a");
		anna.click_button_add_at_payment_page();
	}

}
