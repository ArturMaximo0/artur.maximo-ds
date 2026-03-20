import java.util.Scanner;
public class exercicio15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da compra:");
	    double valor = sc.nextDouble();
	    
	    if (valor <= 50.0){
	        valor = valor - (valor * 0.05);
	    }
	    else if (50.1 <= valor && valor <= 100.0){
	        valor = valor - (valor * 0.10);
	    }else {
	        valor = valor - (valor * 0.15);
	    }
	    System.out.println("Valor final: R$"+ valor);
	}
}