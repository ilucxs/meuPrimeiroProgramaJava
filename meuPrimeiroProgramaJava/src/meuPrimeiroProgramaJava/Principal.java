/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � construido dentro de um programa Java.
 * 2) Todo programa Java deve ter uma classe com um metodo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
 * 4) Como ler uma String do terminal (console) do Java.
 */

package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author lucas
 *
 */
public class Principal { // Classe que cont�m o m�todo principal.
	public static void main(String[] args) {
		System.out.print("Ol� amigo!\nQual � o seu nome?"); // uso do printIn
		
		// Ler uma string do console usando a biblioteca do Scanner.
		Scanner in = new Scanner(System.in);
		String none = in.next();
		
		// Exibir uma string usando printf.
		System.out.printf("Ol� %s!\n", none);
		in.close();
		

	}
}

