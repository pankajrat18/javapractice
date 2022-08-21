package BuilderPatter;

public class AmazonShop {
	// return type is current class name
	// it is indicated by this keyword

	public AmazonShop login(int OTP) {
		System.out.println("User is logged in: " + OTP);
		return this;
	}

	public AmazonShop login(String Username, String Pswd) {
		System.out.println("User is logged in: " + Username + ", " + Pswd);
		return this;
	}

	public AmazonShop searchProduct(String product) {
		System.out.println("Product looking for: " + product);
		return this;
	}

	public AmazonShop addToCart() {
		System.out.println("Product added to card");
		return this;
	}

	public AmazonShop doPayment(String cc) {
		System.out.println("Payment done via CC " + cc);
		return this;

	}

	public AmazonShop doPayment(int upi) {
		System.out.println("Payment done via UPI " + upi);
		return this;
	}

	public AmazonShop generateOrderId(int id) {
		System.out.println("Generate order id " + id);
		return this;
	}

	public AmazonShop logout() {
		System.out.println("User has been logged out");
		return this;
	}
}