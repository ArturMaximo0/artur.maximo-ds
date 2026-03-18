import java.util.Scanner;
public class exercicio4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da compra:");
	    double valor = sc.nextDouble();
	    
	    double valorFinal = valor + (valor * 0.05);
	    valorFinal = valorFinal + (valor * 0.07);
	    
	    System.out.println("Valor final: "+ valorFinal);
	    
	}
}