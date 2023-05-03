package pensionato;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Main {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		System.out.print("Quantos quartos serão ocupados? ");
		int n = sc.nextInt();
		//sao dez quartos na pensao - vetor do tipo classe
		Pensionato[] vetQuarto = new Pensionato[10];
		//como o for nao tem haver com o vetor e sim com a posição vamos começar com i=1
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			//tem q limpar o buck
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			//next() porque email não tem espaço em branco
			String email = sc.next();
			System.out.print("Room: ");
			int numeroQuarto = sc.nextInt();
			//instanciar a classe, ja que ja declarei as variaveis, o valor das variaveis esta na memoria heap
			Pensionato pensao = new Pensionato(name,email);
			//pensao com 10 quartos recebe o [numero do quarto a ser ocupado] e os dados do ocupante
			vetQuarto[numeroQuarto] = pensao;
			/*
			 * posso simplificar tbem:
			 * vetQuarto[numeroQuarto] = new Pensionato(nome,email);
			 */
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0;i<vetQuarto.length;i++) {
			//qdo imprimos o vetor com alguns campos ocupados ele mostra os outros campos como null
			if (vetQuarto[i] != null) {
				System.out.println(i +""+vetQuarto[i]);
			}			
		}
		sc.close();
	}
}