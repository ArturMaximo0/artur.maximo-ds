import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira palavra:");
        String palavra1 = sc.next();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = sc.next();
        System.out.println("Digite a terceira palavra:");
        String palavra3 = sc.next();
        
        String maior;

        if (palavra1.length() >= palavra2.length() && palavra1.length() >= palavra3.length()) {
            maior = palavra1;
        } else if (palavra2.length() >= palavra1.length() && palavra2.length() >= palavra3.length()) {
            maior = palavra2;
        } else {
            maior = palavra3;
        }
        
        System.out.println("A maior palavra é: " + maior);
    }
}
