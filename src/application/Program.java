package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Contribuintes>list = new ArrayList<>();
		
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n ; i++) {
			System.out.println("Tax prayer #" + i +"data: ");
			System.out.println(" Indinidual pr company? (i/c)");
			char in = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println(" Anual income: ");
			Double income = sc.nextDouble();
			
			if (in=='i') {
				System.out.println("Health expenditures: ");
				Double saude = sc.nextDouble();
				Contribuintes cont = new PessoaFisica(name, income, saude);
						list.add(cont);
			}
			
			if (in=='c') {
			  System.out.println("Number of employees: ");
			  Integer func = sc.nextInt();
			  Contribuintes cont = new PessoaJuridica(name, income, func);
			  list.add(cont);
			}
		}
			
		for (Contribuintes b : list) {
				 System.out.println(b.getName()+ ": $" + String.format("%.2f", b.valorDoImposto()));
			 }
			
			 double sum = 0.0;
			for (Contribuintes b : list) {
				sum += b.valorDoImposto();
			}
		System.out.println("TOTAL DE IMPOSTOS: $"+ String.format("%.2f", sum));
sc.close();
	}

}
