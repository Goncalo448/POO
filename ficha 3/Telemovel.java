import java.util.*;

public class Telemovel {

    private String marca;
    private String modelo;
    private int displayX;
    private int displayY;
    private int numMensagens;
    private int capacidadeMsg;
    private int capacidadeFotos;
    private int capacidadeApps;
    private int capacidadeFotosApps;
    private int espaçoOcupado;
    private int nFotos;
    private int nApps;
    private ArrayList<String> nomesApps;
    private ArrayList<String> mensagens;
    private int capacidadeTotal;

    /**
     * Construtor por omissão de Telemovel.
     */
    public Telemovel(){
        this.marca = "None";
        this.modelo = "None";
        this.displayX = 0;
        this.displayY = 0;
        this.capacidadeMsg = 0;
        this.numMensagens = 0;
        this.capacidadeFotos = 0;
        this.capacidadeApps = 0;
        this.capacidadeFotosApps = 0;
        this.espaçoOcupado = 0;
        this.nFotos = 0;
        this.nApps = 0;
        this.nomesApps = new ArrayList<>(nApps);
        this.mensagens = new ArrayList<>(capacidadeMsg);
        this.capacidadeTotal = 0;
    }

    /**
     * Construtor parametrizado de Telemovel.
     */
    public Telemovel(String marca, String modelo, int dx, int dy, int capMsg, int numMsg, int capFotos, int capApps, int capFotosApps, int numFotos, int numApps, ArrayList<String> mensagens, ArrayList<String> nomesApps, int espaçoUsado, int capacidadeTotal){
        this.marca = marca;
        this.modelo = modelo;
        this.displayX = dx;
        this.displayY = dy;
        this.numMensagens = numMsg;
        this.capacidadeMsg = capMsg;
        this.capacidadeFotos = capFotos;
        this.capacidadeApps = capApps;
        this.capacidadeFotosApps = capFotosApps;
        this.nFotos = numFotos;
        this.nApps = numApps;
        this.nomesApps = new ArrayList<>(numApps);
        this.mensagens = new ArrayList<>(numMensagens);
        this.espaçoOcupado = espaçoUsado;
        this.capacidadeTotal = capacidadeTotal;
    }

    /**
     * Construtor de cópia de Telemovel.
     */
    public Telemovel(Telemovel t){
        this.marca = t.getMarca();
        this.modelo = t.getModelo();
        this.displayX = t.getDisplayX();
        this.displayY = t.getDisplayY();
        this.numMensagens = t.getNumMensagens();
        this.capacidadeMsg = t.getCapacidadeMsg();
        this.capacidadeFotos = t.getCapacidadeFotos();
        this.capacidadeApps = t.getCapacidadeApps();
        this.capacidadeFotosApps = t.getCapacidadeFotosApps();
        this.nFotos = t.getNumFotos();
        this.nApps = t.getNumApps();
        this.nomesApps = t.getNomesApps();
        this.mensagens = new ArrayList<>(t.getMenssagens().size());
        this.espaçoOcupado = t.getEspaçoOcupado();
        this.capacidadeTotal = t.getCapacidadeTotal();
    }

    /**
     * Método que devolve a marca do telemóvel.
     * @return marca do telemóvel.
     */
    public String getMarca(){
        return this.marca;
    }

    /**
     * Método que devolve o modelo do telemóvel.
     * @return modelo do telemóvel.
     */
    public String getModelo(){
        return this.modelo;
    }

    /**
     * Método que devolve o número de pixeis do telemóvel na horizontal.
     * @return coordenada x do display do telemóvel.
     */
    public int getDisplayX(){
        return this.displayX;
    }

    /**
     * Método que devolve o número de pixeis do telemóvel na vertical.
     * @return coordenada y do display do telemóvel.
     */
    public int getDisplayY(){
        return this.displayY;
    }

    /**
     * Método que devolve a capacidade para as mensagens.
     * @return capacidade para as mensagens de texto.
     */
    public int getCapacidadeMsg(){
        return this.capacidadeMsg;
    }

    /**
     * Método que devolve o número de mensagens
     * @return número de mensagens.
     */
    public int getNumMensagens(){
        return this.numMensagens;
    }

    /**
     * Método que devolve a capacidade para fotos.
     * @return capacidade para fotos.
     */
    public int getCapacidadeFotos(){
        return this.capacidadeFotos;
    }

    /**
     * Método que devolve a capacidade para aplicações.
     * @return capacidade para aplicações.
     */
    public int getCapacidadeApps(){
        return this.capacidadeApps;
    }

    /**
     * Método que devolve a capacidade para aplicações e fotos.
     * @return capacidade para aplicações e fotos.
     */
    public int getCapacidadeFotosApps(){
        return this.capacidadeFotos + this.capacidadeApps;
    }

    /**
     * Método que devolve o número de fotos.
     * @return número de fotos.
     */
    public int getNumFotos(){
        return this.nFotos;
    }

    /**
     * Método que devolve o número de aplicações.
     * @return número de aplicações.
     */
    public int getNumApps(){
        return this.nApps;
    }

    /**
     * Método que devolve o espaço total ocupado em bytes.
     * @return espaço ocupado.
     */
    public int getEspaçoOcupado(){
        return this.espaçoOcupado;
    }

    /**
     * Método que devolve os nomes das respetivas aplicações.
     * @return nomes das aplicações.
     */
    public ArrayList<String> getNomesApps(){
        return this.nomesApps;
    }

    /**
     * Métodp que devolve as mensagens.
     * @return mensagens.
     */
    public ArrayList<String> getMenssagens(){
        return this.mensagens;
    }

    public int getCapacidadeTotal(){
        return this.capacidadeTotal;
    }

    /**
     * Método que altera a marca do telemóvel.
     * @param m nova marca do telemóvel.
     */
    public void setMarca(String m){
        this.marca = m;
    }

    /**
     * Método que altera o modelo do telemóvel.
     * @param m novo modelo do telemóvel.
     */
    public void setModelo(String m){
        this.modelo = m;
    }

    /**
     * Método que altera a dimensão horizontal do telemóvel.
     * @param x
     */
    public void setDisplayX(int x){
        this.displayX = x;
    }

    public void setDisplayY(int y){
        this.displayY = y;
    }

    public void setNumMensagens(int num){
        this.numMensagens = num;
    }

    public void setCapacidadeMsg(int cap){
        this.capacidadeMsg = cap;
    }

    public void setCapacidadeFotos(int cap){
        this.capacidadeFotos = cap;
    }

    public void setCapacidadeApps(int cap){
        this.capacidadeApps = cap;
    }

    public void setCapacidadeFotosApps(int cap){
        this.capacidadeFotosApps = cap;
    }

    public void setEspaçoOcupado(int espaço){
        this.espaçoOcupado = espaço;
    }

    public void setNumFotos(int num){
        this.nFotos = num;
    }

    public void setNumApps(int num){
        this.nApps = num;
    }

    public void setNomesApps(int numApps, ArrayList<String> apps){
        this.nApps = numApps;
        this.nomesApps = new ArrayList<>(numApps);
        this.nomesApps.addAll(apps);
    }

    public void setMensagens(int numMensagens, ArrayList<String> msg){
        this.numMensagens = numMensagens;
        this.mensagens = new ArrayList<>(numMensagens);
        this.mensagens.addAll(msg);
    }

    public void setCapacidadeTotal(int cap){
        this.capacidadeTotal = cap;
    }

    /**
     * Método que devolve a representação do telemóvel em formato de texto.
     * @return String com as características do telemóvel.
     */
    public String toString(){
        return "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "DisplayX: " + this.displayX + "\n" +
                "DisplayY: " + this.displayY + "\n" +
                "NumMensagens: " + this.numMensagens + "\n" +
                "CapacidadeMsg: " + this.capacidadeMsg + "\n" +
                "CapacidadeFotos: " + this.capacidadeFotos + "\n" +
                "CapacidadeApps: " + this.capacidadeApps + "\n" +
                "CapacidadeFotosApps: " + this.capacidadeFotosApps + "\n" +
                "Espaço Ocupado: " + this.espaçoOcupado + "\n" +
                "NumFotos: " + this.nFotos + "\n" +
                "NumApps: " + this.nApps + "\n" +
                "NomesApps: " + this.nomesApps + "\n" +
                "Mensagens: " + this.mensagens + "\n" +
                "Capacidade Total: " + this.capacidadeTotal + "\n";
    }

    /**
     * Método que averigua a igualdade entre dois telemóveis.
     * @param obj objeto que é comparado com o recetor da mensagem.
     * @return resultado booleano da comparação feita entre os objetos.
     */
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if((obj == null) || (this.getClass() != obj.getClass())){
            return false;
        }
        Telemovel t = (Telemovel) obj;
        return (this.marca == t.getMarca() && this.modelo == t.getModelo() &&
                this.displayX == t.getDisplayX() && this.displayY == t.getDisplayY() &&
                this.numMensagens == t.getNumMensagens() && this.capacidadeMsg == this.getCapacidadeMsg() &&
                this.capacidadeFotos == t.getCapacidadeFotos() && this.capacidadeApps == t.getCapacidadeApps() &&
                this.capacidadeFotosApps == t.getCapacidadeFotosApps() &&
                this.espaçoOcupado == t.getEspaçoOcupado() && this.nFotos == t.getNumFotos() &&
                this.nApps == t.getNumApps() && this.nomesApps.equals(t.getNomesApps()) &&
                this.mensagens.equals(t.getMenssagens()));
    }

    /**
     * Método que cria uma cópia do telémovel recetor da mensagem.
     * @return cópia do telemóvel original.
     */
    public Telemovel clone(){
        return new Telemovel(this);
    }

    /**
     * Método que verifica se ainda existe espaço disponível no telemóvel.
     * @param numeroBytes tamanho em bytes do arquivo que se pretende armazenar.
     * @return booleano que indica se é possível armazenar o arquivo.
     */
    public boolean existeEspaço(int numeroBytes){
        int espaçoLivre = this.capacidadeFotosApps - this.espaçoOcupado;
        if(numeroBytes <= espaçoLivre){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que instala uma nova aplicação no telemóvel.
     * @param nome nome da aplicação.
     * @param tamanho espaço que aplicação ocupa.
     */
    public void instalaApp(String nome, int tamanho){
        if(existeEspaço(tamanho)){
            this.nApps++;
            this.nomesApps.add(nome);
            this.espaçoOcupado += tamanho;
            this.capacidadeApps += tamanho;
        }else{
            System.out.println("Não existe espaço para instalar essa aplicação.");
        }
    }

    public void recebeMsg(String msg){
        if(existeEspaço(msg.length())){
            this.espaçoOcupado += msg.length();
            this.mensagens.add(msg);
            this.numMensagens++;
            this.capacidadeMsg += msg.length();
        }
    }

    /**
     * Método que calcula o tamanho médio de cada app.
     * @return tamanho médio de uma app.
     */
    public double tamMedioApps(){
        return (double) (this.capacidadeApps / this.nApps);
    }

    /**
     * Método que devolve a maior mensagem.
     * @return maior mensagem.
     */
    public String maiorMsg(){
        String r = "";
        int max = 0;
        for(int i = 0; i < this.numMensagens; i++){
            if(max < this.mensagens.get(i).length()){
                max = this.mensagens.get(i).length();
                r = this.mensagens.get(i);
            }
        }
        return r;
    }

    /**
     * Método que desinstala uma aplicação.
     * @param nome nome da aplicação.
     * @param tamanho espaço que ocupa.
     */
    public void removeApp(String nome, int tamanho){
        for(int i = 0; i < this.nApps; i++){
            if(nome.equals(this.nomesApps.get(i))){
                this.nomesApps.remove(i);
                this.nApps--;
                this.capacidadeApps -= tamanho;
                this.espaçoOcupado -= tamanho;
                System.out.println("Aplicação removida com sucesso!");
                break;
            }
        }
    }
}
