package stepDefinition_tags;

import io.cucumber.java.en.Given;

public class Tags_Steps {
	
	@Given("Login test")
	public void login_test() {
	    System.out.println("login test inside smoke and regression tags");
	}
	@Given("Login fail")
	public void login_fail() {
	    System.out.println("login fail inside regression tag");
	}
	
	@Given("product add")
	public void Add_a_product_to_bag() {
	    System.out.println("product add inside smoke tag");
	}
	@Given("multi products")
	public void Add_multiple_prod_to_bag() {
	    System.out.println("add multiple prod with no tags");
	}
}
