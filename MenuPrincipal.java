package aularevisao;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int continuar=1;
		Cliente[] clientes = new Cliente[4];
		
		do {
			System.out.println("==================== MENU PRINCIPAL =========================");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Mostrar Todos os Clientes");
			System.out.println("3 - Selecionar Cliente");
			System.out.println("4 - Alterar Cliente");
			System.out.println("5 - Sair");
			System.out.println("Digite a opção desejada: ");
			int opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("******************************************************");
				System.out.println("                     CADASTRANDO O CLIENTE");
				System.out.println("******************************************************");
				
				for(int i=0;i<clientes.length;i++) {
				System.out.print("Nome: ");
				String nome = leitor.next();
				
				System.out.print("RG: ");
				String rg = leitor.next();
				
				System.out.print("CPF: ");
				String cpf = leitor.next();
				
				System.out.print("Salário: R$");
				double salario = leitor.nextDouble();
				
				clientes[i] = new Cliente(nome,rg,cpf,salario);
				System.out.println();
				}
				
				break;
			case 2:
				System.out.println("******************************************************");
				System.out.println("                      MOSTRANDO O CLIENTE");
				System.out.println("******************************************************");
				
				for(int i=0;i<clientes.length;i++) {
					System.out.println("Nome: " + clientes[i].getNome());
					System.out.println("RG: " + clientes[i].getRg());
					System.out.println("CPF: " + clientes[i].getCpf());
					System.out.println("Salário: " + clientes[i].getSalário());
					System.out.println();
					
				}
				
				break;
			case 3:
				System.out.println("******************************************************");
				System.out.println("          SELECIONANDO O CLIENTE DESEJADO");
				System.out.println("******************************************************");
				
				System.out.println("Cliente: ");
				String nome = leitor.next();
				
				for(int i=0;i<clientes.length;i++) {
						
					if(clientes[i].getNome().equals(nome)){
						System.out.print("Nome:" + clientes[i].getNome());
						System.out.println("RG: " + clientes[i].getRg());
						System.out.println("CPF: " + clientes[i].getCpf());
						System.out.println("Salário: " + clientes[i].getSalário());
						
				}
			}		
					
			case 4:
				System.out.println("******************************************************");
				System.out.println("                      ALTERAR DADOS DO CLIENTE");
				System.out.println("******************************************************");
				
				System.out.println("Cliente: ");
				String cliente = leitor.next();
				
				for(int i=0;i<clientes.length;i++) {
					
					if(clientes[i].getNome().equals(cliente)){
					
						System.out.print("Nome: ");
						clientes[i].setNome(leitor.next());
						System.out.println("RG: ");
						clientes[i].setRg(leitor.next());
						System.out.println("CPF: ");
						clientes[i].setCpf(leitor.next());
						System.out.println("Salário: ");
						clientes[i].setSalário(leitor.nextDouble());
				
				
				break;
					}
				}	
				
			case 5:
				System.out.println("****************************************************");
				System.out.println("     FINALIZANDO O SISTEMA       ");
				System.out.println("****************************************************");
				
				default:
					System.out.println("******************************************************");
					System.out.println("                  OPÇÃO INVÁLIDA!");
					System.out.println("******************************************************");
		}
		}while(continuar!=4);
		
		leitor.close();

	}

}
