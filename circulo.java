import java.util.Locale;
import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio=sc.nextDouble();
		
		area=3.14159*Math.pow(raio,2);
		
		System.out.println("AREA = " + String.format("%.3f", area));
		
		sc.close();
	}

}
