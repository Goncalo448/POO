public class Exercicio5 {
    
    public String maiorStr(String str[], int size){
        int len = 0;
        String ret = "";
        for(int i = 0; i < size; i++){
            if(str[i].length() >= len){
                len = str[i].length();
                ret = str[i];
            }
        }
        return ret;
    }


    public int contaOcorr(String arr[], String str){
        int cont = 0;
        int size = arr.length;

        for(int i = 0; i < size; i++){
            if(arr[i] == str){
                cont++;
            }
        }
        return cont;
    }
}
