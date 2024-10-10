import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double combustivel, consumo;
		
		System.out.print("Distancia percorrida: ");
		distancia=sc.nextInt();
		System.out.print("Combustível gasto: ");
		combustivel=sc.nextDouble();
		
		consumo=(double)distancia/combustivel;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumo));

		sc.close();
	}

}
