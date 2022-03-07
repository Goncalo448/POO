import java.util.Scanner;

public class TestePrograma {
    
    public static void main(String[] args){
        
        Parte2 f = new Parte2();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Escreve dois nº: ");
        
        /*double grausC = input.nextDouble();
        double grausF = f.celsiusParaFarenheit(grausC);
        System.out.println(grausF + "ºF");*/

        /*int a = input.nextInt();
        int b = input.nextInt();
        int c = f.maximoNumeros(a, b);*/

        String nome = input.nextLine();
        Double saldo = input.nextDouble();
        System.out.println(f.criaDescricaoConta(nome, saldo));
    }
}

