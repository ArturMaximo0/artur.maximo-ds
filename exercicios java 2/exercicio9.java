import java.util.Scanner;
public class exercicio9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite seu salário:");
	    double salario = sc.nextDouble();
	    
	    if (salario <= 2000){
	        salario = salario - (salario * 0.08);
	    }
	    else if (2000 < salario && salario < 3000){
	        salario = salario - (salario * 0.09);
	    }
	    else{
	        salario = salario - (salario * 0.11);
	    }
	    System.out.println("Salário final: "+ salario);
	}
}