import java.util.Scanner;
public class exercicio17
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    int numero1 = sc.nextInt();
	    
	    System.out.println("Digite o segundo número:");
	    int numero2 = sc.nextInt();
	    
	    if(numero1 >= 0 && numero2 >= 0){
	        System.out.println("Soma: "+ (numero1 + numero2));
	    }else {
	        System.out.println("Valores invalidos!");
	    }
	}
}