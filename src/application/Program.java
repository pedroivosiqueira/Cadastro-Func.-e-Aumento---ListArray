package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, incremento;
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			System.out.println("\nFuncionário #" + (i+1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Sarlário: ");
			double salario = sc.nextDouble();
			
			list.add(new Employee(id, nome, salario));			
		}
						
		System.out.print("\nInforme o Identificação do funcionário que terá aumento salarial: ");
		incremento = sc.nextInt();
		
		Employee  verificacao = list.stream().filter(x -> x.getId() == incremento ).findFirst().orElse(null);
		
		if (verificacao == null) {
			System.out.println("Este id não existe!");
		}
		else {
			System.out.print("Digite o valor do Aumento: ");
			double porcentagem = sc.nextDouble();
			verificacao.increaseSalary(porcentagem);
		}
		
						
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close();

	}

}
