package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.frutas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<frutas> list = new ArrayList<>();

		System.out.println("quer fazer a lista de frutas:s/n");
		char ch = sc.next().charAt(0);
		
		if(ch == 's') {
			
			System.out.println("quantas frutas deseja por: ");
			int n = sc.nextInt();			
			for (int i = 0; i <= n; i++) {
				sc.nextLine();
				System.out.println("nome da fruta: ");
				String name = sc.nextLine();
				System.out.println("quantidade da furta :");
				Integer quantity = sc.nextInt();
				
				frutas fruta = new frutas(name, quantity);
				list.add(fruta);
			}
			
			
		}
		

		for (frutas f : list) {
			System.out.println(f.getName() + ", " + f.getQuantity());
		}

	}
}
