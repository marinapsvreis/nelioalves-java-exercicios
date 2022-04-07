package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		//o comando acima define o padrão para . na hora de separar double
		Scanner sc = new Scanner (System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double areaX, areaY, pX, pY;
		
		pX = (xA + xB + xC)/2;
		pY = (yA + yB + yC)/2;
		
		areaX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));
		areaY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));
		
		System.out.printf("Área do Triângulo X: %.4f%n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior área é do Triangulo X");
		}else if(areaX == areaY){
			System.out.println("Os triangulos X e Y tem as áreas iguais!");
		}else {
			System.out.println("A maior área é do Triangulo Y");
		}		
		
		sc.close();

	}

}
