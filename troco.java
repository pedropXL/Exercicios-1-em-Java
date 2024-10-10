import java.util.Locale;
import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco=sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade=sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro=sc.nextDouble();
		
		troco=dinheiro-(preco*quantidade);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}

}
