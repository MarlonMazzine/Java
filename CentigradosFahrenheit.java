import java.util.Scanner;

/*
 * 4) Faça um programa que leia em graus centigrados e apresentar em graus Fahrenheit.
 * A fómula é dada por: F = 9c + 160 / 5
 */

public class CentigradosFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float fahrenheit = 0;
		System.out.print("Digite a temperatura em graus centigrados: ");
		float centigrados = scanner.nextFloat();
		fahrenheit = ((9 * centigrados) + 160) / 5;
		System.out.println(centigrados + " C é igual a " + fahrenheit + " F.");
		
		scanner.close();
	}
}
