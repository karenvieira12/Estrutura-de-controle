package Estruturadecontrole;

import java.util.Scanner;
public class Ex9Test {
	public static void main (String args[]) {
		Ex9 objeto= new Ex9();
		double valor,valorFinal;
		int condicao;
		Scanner input=new Scanner(System.in);
		System.out.print("Digite o valor da etiqueta:");
		valor= input.nextDouble();
		System.out.print("Digite o tipo de pagamento:");
		condicao= input.nextInt();
		valorFinal= objeto.core(valor, condicao);
		System.out.println("O valor Final:" + valorFinal);
	}

}
