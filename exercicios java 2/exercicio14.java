import java.util.Scanner;
public class exercicio14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Nota 1:");
	    double nota1 = sc.nextDouble();
	    
	    System.out.println("Nota 2:");
	    double nota2 = sc.nextDouble();
	    
	    nota1 = (nota1 + nota2) / 2;
	    if (nota1 <= 6) {
	        System.out.println("Reprovado!");
	    }else{
	        System.out.println("Aprovado!");
	    }
	}
}