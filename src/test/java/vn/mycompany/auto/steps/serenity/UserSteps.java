package vn.mycompany.auto.steps.serenity;
 
import java.util.List;

import net.thucydides.core.annotations.Step;
import vn.mycompany.auto.pages.CartPage;
import vn.mycompany.auto.pages.HomePage;
import vn.mycompany.auto.pages.LoginPage;
import vn.mycompany.auto.pages.PaymentPage;
import vn.mycompany.auto.pages.RegisterPage;

public class UserSteps {

	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;
	CartPage cartPage;
	PaymentPage paymentPage;

	@Step
	public void enters(String keyword) {
		homePage.enter_keywords(keyword);
	}

	@Step
	public void starts_search() {
		homePage.lookup_terms();
	}

	/*
	 * @Step public void should_see_definition(String definition) {
	 * assertThat(homePage.getDefinitions(), hasItem(containsString(definition))); }
	 */

	@Step
	public void is_the_home_page() {
		homePage.open();
	}

	@Step
	public void looks_for(String term) {
		enters(term);
		starts_search();
	}

	@Step
	public void click_button_login_at_home_page() {
		homePage.click_button_login_at_home_page();
	}

	@Step
	public void click_button_register_at_home_page() {
		homePage.click_button_register_at_home_page();
	}

	@Step
	public void click_button_login_at_login_page() {
		loginPage.click_button_login_at_login_page();

	}

	@Step
	public void input_email_at_login_page(String email) {
		loginPage.add_email_field(email);

	}

	@Step
	public void input_password_at_login_page(String password) {
		loginPage.add_password_field(password);

	}

	@Step
	public void click_button_register_at_register_page() {
		registerPage.click_button_register_at_register_page();

	}

	@Step
	public void input_email_at_register_page(String email) {
		registerPage.add_email_field_register(email);

	}

	@Step
	public void input_password_at_register_page(String password) {
		registerPage.add_password_field_register(password);
	}

	@Step
	public void input_confirm_password_at_register_page(String password_confirm) {
		registerPage.add_password_confirm_field_register(password_confirm);

	}

	@Step
	public void input_address_at_register_page(String address) {
		registerPage.add_address_field_register(address);

	}

	@Step
	public void input_phone_at_register_page(String phone) {
		registerPage.add_phone_field_register(phone);

	}

	@Step
	public void input_name_at_register_page(String name) {
		registerPage.add_name_field_register(name);

	}

	@Step
	public void click_choose_a_product() {
		cartPage.click_button_choose_a_product();
		
	}

	@Step
	public void click_add_to_cart() {
		cartPage.click_add_to_cart();
		
	}

	@Step
	public void click_button_cart() {
		cartPage.click_button_cart();
		
	}

	@Step
	public void click_button_go_to_order_to_pay() {
		cartPage.click_button_go_to_order_to_pay();
		
	}

	@Step
	public void click_button_back() {
		cartPage.click_button_back();
		
	}

	@Step
	public void click_button_delete() {
		cartPage.click_button_delete();
		
	}

	@Step
	public void input_amount_products_need_buying(String number) {
		cartPage.input_amount_products_need_buying(number);
		
	}

	@Step
	public void click_button_change_amount_products() {
		cartPage.click_button_change_amount_products();
		
	}

	@Step
	public void click_button_add_at_payment_page() {
		paymentPage.click_button_add_at_payment_page();
		
	}

	@Step
	public void input_name_field_at_payment_page(String name) {
		paymentPage.input_name_field_at_payment_page(name);
		
	}

	@Step
	public void input_email_field_at_payment_page(String email) {
		paymentPage.input_email_field_at_payment_page(email);
		
	}

	@Step
	public void input_phone_field_at_payment_page(String phone) {
		paymentPage.input_phone_field_at_payment_page(phone);
		
	}

	@Step
	public void input_address_field_at_payment_page(String address) {
		paymentPage.input_address_field_at_payment_page(address);
		
	}

	@Step
	public List<String> get_warning_error_message() {
		return registerPage.get_err_msg();
	}

}