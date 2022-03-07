import java.util.Arrays;


public class FuncArrays{

    public int minimo(int arr[], int size){
        int min = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    
    public int[] arrayEntre2Ind(int arr[], int a, int b){
        int[] finalArr = new int[b-a];
        int i = 0;
        while(a != b){
            finalArr[i] = arr[a];
            a++;
            i++;
        }
        return finalArr;
    }


    public int[] arrayDeComuns(int arr1[], int arr2[], int size){
        int[] newArr = new int[size];
        int k = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr1[i] == arr2[j]){
                    if(Arrays.binarySearch(newArr, arr1[i]) < 0){
                        newArr[k] = arr1[i];
                        k++;
                    }
                }
            }
        }

        return newArr;
    }


    public int somaNotasUC(int[][] arr, int uc, int size){
        int soma = 0; 
        for(int j = 0; j < size; j++){
            soma += arr[j][uc]; 
        }
        return soma;
    }


    public float mediaAluno(int[][] arr, int aluno_index, int size){
        int soma = 0;
        for(int j = 0; j < size; j++){
            soma += arr[aluno_index][j];
        }

        return (soma/5);
    }


    public float mediaUC(int[][] arr, int uc_index, int size){
        float soma = 0;
        for(int i = 0; i < size; i++){
            soma += arr[i][uc_index];
        }

        return (soma/5);
    }


    public int notaMax(int[][] arr, int size){
        int max = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }


    public int notaMin(int[][] arr, int size){
        int min = arr[0][0];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    
    public int[] notasAcimaDeX(int[][] arr, int ref, int size){
        int k = 0;
        int[] newArr = new int[size*size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr[i][j] > ref){
                    newArr[k] = arr[i][j];
                    k++;
                }
            }
        }
        return newArr;
    }


    public String stringNotasTurma(int[][] arr, int size){
        String str = "";
        for(int i = 0; i < size; i++){
            str += "Aluno " + i + ": ";
            for(int j = 0; j < size; j++){
                str += "UC " + j + " - " + arr[i][j] + "; ";
            }
            str += "\n";
        }

        return str;
    }


    public int ucIndMaiorMedia(int[][] arr, int size){
        int index = -1;
        float media = 0;
        float temp;
        for(int j = 0; j < size; j++){
            temp = 0;
            for(int i = 0; i < size; i++){
                temp += arr[i][j];
            }

            if((temp/5) > media){
                media = temp/5;
                index = j;
            }
        }
        return index;
    }
}