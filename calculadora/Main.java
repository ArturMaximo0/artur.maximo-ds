import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes calcular = new Operacoes();

        System.out.println ("Insira o primeiro número:");
        double n1 = sc.nextDouble();
        
        System.out.println("Escolha a operação desejada.(1-ADIÇÃO 2-SUBTRAÇÃO 3-DIVISÃO 4-MULTIPLICAÇÃO)");
        int opcao = sc.nextInt();
        
        System.out.println ("Insira o segundo número:");
        double n2 = sc.nextDouble();

        

         switch(opcao){
            case 1:
                calcular.setPrimeiroNumero(n1);
                calcular.setSegundoNumero(n2);
                calcular.adicao();
                System.out.println("Resultado: "+ calcular.getResultado());
                break;
            case 2:
                calcular.setPrimeiroNumero(n1);
                calcular.setSegundoNumero(n2);
                calcular.subtracao();
                System.out.println("Resultado: "+ calcular.getResultado());
                break;
            case 3:
                calcular.setPrimeiroNumero(n1);
                calcular.setSegundoNumero(n2);
                calcular.divisao();
                System.out.println("Resultado: "+ calcular.getResultado());
                break;
            case 4:
                calcular.setPrimeiroNumero(n1);
                calcular.setSegundoNumero(n2);
                calcular.multiplicacao();
                System.out.println("Resultado: "+ calcular.getResultado());
                break;

            default:
                System.out.println("Erro! Opção incorreta.");
        }
	}
}