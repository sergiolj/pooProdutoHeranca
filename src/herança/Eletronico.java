package herança;

public class Eletronico extends Produto{
	private TipoEletronico type;
	private Tensao voltage;
	private String serial;
	private int warranty;
	private int eletricPower;
	
	
	public Eletronico(String name, double price, int stock, TipoEletronico t, Tensao v, String serial, int eletricPower) {
		super(name, price, stock);
		this.type = t;
		this.voltage = v;
		this.serial = serial;
		this.warranty = type.garantia(type);
		this.eletricPower = eletricPower;
	}
	
	@Override
	public double calcularDesconto() {
		int percentageDiscount = 5;
		double finalPrice;
		finalPrice = super.getPrice() * (percentageDiscount/100);
		System.out.println("\nPreço com desconto R$: " + finalPrice + "\n");
		return finalPrice;
	}
	
	@Override
	public void displayInfo() {
		String strg = "Classificação: " + this.type + "\nVoltagem: " + this.voltage
				+ "\nNúmero de Série: " + this.serial + "\nGarantia: " + this.warranty + " meses"
				+ "\nConsumo: " + this.eletricPower + " Watts\n";
		super.displayInfo();
		System.out.println("Sub Classe Eletronico");
		System.out.println(strg);
		
	}
	
}