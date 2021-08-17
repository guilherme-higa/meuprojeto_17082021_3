package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoa = new ArrayList<>();

		System.out.print("Entre com o numero de pagadores :");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.print("Pessoa Fisica ou Pessoa Juridica (f/j) ? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual:");
			double valor = sc.nextDouble();
			if (resposta == 'f') {
				System.out.print("Gastos com saúde:");
				double gastos_saude = sc.nextDouble();
				pessoa.add(new PessoaFisica(nome, valor, gastos_saude));
			}
			if (resposta == 'j') {
				System.out.print("Numero de funcionários:");
				int num_funcionarios = sc.nextInt();
				pessoa.add(new PessoaJuridica(nome, valor, num_funcionarios));
			}

		}
		System.out.println();
		System.out.println("TAXAS PAGAS:");
		for (Pessoa x : pessoa) {
			System.out.println(x);
		}
		System.out.println();
		System.out.print("TOTAL DE IMPOSTOS:");
		double sum = 0;
		for (Pessoa x : pessoa) {
			sum += x.imposto();
		}
		System.out.print("$" + sum);
		sc.close();
	}

}
