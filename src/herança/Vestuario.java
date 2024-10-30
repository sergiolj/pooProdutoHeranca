package herança;

public class Vestuario extends Produto {
	private Size size;
	private String color;
	
	public Vestuario(String name, double price, int stock, Size size, String color) {
		super(name,price,stock);
		this.size = size;
		this.color = color;
	}
	
	@Override
	public double calcularDesconto() {
		int percentageDiscount = 10;
		double finalPrice;
		finalPrice = super.getPrice() * (percentageDiscount/100);
		System.out.println("\nPreço com desconto R$: " + finalPrice);
		return finalPrice;
	}

}
