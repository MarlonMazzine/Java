import java.util.Scanner;

public class SegundoGrau {
	
	private static Scanner valora,  valorb, valorc;

	public static void main(String[] args) {
		
		float a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
		
		System.out.println("Digite o valor de 'a': ");
		valora = new Scanner(System.in);
		a = valora.nextFloat();
		while (a == 0) {
			System.out.println("O valor de 'a' não pode ser igual a zero.");
			System.out.println("Digite um valor > ou < que zero para 'a': ");
			valora = new Scanner(System.in);
			a = valora.nextFloat();
		}
		System.out.println("Digite o valor de 'b': ");
		valorb = new Scanner(System.in);
		b = valorb.nextFloat();
		System.out.println("Digite o valor de 'c': ");
		valorc = new Scanner(System.in);
		c = valorc.nextFloat();
		
		delta = ((b * b) - (4 * a * c));
		x1 = ((-b) + (sqrt(delta))) / (2 * a);
		x2 = ((-b) - (sqrt(delta))) / (2 * a);
		
		System.out.println("O valor de 'delta' é: " + delta);
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}

	private static float sqrt(float delta) {
		return 0;
	}
}