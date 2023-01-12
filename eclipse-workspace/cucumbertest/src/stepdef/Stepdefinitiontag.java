package stepdef;

import io.cucumber.java.en.Given;

public class Stepdefinitiontag {
	

	@Given("This is login test")
	public void this_is_login_test() {
	    System.out.println("This is login test");
	}

	@Given("This is a unscuccesful login test")
	public void this_is_a_unscuccesful_login_test() {
		 System.out.println("This is unscuccesful login test");
	}

	@Given("This is add to cart test")
	public void this_is_add_to_cart_test() {
		System.out.println("This is add to cart test");
	}

	@Given("This is multiple product addtocart test")
	public void this_is_multiple_product_addtocart_test() {
		System.out.println("This is  multiple product addtocart test");
	}

	@Given("This removing  product from cart test")
	public void this_removing_product_from_cart_test() {
		System.out.println("This removing  product from cart test");
	}

	@Given("This product quantity from bag  test")
	public void this_product_quantity_from_bag_test() {
		System.out.println("This product quantity from bag  test");
	}

	@Given("This Decrease product quantity from bag test")
	public void this_decrease_product_quantity_from_bag_test() {
		System.out.println("This Decrease product quantity from bag test");
	}

	@Given("This is buy a product with cash payment bag test")
	public void this_is_buy_a_product_with_cash_payment_bag_test() {
		System.out.println("This is buy a product with cash payment bag test");
	}

	@Given("This is buy a product with CC payment  test")
	public void this_is_buy_a_product_with_cc_payment_test() {
		System.out.println("This is buy a product with CC payment  test");
	}

	@Given("This is Payment declined  test")
	public void this_is_payment_declined_test() {
		System.out.println("This is Payment declined  test");
	}
}
