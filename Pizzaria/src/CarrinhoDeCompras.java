
public class CarrinhoDeCompras {
	
	private int valorTotal = 0;
	
	public void adicionaPizza(Pizza p1) {
		if (p1.estaSemIngredientes())
			throw new PizzaSemIngredienteException("Pizza Sem Ingredientes");
		else {
			valorTotal += p1.getPreco();

		}
	}
	public int totalCarrinho()
	{
		return valorTotal;
	}

}
