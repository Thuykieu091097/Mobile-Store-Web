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
public class CartTest {
	
	@Managed()
	private WebDriver webdriver;
	
	@Steps
	UserSteps anna;
	
	//go to cart page
	@Before
	public void go_to_cart_page() {
	anna.is_the_home_page();
	anna.click_choose_a_product();
	anna.click_add_to_cart();
	anna.click_button_cart();
	}
	
	@Test
	//Click button go to order to pay
	public void go_to_payment_page() {
		anna.click_button_go_to_order_to_pay();
	}
	
	@Test
	//Click button back to back order detail page
	public void back_to_order_detail_page() {
		anna.click_button_back();
	}
	
	@Test
	//Click button delete to delete product was chose
	public void delete_product_was_chose() {
		anna.click_button_delete();
	}
	
	@Test
	//Change amount products in cart
	public void input_amount_products_need_buying() {
		anna.input_amount_products_need_buying("2");
	}
	
	@Test
	//Change amount products in cart
	public void click_button_increase_decrease_amount_products() {
		anna.click_button_change_amount_products();
	}

}