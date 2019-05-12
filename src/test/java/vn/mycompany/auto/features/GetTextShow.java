package vn.mycompany.auto.features;

import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mycompany.auto.steps.serenity.UserSteps;

@RunWith(SerenityRunner.class)
public class GetTextShow {

	public static final String NAME = "THUY KIEU";
	public static final String EMAIL = "thuykieu@gmail.com";
	public static final String PASSWORD = "thuykieu0910";
	public static final String CONFIRMPASSWORD = PASSWORD;
	public static final String CONFIRMPASSDIFFERENTPASS = "thuykieu09100";
	public static final String ADDRESS = "HÀ NỘI";
	public static final String PHONE = "0979339597";
	public static final String INPUT_FAIL = "01";
	public static final String ERROR_MESSAGE_NAME = "The name field is required.";
	public static final String ERROR_MESSAGE_EMAIL = "The email field is required.";
	public static final String ERROR_MESSAGE_PASSWORD = "The password field is required.";
	public static final String ERROR_MESSAGE_CONFIRMPASS = "The password confirm field is required.";
	public static final String ERROR_MESSAGE_PHONE = "The phone field is required.";
	public static final String ERROR_MESSAGE_ADDRESS = "The address field is required.";
	public static final String ERROR_MESSAGE_PASS_DIFFERENT_CFPASS = "The password confirm and password must match.";
	public static final String ERROR_MESSAGE_NAME_CHARACTER = "The name must be at least 3 characters.";
	public static final String ERROR_MESSAGE_PASS_CHARACTER = "The password must be at least 3 characters.";
	public static final String ERROR_MESSAGE_CFPASS_CHARACTER = "The password confirm must be at least 3 characters.";
	public static final String ERROR_MESSAGE_ADDRESS_CHARACTER = "The address must be at least 4 characters.";
	public static final String ERROR_MESSAGE_PHONE_CHARACTER = "The phone must be at least 10 characters.";

	@Managed()
	WebDriver webdriver;

	@Steps
	UserSteps anna;

	@Before
	public void access_register_page() {
		anna.is_the_home_page();
		anna.click_button_register_at_home_page();
	}

	@Test
	// Register with blank all fields
	public void register_with_blank_all_fields() {
		anna.click_button_register_at_register_page();
		// De kiem tra trong danh sach minh lay duoc co cai minh can. thi dung hasItem.
		
		// Cai nay ko lien quan den selenium. No lien quan den Junit. 
		// Lai phai hoc mot tools khac. haha.
		// Nhung chi can hoc cai nao can thoi. sau nay co gi khong ro thi hoi. ok ? => da.
		//e hoi xi
		// Voi nhieu message, em sua lai nhu nay dk ko a?
		assertThat(anna.get_warning_error_message(), hasItem(ERROR_MESSAGE_NAME));
		assertThat(anna.get_warning_error_message(), hasItem(ERROR_MESSAGE_EMAIL));
		assertThat(anna.get_warning_error_message(), hasItem(ERROR_MESSAGE_ADDRESS));
		
		// Nhu the nay tot hon. Vi neu bi fail minh se de biet no fail o dau. o nam, o mial hay o address
		// Con neu em cho het vao mot cho. Khi no fail. em kho biet la no loi o cai nao? hieu ko--da ok
		
		// Trong truong hop em muon kiem tra no co du het 6 cai error kia thi se dung nhu the nay.
		// contains la kiem tra trong danh sach co du het cai items, ngoai ra no phai sap xep dung thu tu.
		assertThat(anna.get_warning_error_message(), contains(
				ERROR_MESSAGE_NAME,
				ERROR_MESSAGE_EMAIL,
				ERROR_MESSAGE_PASSWORD,
				ERROR_MESSAGE_CONFIRMPASS,
				ERROR_MESSAGE_PHONE,
				ERROR_MESSAGE_ADDRESS));
		
		// Neu chi can kiem tra trong danh sach no co du va khong can thu tu thi dung nhu sau
		assertThat(anna.get_warning_error_message(), containsInAnyOrder(
				ERROR_MESSAGE_ADDRESS,
				ERROR_MESSAGE_NAME,
				ERROR_MESSAGE_EMAIL,
				ERROR_MESSAGE_PASSWORD,
				ERROR_MESSAGE_CONFIRMPASS,
				ERROR_MESSAGE_PHONE
				));
		
		// Hieu khong ?--da ok hieu a
		// Muon hieu nhieu hon nua thi vao phan java docs cua Junit docs
		
		/* anna.show_message_error_blank_name(ERROR_MESSAGE_NAME); */
	}

}
