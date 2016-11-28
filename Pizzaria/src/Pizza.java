import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pizza {
	static HashMap<String, Integer> map = new HashMap<String, Integer>(); 
	private int qtdIngredientes = 0;



	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		qtdIngredientes++;
	}

	public boolean estaSemIngredientes(){
		if (qtdIngredientes == 0)
			return true;
		else
			return false;
	}

	public int getPreco() {
		if (qtdIngredientes <=2)
			return 15;
		if ((qtdIngredientes >2) && (qtdIngredientes <= 5))
			return 20;
		else
			return 23;
	}

	public static void contabilizaIngrediente(String string) {
		if (map.containsKey(string)){
			map.put(string, map.get(string)+1);
		}
		else
			map.put(string, 1);
	}
	
	public static void clearRegistro(){
		map.clear();
	}
	public int getContabilizaIngrediente(String s){
		return map.get(s);
	}
	
	public void imprimeIngredientes(){
		Set s = map.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			String key=(String)m.getKey();
			Integer value=(Integer)m.getValue();
			 System.out.println("Ingrediente "+key+"  Qtde "+value);
			
		}
	}
}
