import java.util.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Parque p1 = new Parque();
        //Parque p2 = new Parque(p1);
        Lugar l1 = new Lugar("AE13EF", "Gonçalo", 50, true);
        Lugar l2 = new Lugar("15CZ30", "Quim", 30, false);
        Lugar l3 = new Lugar("65EQ32", "Zé", 40, false);
        Map<String, Lugar> m = new HashMap<String, Lugar>();
        m.put(l1.getMatricula(), l1);
        m.put(l2.getMatricula(), l2);
        m.put(l3.getMatricula(), l3);
        p1.setNomeParque("Parque da UM");
        p1.setLugares(m);
        Parque p2 = new Parque(p1);
        Lugar l4 = new Lugar("87HF12", "Manel", 20, true);
        p2.novoEstacionamento(l4);
        p1.removeLugar("15CZ30");
        p1.alteraTempoDisponivel("AE13EF", 60);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.getMatriculasParque().toString());
        System.out.println(p1.existeMatriculaNoParque("15CZ30"));
        System.out.println(p2.tempoMaiorQue(20).toString());

        if(p1.equals(p2)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais.");
        }
    }
}
