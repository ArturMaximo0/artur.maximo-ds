import java.util.Scanner;
public class exercicio6
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o número:");
	    int numero = sc.nextInt();
	    
	    if ((numero % 2) == 0){
	        System.out.println("É par!");
	    }else {
	        System.out.println("É impar!");
	    }
	    
	    if ((numero % 5) == 0){
	        System.out.println("É divisivel por 5");
	    }else {
	        System.out.println("Não é divisivel por 5");
	    }
	}
}