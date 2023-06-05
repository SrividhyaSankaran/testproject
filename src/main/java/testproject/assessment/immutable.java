package testproject.assessment;

final class immutable {

	private final String product;
	private final Integer price;
	
	public immutable(String product, Integer price) {
		super();
		this.product = product;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		immutable im = new immutable("Laptop" , 10000);
		System.out.println(im.product + ""+ im.price);
	}
}
