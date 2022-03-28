import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Queue;
import java.util.List;

public class SistemadeSuporte {

    private List<PedidodeSuporte> queue;

    /**
     * Construtor por omissão.
     */
    public SistemadeSuporte(){
        this.queue = new ArrayList<PedidodeSuporte>();
    }

    /**
     * Construtor parametrizado de Sistema de Suporte.
     * @param q
     */
    public SistemadeSuporte(List<PedidodeSuporte> q){
        setQueue(q);
    }

    /**
     * Construtor de cópia de Sistema de Suporte.
     * @param s
     */
    public SistemadeSuporte(SistemadeSuporte s){
        this.queue = new ArrayList<PedidodeSuporte>();
        setQueue(s.getQueue());
    }

    /**
     * Método que devolve a lista de espera do Sistema de Suporte.
     * @return
     */
    public List<PedidodeSuporte> getQueue(){
        List<PedidodeSuporte> ret = new ArrayList<PedidodeSuporte>();
        Iterator<PedidodeSuporte> it = this.queue.iterator();

        while(it.hasNext()){
            ret.add(it.next().clone());
        }

        return ret;
    }

    /**
     * Método que altera a lista de espera do Sistema de Suporte.
     * @param q
     */
    public void setQueue(List<PedidodeSuporte> waitingList){
        Iterator<PedidodeSuporte> it = waitingList.iterator();
        this.queue = new ArrayList<PedidodeSuporte>();

        while(it.hasNext()){
            this.queue.add(it.next().clone());
        }
    }

    /**
     * Método que devolve o Sistema de Suporte descrito em formato de texto.
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de espera:\n");
        sb.append(this.queue.toString());
        return sb.toString();
    }

    /**
     * Método que adiciona um pedido ao Sistema de Suporte.
     * @param p
     */
    public void inserePedido(PedidodeSuporte p){
        this.queue.add(p.clone());
    }

    /**
     * Método que procura um pedido através do nome de quem o criou e o instante em que foi criado.
     * @param user
     * @param data
     * @return
     */
    public PedidodeSuporte procuraPedido(String user, LocalDateTime data){
        for(PedidodeSuporte p: queue){
            if(user.equals(p.getClient()) && data.equals(p.getSubmitMoment())){
                return p.clone();
            }
        }
        return null;
    }

    /**
     * Método que resolve um pedido de suporte.
     * @param pedido
     * @param tecnico
     * @param info
     */
    public void resolvePedido(PedidodeSuporte pedido, String tecnico, String info){
        for(PedidodeSuporte p: queue){
            if(pedido.equals(pedido)){
                p.setState(true);
                p.setWorker(tecnico);
                p.setInfoToClient(info);
                p.setTreatmentOver(LocalDateTime.now());
                break;
            }
        }
    }

    /**
     * Método que devolve os pedidos resolvidos.
     * @return
     */
    public List<PedidodeSuporte> resolvidos(){
        List<PedidodeSuporte> ret = new ArrayList<PedidodeSuporte>();
        Iterator<PedidodeSuporte> it = this.queue.iterator();

        while(it.hasNext()){
            PedidodeSuporte temp = new PedidodeSuporte(it.next().clone());
            if(temp.getState() == true){
                ret.add(temp.clone());
            }
        }

        return ret;
    }

    /**
     * Método que devolve o número de pedidos resolvidos por um determinado colaborador.
     * @param pedidos
     * @param colab
     * @return
     */
    public int colabOcorr(List<PedidodeSuporte> pedidos, String colab){
        int r = 0;
        for(PedidodeSuporte p: pedidos){
            if(colab.equals(p.getWorker()) && (p.getState() == true)){
                r += 1;
            }
        }

        return r;
    }

    /**
     * Método que determina o colaborador que resolveu mais pedidos.
     * @return
     */
    public String colaboradorTop(){
        int max = 0;
        int temp = 0;
        String colab = "";
        for(PedidodeSuporte p: queue){
            temp = colabOcorr(this.queue, p.getWorker());
            if(temp > max){
                max = temp;
                colab = p.getWorker();
            }
        }

        return colab;
    }

    /**
     * Método que devolve os pedidos resolvidos num determinado período de tempo.
     * @param inicio
     * @param fim
     * @return
     */
    public List<PedidodeSuporte> resolvidos(LocalDateTime inicio, LocalDateTime fim){
        List<PedidodeSuporte> ret = new ArrayList<PedidodeSuporte>();
        for(PedidodeSuporte p: queue){
            if(p.getState() == true){
                if(p.getTreatmentOver().isAfter(inicio) && p.getTreatmentOver().isBefore(fim)){
                    ret.add(p.clone());
                }
            }
        }

        return ret;
    }
}
