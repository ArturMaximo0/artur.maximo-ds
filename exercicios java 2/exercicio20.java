import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor da venda:");
        double valor = sc.nextDouble();
        
        double comissao;
        
        if (valor <= 1000){
            comissao = valor * 0.04;
        }
        else if (1000 < valor && valor <= 5000){
            comissao = valor * 0.06;
        }else{
            comissao = valor * 0.08;
        }
        System.out.println("comissão: R$"+ comissao);
    }
}
