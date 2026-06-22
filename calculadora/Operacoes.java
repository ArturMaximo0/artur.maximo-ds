public class Operacoes {

        
    private double n1;
    private double n2;
    private double resultado;

    public void setPrimeiroNumero(double n1){
        this.n1 = n1;
    }
    public void setSegundoNumero(double n2){
        this.n2 = n2;
    }
    
    public double getPrimeiroNumero(){
        return n1;
    }
    public double getSegundoNumero(){
        return n2;
    }
    public double getResultado(){
        return resultado;
    }



    public void adicao(){
        resultado = n1 + n2;
    }
    public void subtracao(){
        resultado = n1 - n2;
    }
    public void multiplicacao(){
        resultado = n1 * n2;
    }
    public void divisao(){
        if(n2==0){
            System.out.println("Erro! Divisão por 0");
        }
        else{
            resultado = n1 / n2;
        }
    }
}
