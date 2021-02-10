/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construido dentro de um programa Java.
 * 2) Todo programa Java deve ter uma classe com um metodo main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma String do terminal (console) do Java.
 */

package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author lucas costa
 *
 */
public class Principal { // Classe que contém o método principal.
	public static void main(String[] args) {
		System.out.print("Olá amigo(a)!\nQual é o seu nome?"); // uso do printIn
		
		// Ler uma string do console usando a biblioteca do Scanner.
		Scanner in = new Scanner(System.in);
		String none = in.next();
		
		// Saldação específica para o nome lido.
		System.out.printf("Olá %s!\n", none);
		in.close();
		
		//NOTA: Implementar leitura da idade e exibi-la.
		

	}
}

