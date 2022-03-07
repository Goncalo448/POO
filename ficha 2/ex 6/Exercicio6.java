import java.util.Scanner;


public class Exercicio6 {
    
    public void leMatriz(int arr[][], int size){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
    }


    public int[][] somaMatrizes(int m1[][], int m2[][], int size){
        int retMatriz[][] = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                retMatriz[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return retMatriz;
    }


    public int matrizesIguais(int m1[][], int m2[][]){
        int size = m1.length;
        int flag = 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(m1[i][j] != m2[i][j]){
                    flag = 0;
                    System.out.println("Não são iguais.");
                    return flag;
                }
            }
        }
    
        System.out.println("São iguais.");
        return flag;
    }
}