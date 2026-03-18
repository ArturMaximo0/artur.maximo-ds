import java.util.Scanner;
public class exercicio3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Nota 1: ");
	    double nota1 = sc.nextDouble();
	    
	    System.out.println("peso 1: ");
	    double peso1 = sc.nextDouble();
	    
	    System.out.println("Nota 2: ");
	    double nota2 = sc.nextDouble();
	    
	    System.out.println("peso 2: ");
	    double peso2 = sc.nextDouble();
	    
	    System.out.println("Nota 3: ");
	    double nota3 = sc.nextDouble();
	    
	    System.out.println("peso 3: ");
	    double peso3 = sc.nextDouble();
	    
	    double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
	    
	    System.out.println("media ponderada: "+ media);
	}
}