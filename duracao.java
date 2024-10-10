import java.util.Locale;
import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao, s, m, h, resto;
		
		System.out.print("Digite a duracao em segundos: ");
		duracao=sc.nextInt();
		
		h=duracao/3600;
		resto=duracao%3600;
		
		m=resto/60;
		s=resto%60;
		
		System.out.println(h + ":" + m + ":" +  s);
		
		sc.close();
	}

}
