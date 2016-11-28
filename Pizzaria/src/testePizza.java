import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testePizza {
	
	Pizza p1,p2,p3;
	@Before
	public void inicializa(){
		p1 = new Pizza();
		p2 = new Pizza();
		p3 = new Pizza();
		
	}
	@After
	public void finaliza(){
		p1.clearRegistro();
		p2.clearRegistro();
		p3.clearRegistro();
	}
	@Test
	public void testeAdicionaIngrediente() {
		
		p1.adicionaIngrediente("Tomate");
		assertEquals(1, p1.getContabilizaIngrediente("Tomate"));

	}
	@Test
	public void testeGetPreco(){
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Queijo");
		assertEquals(15,p1.getPreco());
		p1.adicionaIngrediente("Queijo");
		assertEquals(20,p1.getPreco());
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Tomate");
		assertEquals(23,p1.getPreco());
	}

	@Test
	public void testeGetContabilizaIngredientes(){
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Queijo");
		assertEquals(2, p3.getContabilizaIngrediente("Queijo"));
	}
	@Test(expected=PizzaSemIngredienteException.class)
	public void adicionaPizzaSemIngrediente(){
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p2);
	}
	@Test
	public void testeTotalCarrinho(){
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Cebola");
		c.adicionaPizza(p1);
		assertEquals(15 , c.totalCarrinho());
		p2.adicionaIngrediente("Macarrão");
		c.adicionaPizza(p2);
		assertEquals(30 , c.totalCarrinho());
	}
}
