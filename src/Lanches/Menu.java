package Lanches;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pedido ;
		System.out.println("==========Escolha o hambúrguer que deseja: ==============");
		System.out.println("1 - X-Bacon");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Picanha");
		System.out.println("4 - X-Tudo");
		System.out.print("Digite o número da opção que você deseja: ");
		
		pedido = input.nextInt();
		
		switch (pedido) {
		
		case 1: 
			System.out.println("Você escolheu 1 X Bacon");
			System.out.println("Valor do pedido: R$ 20,00 ");
			break;
		
		
		case 2: 
			System.out.println("Você escolheu 1 X-Salada");
			System.out.println("Valor do pedido: R$ 15,00 ");
			break;
		
		
		case 3: 
			System.out.println("Você escolheu 1 X-Picanha");
			System.out.println("Valor do pedido: R$ 22,00 ");
			break;
		
		
		case 4: 
			System.out.println("Você escolheu 1 X-Tudo");
			System.out.println("Valor do pedido: R$ 30,00 ");
			break;
			
		default :
			System.out.println("Digita um numero certo ai mermao");
			break;
		}
		

	}

}
