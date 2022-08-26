package Exercicio;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		long numero;
		int agencia;
		double valor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		
		numero =ler.nextLong();
		
		
		System.out.println("Digite a agencia");
		agencia = ler.nextInt();
		
		
		ContaCorrente c1 = new ContaCorrente(numero,agencia);
		System.out.println("Digite o valor de deposito");
		valor = ler.nextDouble();
		c1.Depositar(valor);
		System.out.println("Saldo: "+c1.ConsultaSaldo());
		
		
		
	/*	ContaCorrente c1; //cria a variavel c1 do tipo ContaCorrente
		c1 = new ContaCorrente(1234,526); // Instancia a variavel c1
		c1.Depositar(8000);
		System.out.println("Foi depositado "+c1.ConsultaSaldo() );
		
		c1.Sacar(1000000);
		System.out.println("Voce sacou " +c1.ConsultaSaldo());
		
	 * */
	}

}
