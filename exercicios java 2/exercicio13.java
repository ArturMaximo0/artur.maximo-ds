import java.util.Scanner;
public class exercicio13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite sua altura (em cm exemplo: 190):");
	    double altura = sc.nextDouble() / 100;
	    
	    System.out.println("Digite seu peso (em kgs arredondado exemplo: 60):");
	    double peso = sc.nextDouble();
	    
	    double imc = peso / (altura * altura);
	    System.out.println(imc);
	    if (imc <= 18.5){
	        System.out.println("Abaixo do peso!");
	    }
	    else if (18.6 <= imc && imc <= 24.9){
	        System.out.println("Peso normal!");
	    }else{
	        System.out.println("Acima do peso!");
	    }
	    
	}
}