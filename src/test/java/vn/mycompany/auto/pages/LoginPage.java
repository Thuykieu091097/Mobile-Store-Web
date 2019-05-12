package vn.mycompany.auto.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
 
public class LoginPage extends PageObject {

	@FindBy(id = "email")
	private WebElementFacade inputEmail;

	public void add_email_field(String email) {
		inputEmail.type(email);
	}

	@FindBy(id = "password")
	private WebElementFacade inputPassword;

	public void add_password_field(String password) {
		inputPassword.type(password);
	}

	@FindBy(css = ".btn-success")
	private WebElementFacade clickbtnLogin;

	public void click_button_login_at_login_page() {
		clickbtnLogin.click();
	}

	@FindBy(css = ".btn-info")
	private WebElementFacade clickbtnBack;

	public void click_button_back_at_login_page() {
		clickbtnBack.click();
	}

	@FindBy(css = ".btn-primary")
	private WebElementFacade clickbtnRegister;

	public void click_button_register_at_login_page() {
		clickbtnRegister.click();
	}
}
