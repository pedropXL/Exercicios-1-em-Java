import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, quadrado, triangulo, trapezio;
		
		System.out.print("Digite a medida A: ");
		a=sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b=sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c=sc.nextDouble();
		
		quadrado=a*a;
		triangulo=(a*b)/2;
		trapezio=(a+b)*c/2;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", quadrado));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", triangulo));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", trapezio));
		
		sc.close();
	}

}
