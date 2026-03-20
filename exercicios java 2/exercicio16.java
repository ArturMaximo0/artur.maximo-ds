import java.util.Scanner;
public class exercicio16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o número:");
	    double numero = sc.nextDouble();
	    
	    if (10 <= numero && numero <= 50){
	        System.out.println("Está presente no intevalo!");
	    }else{
	        System.out.println("Não está presente no intervalo!");
	    }
	}
}