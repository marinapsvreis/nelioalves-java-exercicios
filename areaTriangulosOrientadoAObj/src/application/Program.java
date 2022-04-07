package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		//o comando acima define o padr�o para . na hora de separar double
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX, areaY;
		
		areaX = x.area(x.a, x.b, x.c);
		areaY = y.area(y.a, y.b, y.c);
		
		System.out.printf("�rea do Tri�ngulo X: %.4f%n", areaX);
		System.out.printf("�rea do Tri�ngulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior �rea � do Triangulo X");
		}else if(areaX == areaY){
			System.out.println("Os triangulos X e Y tem as �reas iguais!");
		}else {
			System.out.println("A maior �rea � do Triangulo Y");
		}		
		
		sc.close();

	}

}
