public class Lugar {

    private String matricula;
    private String nome;
    private int minutos;
    private boolean permanente;

    public Lugar(){
        this.matricula = "NONE";
        this.nome = "NONE";
        this.minutos = 0;
        this.permanente = false;
    }

    public Lugar(String matricula, String nome, int min, boolean permanente){
        this.matricula = matricula;
        this.nome = nome;
        this.minutos  = min;
        this.permanente = permanente;
    }

    public Lugar(Lugar l){
        this.matricula = l.getMatricula();
        this.nome = l.getNome();
        this.minutos = l.getMinutos();
        this.permanente = l.getPermanente();
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMinutos(int min){
        this.minutos = min;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public void setPermanente(boolean permanente){
        this.permanente = permanente;
    }

    public boolean getPermanente(){
        return this.permanente;
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        Lugar l = (Lugar) obj;
        return (this.matricula.equals(l.getMatricula()) &&
                this.nome.equals(l.getNome()) &&
                this.minutos == l.getMinutos() &&
                this.permanente == l.getPermanente());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lugar: [");
        sb.append(this.matricula);
        sb.append(", ");
        sb.append(this.nome);
        sb.append(", ");
        sb.append(this.minutos);
        sb.append(", ");
        sb.append(this.permanente);
        sb.append("]\n");
        return sb.toString();
    }

    public Lugar clone(){
        return new Lugar(this);
    }
}
