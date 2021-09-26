package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual é o seu peso");
		double peso = scan.nextDouble();
		
		System.out.println("Qual é a sua altura");
		double altura = scan.nextDouble();
		
		Program prog = new Program();
		double imc = prog.calculoImc(peso, altura);
		
		System.out.println("Resultado: "  + imc);
		
	}
	
	public double calculoImc(double peso, double altura) {
		return peso / Math.pow(altura, 2);
	}

}
