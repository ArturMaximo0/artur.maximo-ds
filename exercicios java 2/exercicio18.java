import java.util.Scanner;
public class exercicio18
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a qauntidade de segundos: ");
	    int segundos = sc.nextInt();
	    
	    int horas = segundos / 3600;
	    int minutos = (segundos % 3600) / 60;
	    segundos = segundos % 60;
	    
	    System.out.println("horas: "+ horas +" minutos: "+ minutos +" segundos: "+ segundos);
	}
}