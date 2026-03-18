import java.util.Scanner;
public class exercicio2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a hora: ");
	    int hora = sc.nextInt();
	    
	    System.out.println("Minutos: "+ hora * 60);
	}
}