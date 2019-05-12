package vn.mycompany.auto.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

	@FindBy(css = ".btn")
	private WebElementFacade clickbtnRegister;

	public void click_button_register_at_register_page() {
		clickbtnRegister.click();

	}

	// @FindBy(id = "name")
	private WebElementFacade name;

	public void add_name_field_register(String userName) {
		name.type(userName);

	}

	// ở phần Page nếu như có id hoặc name. mà giá trị của nó có thể dùng để đặt
	// biến thì ko cần FindBy.
	// E co the dung nhu sau

	// @FindBy(id = "email")
	// private WebElementFacade inputEmail;
	private WebElementFacade email;

	public void add_email_field_register(String mailAddress) {
		email.type(mailAddress);
		// Hieu chua
		// doi voi xpath,css thi ko dung ko a. ko duoc
		// Ngauy ca gia tri cua id hoac nam ma co khoang trang kieu như id=e-mail thi
		// cung ko dung duoc
		// vi e-mail khong the dung de dat bien
		// Hieu khong ? da hieu a

	}

	// @FindBy(id = "password")
	private WebElementFacade password;

	public void add_password_field_register(String pwd) {
		password.type(pwd);

	}

	// e tu thay cai con lai-- doi voi cai nay ko thay dk, dung ko anh, theo em hieu
	// la vay
	// dk la gi, ah. dk = được hả.
	// cai nay van duoc
	// @FindBy(id = "password_confirm")
	private WebElementFacade password_confirm;

	public void add_password_confirm_field_register(String pwdConfirm) {
		password_confirm.type(pwdConfirm);
	}

	@FindBy(id = "phone")
	private WebElementFacade inputPhone;

	public void add_phone_field_register(String phone) {
		inputPhone.type(phone);

	}

	// Cai nay giong nhu nhung cai tren la de xac dinh minh se tim element theo kieu
	// nao
	// o day minh tim bang xpath
	// Em hieu chua--ok
	@FindBy(xpath = "//div[@class='alert alert-danger']")

	// Vi xpath tren trung voi nhieu element khac nhau. Nghia la co rat nhieu
	// element co chung xpath kieu vay
	// trong truong hop cua em. có 6 cái err msg.
	// e hieu cai nay khong--ok

	// Binh thuong neu la mot WEB ELEMEMNT THI MINH DUNG
	// private WebElementFacade userErrMsg => hieu chua --ok

	// Gio minh co mot danh sach. co nhieu cai error msg thi minh se khai bao se su
	// dung List trong java
	// cai nay la core java. e biet khong--phan nay de em hoc them a

	// Good. Day la ly do vi sao anh khong nhan hoc sinh khong phai IT. Vi cai nay
	// lien qua toi lap trinh

	private List<WebElementFacade> errMsgs;

	public List<String> get_err_msg() {

		// Khai bao List String de minh chua nhung gia tri text lay o tren man hinh
		// Giong nhu minh can mot cai gio co nhieu ngan de sap hang vao ay
		// Hieu khong--ok a

		// Duoi la cach khai bao mot List va cach dung: Nho tranh thu thoi gian hoc --da
		List<String> actualsResult = new ArrayList<>();
		for (WebElementFacade errMsg : errMsgs) {
			actualsResult.add(errMsg.waitUntilPresent().getText());
		}

		// Muc dich cua cai nay la lay toan bo cac dong errrmsg tren mang hinh cho vao
		// danh sach

		// Neu muon lay mot phan tu nao do trong danh sach em phai dung vong lap de
		// duyet toan bo cac item trong do
		// Danh thoi gian hoc vong lap nha => ok a

		return actualsResult;
	}

	// hoac e co the hoc code nay
/*
	public List<String> getAllErrorMassges() {
		return findAll(By.xpath("//div[@class='alert alert-danger']")).stream().map(element -> element.getText())
				.collect(Collectors.toList());

		// Cai nay la chuc nang moi trong java 8. tu java 7 ve truoc khong co stream. e
		// co the hoc cai nay sau
		// ok ?--da a. a se guio video ve cai nay cho hoc sau. Tum lai muon gioi thi phai hoc ky core java.
		// give me your best ?da . Good girl.
	}
*/
	@FindBy(id = "address")
	private WebElementFacade inputAddress;

	public void add_address_field_register(String address) {
		inputAddress.type(address);
	}

	// Day la cach 1: Lay het toan bo thong tin error message, roi kiem tra trong
	// toan bo danh sach lay duoc
	// co cai minh can.

}
