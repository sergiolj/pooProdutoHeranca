package herança;

public class Produto {
	private String name;
	private double price;
	private int stock;
	
	/*
	 * O construtor padrão pode ser usado pelas classes que herdam a superclasse quando não preenchidos
	 * para que seja feita a referência entre classe pai e filho (superclasse e subclasse)
	 * A outra opção é passar todos os parâmetros acumulados entre as classes recebidos na subclasse como
	 * os casos de Eletronico, Notebook e Vestuario
	 */
	public Produto() {}
	
	public Produto(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
	
	public int getStock() {
		return stock;
	}

	public void setEstoque(int estoque) {
		this.stock = estoque;
	}
	
	
	public double calcularDesconto() {
		System.out.println("\nPreço com desconto R$: " + this.price + "\n");
		return this.price;
	}
	
	
	public void displayInfo() {
		String strg = "Nome do produto " + this.getName() + "\n"
				+ "Preco do produto: " + this.getPrice() + "\n"
				+ "Quantidade em estoque: " + this.getStock()+"\n";
		System.out.println("Super Classe Produto");
		System.out.println(strg);
	}
	
}
