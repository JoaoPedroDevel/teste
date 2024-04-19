package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
		
		System.out.print("Enter rectangle with and height");
		System.out.println("");
		
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		
		sc.close();
	}

}
