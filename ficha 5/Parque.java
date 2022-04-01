import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Parque {

    private String nomeParque;
    private Map<String, Lugar> lugares;

    public Parque(){
        this.nomeParque = "NONE";
        this.lugares = new HashMap<>();
    }

    public Parque(String nome, Map<String, Lugar> lugares){
        this();
        setNomeParque(nome);
        setLugares(lugares);
    }

    public Parque(Parque p){
        this();
        setNomeParque(p.getNomeParque());
        setLugares(p.getLugares());
    }

    public void setNomeParque(String nome){
        this.nomeParque = nome;
    }

    public String getNomeParque(){
        return this.nomeParque;
    }

    public void setLugares(Map<String, Lugar> parque){
        for(String l: parque.keySet()){
            Lugar a = parque.get(l);
            this.lugares.put(l, a.clone());
        }
    }

    public Map<String, Lugar> getLugares(){
        return this.lugares;
    }


    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        Parque p = (Parque) obj;
        return (this.nomeParque.equals(p.getNomeParque()) &&
                this.lugares.equals(p.getLugares()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Parque:\n");
        sb.append(this.nomeParque);
        sb.append("\n");
        sb.append(this.lugares.toString());
        sb.append("\n");
        return sb.toString();
    }

    public Parque clone(){
        return new Parque(this);
    }

    public List<String> getMatriculasParque(){
        List<String> ret = new ArrayList<String>();
        for(String s: lugares.keySet()){
            Lugar a = this.lugares.get(s);
            ret.add(a.clone().getMatricula());
        }
        return ret;
    }

    public void novoEstacionamento(Lugar lugar){
        this.lugares.putIfAbsent(lugar.getMatricula(), lugar.clone());
    }

    public void removeLugar(String matricula){
        this.lugares.remove(matricula);
    }

    public void alteraTempoDisponivel(String matricula, int tempo){
        if(this.lugares.get(matricula) != null){
            Lugar temp = this.lugares.get(matricula);
            temp.setMinutos(tempo);
        }
    }

    public boolean existeMatriculaNoParque(String matricula){
        if(this.lugares.get(matricula) != null){
            return true;
        }else{
            return false;
        }
    }

    public List<String> tempoMaiorQue(int x){
        List<String> ret = new ArrayList<String>();
        for(Lugar l: lugares.values()){
            Lugar lugar = l.clone();
            if(lugar.getMinutos() > x){
                ret.add(lugar.getMatricula());
            }
        }
        return ret;
    }
}
