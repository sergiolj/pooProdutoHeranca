package herança;

public class Notebook extends Eletronico{
	private String model;
	private String branch;
	private String processor;
	private int ramMemory;
	private int ssdMemory;
	
	
	public Notebook(String name, double price, int stock, TipoEletronico t, Tensao v, String serial, int eletricPower, String model, String branch,
			String processor, int ramMemory, int ssdMemory) {
		super(name, price, stock, t, v, serial, eletricPower);
		
		this.model = model;
		this.branch = branch;
		this.processor = processor;
		this.ramMemory = ramMemory;
		this.ssdMemory = ssdMemory;
	}
	
	/**
	 * Desconto especial para notebooks pode ser maior do que o para eletronicos em geral.
	 */
	@Override
	public double calcularDesconto() {
		int percentageDiscount = 15;
		double finalPrice;
		/*
		 * A divisão de inteiro por inteiro resulta em inteiro em java.. 
		 * a divisão tem que usar um double (100d) para funcionar como esperado
		 */
		finalPrice = super.getPrice() * (1-(percentageDiscount/100d));
		System.out.println("\nPreço com desconto R$: " + finalPrice + "\n");
		return finalPrice;
	}
	
	
	@Override
	public void displayInfo() {
		String strg = "Modelo: " + this.model + "\nMarca: " + this.branch + "\nProcessador: " + this.processor 
				+ "\nMemória RAM: " + this.ramMemory + " Gb" + "\nDisco SSD" + this.ssdMemory + " Gb";
		super.displayInfo();
		System.out.println("Sub Classe Notebook");
		System.out.println(strg);
	}
}

