public class Main {
    
    public static void main(String[] args){
        String[] strings = new String[5];
        strings[0] = "Tone";
        strings[1] = "Manel";
        strings[2] = "Berto";
        strings[3] = "Tone";
        strings[4] = "Neu";

        Exercicio5 obj = new Exercicio5();
        System.out.println(obj.contaOcorr(strings, "Tone"));
    }
}
