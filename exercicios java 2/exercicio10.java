import java.util.Scanner;
public class exercicio10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("digite o primeiro número:");	
	    int numero1 = sc.nextInt();
	    
	    System.out.println("Digite o segundo número:");
	    int numero2 = sc.nextInt();
	    
	    System.out.println("diferença absoluta deles: "+ (numero1 - numero2));
	}
}