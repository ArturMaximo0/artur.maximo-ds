import java.util.Scanner;
public class exercicio7
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a distância da viagem:");
	    double distancia = sc.nextDouble();
	    
	    System.out.println("Digite a velociadade média:");
	    double velociadadeMedia = sc.nextDouble();
	    
	    double tempo = distancia / velociadadeMedia;
	    
	    System.out.println("Tempo de viagem: "+ tempo + "H");
	}
}