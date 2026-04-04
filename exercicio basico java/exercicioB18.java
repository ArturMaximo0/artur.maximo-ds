import java.util.Scanner;
public class exercicioB18
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a nota 1:");
	    double nota1 = sc.nextDouble();
	    
	    System.out.println("Digite a nota 2:");
	    double nota2 = sc.nextDouble();
	    
	    double media = (nota1 + nota2) / 2;
	    
	    if (media > 5){
	        System.out.println("aprovado");
	    }else{
	        System.out.println("Reprovado!");
	    }
	}
}