import java.util.Scanner;
public class exercicioB3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	    System.out.println("Digite um número: ");
	    int numero = sc.nextInt();
	    int soma = 0;
	    while (numero != 0) {
	        soma += numero;
	        numero = sc.nextInt();
	    }

	    System.out.println("Soma: "+soma);
	}
}