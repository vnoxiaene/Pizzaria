
public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
//		p1.adicionaIngrediente("Tomate");
//		p1.adicionaIngrediente("Cebola");
//		p1.adicionaIngrediente("Queijo");
		
		p2.adicionaIngrediente("Azeitona");
		p2.adicionaIngrediente("Abobrinha");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Feijão");
		p2.adicionaIngrediente("Carne Seca");
		
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Soja");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		c.adicionaPizza(p3);
		System.out.println("Total = "+c.totalCarrinho());
		p1.imprimeIngredientes();
	}

}
