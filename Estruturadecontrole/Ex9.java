package Estruturadecontrole;

public class Ex9 {
	public void core (double valor, int condicao) {
		double valorFinal;
		switch (condicao) {
		case 1:
			valorFinal= valor - 0.1 *valor;
		break;
		
		case 2:
			valorFinal= valor - 0.15 *valor;
		break;
		
		case 3:
			valorFinal= valor;
		break;
		
		case 4:
			valorFinal= valor + 0.1 *valor;
		break;
		}
		return valorFinal;
		
	}

}
