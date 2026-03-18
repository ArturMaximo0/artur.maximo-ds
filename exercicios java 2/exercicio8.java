import java.util.Scanner;
public class exercicio8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite seu salário:");
	    double salario = sc.nextDouble();
	    
	    System.out.println("Digite o valor da parcela: ");
	    double parcela = sc.nextDouble();
	    
	    if(parcela <= (salario * 0.30)){
	        System.out.println("Empréstimo aprovado!");
	    }else{
	        System.out.println("Empréstimo negado!");
	    }
	}
}