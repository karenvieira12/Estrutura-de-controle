package Estruturadecontrole;

public class EstruturaifElse {
	
	public String mencaoAluno(double notaAluno) {
		String aux;
		if(notaAluno > 9 ) {
			aux = "SS";
		}
		else if (notaAluno >8 && notaAluno < 9) {
			aux="MS";
		}
		else if (notaAluno >7 && notaAluno < 8) {
			aux="MM";
		}
		else {
			aux="MN";
		}
		return aux;
	}
	
	public String mencaoAluno2(double nota) {
		String aux="";
		switch ((int)nota) {
		    case 9:
			aux="SS";
		        break;
		    case 8:
			aux="MS";
		        break;
		    case 7:
			    aux="MM";
			default:
			    aux="MN";
			     break;	
		}
		return aux;
	
	}
	
	public String avaliacao(double notaAluno) {
		
			String mencao;
			if (notaAluno >=7) {
				mencao="Aprovado";
			}
			else {// nota <7
				mencao="Reprovado";
			}
			
			return mencao;
	}

}
