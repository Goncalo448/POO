public class Main{

    public static void main(String[] args){

        FuncArrays obj = new FuncArrays();

        int[][] notasTurma = {{16,14,15,10,11},
                            {14,14,12,10,15},
                            {12,12,19,9,11},
                            {5,9,10,12,13},
                            {8,7,11,12,15}};
        int n = 5;

        int index = obj.ucIndMaiorMedia(notasTurma, n);
        System.out.println(index);
    }
}