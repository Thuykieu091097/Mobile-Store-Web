package vn.mycompany.auto.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
 
// no chinh la tai lieu cua cai Page Obect nay.
public class CartPage extends PageObject {

	// doi voi xpath hoac css co the khong can dung cai FindBy ma dung $(xpath hoac css)
	//@FindBy(xpath = "//a[contains(text(),'Chọn sản phẩm')]")
	//private WebElementFacade buttonChooseProduct;

	public void click_button_choose_a_product() {
		//buttonChooseProduct.click();
		$("//a[contains(text(),'Chọn sản phẩm')]").waitUntilClickable().click();
		
		// Hieu khong ?--da hieu a.. Great!!!
		
	}

	// nhu cai nay khong the dung truc tiep gia tri cua id nay. vi no co dau -. aci nay khong the dung dat bien duoc
	
	@FindBy(id="add_to-cart")
	private WebElementFacade buttonAddToCart;
	
	public void click_add_to_cart() {
		buttonAddToCart.click();		
	}

	//@FindBy(css=".wrapper-mini-cart > a")
	//private WebElementFacade buttonCart;
	
	public void click_button_cart() {
		//buttonCart.click();
		$(".wrapper-mini-cart > a").waitUntilClickable().click();
		
	}

	//@FindBy(css=".btn-success")
	//private WebElementFacade buttonGoToOrder;
	// hoac co the dung tu khoa element
	public void click_button_go_to_order_to_pay() {
		//buttonGoToOrder.click();
		element(".btn-success").click();
		// Hieu khong ?Da hieu--
		// vay l;a co 3 cach khac nhau. em dumg cach nao cung duoc.
		// Muc dich la de viet code gon, de hieu, de doc thoi. khong co gi khac biet.Vang e se note lai
		
	}

	@FindBy(css=".btn-secondary")
	private WebElementFacade buttonBack;
	
	public void click_button_back() {
		buttonBack.click();
		
		// Em muon biet trong cai PageObject có bao nhieu actions thi dung cacxh nay de voc nay
		// e lay mot element bay ky
		// khi em bam dau . no tu dong auto complete. em se thay toan bo nhung method/action ma e co the dung duoc
		
		// Bam control + space. em thu di
		// em doc ten method va cach dung cua no.
		// anh se lam vi
		
		/*$("//bala nal").selectByIndex(arg0)*/
		// e vao phan java docs cua serenity de biet no dung lam gi. sau viet code chay thu.
		// quan sat no chay va tim ra kien thuc can hoc,
		// Anh dang day em cach hoc do'--da anhhh :D
		
	}

	@FindBy(linkText="Delete")
	private WebElementFacade buttonDelete;
	
	public void click_button_delete() {
		buttonDelete.click();
		
	}

	@FindBy(name="qty")
	private WebElementFacade inputAmount;
	
	public void input_amount_products_need_buying(String number) {
		inputAmount.type(number);
		
	}

	@FindBy(name="qty")
	private WebElementFacade buttonChangeAmount;
	
	public void click_button_change_amount_products() {
		buttonChangeAmount.click();
		
	}


}