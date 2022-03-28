import java.time.LocalDateTime;

public class PedidodeSuporte {

    private String client;
    private LocalDateTime submitMoment;
    private String topic;
    private String description;
    private String worker;
    private LocalDateTime treatmentOver;
    private String infoToClient;
    private boolean state;

    /**
     * Construtor por omissão.
     */
    public PedidodeSuporte(){
        this.client = "NONE";
        this.submitMoment = LocalDateTime.now();
        this.topic = "NONE";
        this.description = "NONE";
        this.worker = "NONE";
        this.treatmentOver = LocalDateTime.now();
        this.infoToClient = "NONE";
        this.state = false;
    }

    /**
     * Construtor parametrizado de PedidodeSuporte.
     * @param client
     * @param time
     * @param topic
     * @param description
     * @param worker
     * @param finish
     * @param info
     */
    public PedidodeSuporte(String client, LocalDateTime time, String topic, String description, String worker, LocalDateTime finish, String info, boolean state){
        this.client = client;
        this.submitMoment = time;
        this.topic = topic;
        this.description = description;
        this.worker = worker;
        this.treatmentOver = finish;
        this.infoToClient = info;
        this.state = state;
    }

    /**
     * Construtor de cópia de PedidodeSuporte.
     * @param p
     */
    public PedidodeSuporte(PedidodeSuporte p){
        this.client = p.getClient();
        this.submitMoment = p.getSubmitMoment();
        this.topic = p.getTopic();
        this.description = p.getDescription();
        this.worker = p.getWorker();
        this.treatmentOver = p.getTreatmentOver();
        this.infoToClient = p.getInfoToClient();
        this.state = p.getState();
    }

    /**
     * Método que altera o nome do cliente.
     * @param client
     */
    public void setClient(String client){
        this.client = client;
    }

    /**
     * Método que devolve o nome do cliente.
     * @return
     */
    public String getClient(){
        return this.client;
    }

    /**
     * Método que altera o momento de submissão do pedido.
     * @param time
     */
    public void setSubmitMoment(LocalDateTime time){
        this.submitMoment = time;
    }

    /**
     * Método que devolve o momento em que o pedido foi submetido.
     * @return
     */
    public LocalDateTime getSubmitMoment(){
        return this.submitMoment;
    }

    /**
     * Método que altera o assunto do pedido.
     * @param topic
     */
    public void setTopic(String topic){
        this.topic = topic;
    }

    /**
     * Método que devolve o assunto do pedido.
     * @return
     */
    public String getTopic(){
        return this.topic;
    }

    /**
     * Método que altera a descrição do pedido.
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Método que devolve a descrição do produto.
     * @return
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Método que altera o nome da pessoa que tratou do pedido.
     * @param worker
     */
    public void setWorker(String worker){
        this.worker = worker;
    }

    /**
     * Método que devolve o nome da pessoa que tratou do pedido.
     * @return
     */
    public String getWorker(){
        return this.worker;
    }

    /**
     * Método que altera o momento em que o tratamento do pedido foi concluído.
     * @param time
     */
    public void setTreatmentOver(LocalDateTime time){
        this.treatmentOver = time;
    }

    /**
     * Método que devolve o momento em que o tratamento do pedido foi concluído.
     * @return
     */
    public LocalDateTime getTreatmentOver() {
        return this.treatmentOver;
    }

    /**
     * Método que altera a informação sobre o pedido.
     * @param info
     */
    public void setInfoToClient(String info){
        this.infoToClient = info;
    }

    /**
     * Método que devolve a informação sobre o pedido.
     * @return
     */
    public String getInfoToClient(){
        return this.infoToClient;
    }

    /**
     * Método que altera o estado do pedido.
     * @param state
     */
    public void setState(boolean state){
        this.state = state;
    }

    /**
     * Método que devolve o estado do pedido.
     * @return
     */
    public boolean getState(){
        return this.state;
    }

    /**
     * Método que devolve o Pedido de Suporte em formato de texto.
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.client);
        sb.append(", ");
        sb.append(this.submitMoment.toString());
        sb.append(", ");
        sb.append(this.topic);
        sb.append(", ");
        sb.append(this.description);
        sb.append(", ");
        sb.append(this.worker);
        sb.append(", ");
        sb.append(this.treatmentOver.toString());
        sb.append(", ");
        sb.append(this.infoToClient);
        sb.append(", ");
        sb.append(this.state);
        sb.append("]\n");

        return sb.toString();
    }

    /**
     * Método que averigua a igualdade entre o Pedido de Suporte e um outro objeto.
     * @param obj
     * @return
     */
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        PedidodeSuporte p = (PedidodeSuporte) obj;
        return (this.client.equals(p.getClient()) &&
                this.submitMoment.equals(p.getSubmitMoment()) &&
                this.topic.equals(p.getTopic()) &&
                this.description.equals(p.getDescription()) &&
                this.submitMoment.equals(p.getTreatmentOver()) &&
                this.worker.equals(p.getWorker()) &&
                this.infoToClient.equals(p.getInfoToClient()) &&
                this.state == p.getState());
    }

    /**
     * Método que devolve uma cópia do Pedido de Suporte.
     * @return
     */
    public PedidodeSuporte clone(){
        return new PedidodeSuporte(this);
    }
}
