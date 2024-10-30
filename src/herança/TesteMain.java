package herança;

public class TesteMain {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("Notebook 15pol Dell",2500d,5,TipoEletronico.NOTEBOOK,Tensao.Bivolt,"34366ABX43",60,
				"Inspiron I 15","Dell","Ryzen 9", 16, 512);
		notebook.displayInfo();
		notebook.calcularDesconto();
		
		Produto produto = new Produto("Microondas",450,10);
		produto.displayInfo();
		produto.calcularDesconto();
	}

}
