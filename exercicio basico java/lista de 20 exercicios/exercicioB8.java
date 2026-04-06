import java.util.Scanner;
public class exercicioB8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int senha = 3140;
	    
	    System.out.println("Digte a senha(somente números):");
	    int senhaT = sc.nextInt();
	    
	    if (senhaT == senha){
	        System.out.println("Senha correta!");
	    }else{
	        System.out.println("Senha incorreta!");
	    }
	}
}