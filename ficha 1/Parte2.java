public class Parte2 {
    
    public double celsiusParaFarenheit(double graus){
        
        double farenheit = (graus * 1.8) + 32;
        return farenheit;
    }

    public int maximoNumeros(int a, int b){
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }

    public String criaDescricaoConta(String nome, double saldo){
        return ("Nome: " + nome + ", Saldo: " + saldo);
    }
}

