import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor em reais:");
        double real = sc.nextDouble();
        
        System.out.println("Cotação do dólar:");
        double dolar = sc.nextDouble();
        
        System.out.println("Poderia comprar "+ (real / dolar) +" dolares");
    }
}