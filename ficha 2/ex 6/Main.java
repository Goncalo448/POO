public class Main {
    
    public static void main(String[] args){

        Exercicio6 obj = new Exercicio6();
        int n = 5;
        int m1[][] = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}};

        int m2[][] = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}};

        int x = obj.matrizesIguais(m1, m2);
        System.out.println(x);        
    }
}
