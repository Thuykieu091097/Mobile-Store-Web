package vn.mycompany.auto.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
 
public class PaymentPage extends PageObject {
	
	@FindBy(css=".btn")
	private WebElementFacade buttonAdd;
	
	public void click_button_add_at_payment_page() {
		buttonAdd.click();
		
	}

	@FindBy(id="name")
	private WebElementFacade inputName;
	
	public void input_name_field_at_payment_page(String name) {
		inputName.type(name);
		
	}

	@FindBy(id="email")
	private WebElementFacade inputEmail;
	
	public void input_email_field_at_payment_page(String email) {
		inputEmail.type(email);
		
	}

	@FindBy(id="phone")
	private WebElementFacade inputPhone;
	
	public void input_phone_field_at_payment_page(String phone) {
		inputPhone.type(phone);
		
	}

	@FindBy(id="address")
	private WebElementFacade inputAddress;
	public void input_address_field_at_payment_page(String address) {
		inputAddress.type(address);
		
	}

}
