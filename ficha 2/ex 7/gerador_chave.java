import java.util.Random;


public class gerador_chave {

    public int[] geraNums(){
        int[] numeros = new int[5];
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            int temp = rand.nextInt(50)+1;
            numeros[i] = temp;
        }

        return numeros;
    }


    public int[] geraEstrelas(){
        int[] estrelas = new int[2];
        Random rand = new Random();
        for(int i = 0; i < 2; i++) {
            int temp = rand.nextInt(9) + 1;
            estrelas[i] = temp;
        }

        return estrelas;
    }


    public int comparaNums(int nums[], int chave_nums[]){
        int r = 0;
        for(int i = 0; i < 5; i++){
            if(chave_nums[i] == nums[i]){
                r++;
            }
        }
        return r;
    }


    public int comparaEstrelas(int estrelas[], int chave_estrelas[]){
        int r = 0;
        for(int i = 0; i < 2; i++){
            if(chave_estrelas[i] == estrelas[i]){
                r++;
            }
        }
        return r;
    }
}

