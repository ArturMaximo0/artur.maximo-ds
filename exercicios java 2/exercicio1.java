import java.util.Scanner;
public class exercicio1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o número:");
	    int numero = sc.nextInt();
	    
	    System.out.println("Dobro: "+ numero * 2);
	    System.out.println("Triplo: "+ numero * 3);
	}
}