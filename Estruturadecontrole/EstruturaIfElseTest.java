package Estruturadecontrole;

import java.util.Scanner;
public class EstruturaIfElseTest {
    public static void main(String args[]) {
    	EstruturaifElse obj= new EstruturaifElse();
    	Double nota;
    	Scanner input= new Scanner (System.in);
    	System.out.print("Digite a nota: ");
    	nota= input.nextDouble();
    	String resultado=obj.avaliacao(nota);
    	String mencao= obj.mencaoAluno(nota);
    	System.out.println("O aluno foi" + resultado + " com "+ mencao);
    }
}
