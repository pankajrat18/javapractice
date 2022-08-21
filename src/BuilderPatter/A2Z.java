package BuilderPatter;

public class A2Z {

	public static void main(String[] args) {

		AmazonShop app = new AmazonShop();

//If all are returning to obj of same class then no need to create separate obj & by using Builder patter methods can be called
		app.login("pankr", "King123").searchProduct("Iphone").addToCart().doPayment(4345).generateOrderId(1234)
				.logout();

		System.out.println("________");

		app.login(1235).searchProduct("Lappy").addToCart().doPayment("3455667").logout();

	}

}
