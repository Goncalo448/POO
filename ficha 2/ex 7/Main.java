import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        gerador_chave obj = new gerador_chave();
        int numeros_chave[] = obj.geraNums();
        int estrelas_chave[] = obj.geraEstrelas();

        int[] numeros = new int[5];
        int[] estrelas = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Introduz a tua chave. ");
        for(int i = 0; i < 5; i++){
            System.out.print((i+1) + "º número: ");
            numeros[i] = input.nextInt();
            System.out.println();
        }

        for(int i = 0; i < 2; i++){
            System.out.print((i+1) + "º estrela: ");
            estrelas[i] = input.nextInt();
            System.out.println();
        }

        int num_certos = obj.comparaNums(numeros, numeros_chave);
        int estrelas_certas = obj.comparaEstrelas(estrelas, estrelas_chave);

        System.out.println("Acertaste " + num_certos + " números e " + estrelas_certas + " estrelas!");
    }
}
