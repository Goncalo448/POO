import java.time.LocalDate;
import java.util.Arrays;

public class Encomenda {

    private String nome;
    private int nif;
    private String morada;
    private int numeroEncomenda;
    private LocalDate dataEncomenda;
    private LinhaDeEncomenda[] linhasEncomenda;


    /**
     * Construtor por omissão de Encomenda.
     */
    public Encomenda(){
        this.nome = "None";
        this.nif = 0;
        this.morada = "None";
        this.numeroEncomenda = 0;
        this.dataEncomenda = LocalDate.now();
        this.linhasEncomenda = new LinhaDeEncomenda[5];
    }

    /**
     * Construtor parametrizado de Encomenda.
     * @param nome
     * @param nif
     * @param morada
     * @param num
     * @param data
     * @param linhas
     */
    public Encomenda(String nome, int nif, String morada, int num, LocalDate data, LinhaDeEncomenda[] linhas){
        setNome(nome);
        setNif(nif);
        setMorada(morada);
        setNumeroEncomenda(num);
        setDataEncomenda(data);
        setLinhasEncomenda(linhas);
    }

    /**
     * Construtor de cópia de Encomenda.
     * @param e
     */
    public Encomenda(Encomenda e){
        setNome(e.getNome());
        setNif(e.getNif());
        setMorada(e.getMorada());
        setNumeroEncomenda(e.getNumeroEncomenda());
        setDataEncomenda(e.getDataEncomenda());
        setLinhasEncomenda(e.getLinhasEncomenda());
    }

    /**
     * Método que devolve o nome do cliente.
     * @return
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Método que altera o nome do cliente.
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Método que devolve o número fiscal do cliente.
     * @return
     */
    public int getNif(){
        return this.nif;
    }

    /**
     * Método que altera o número fiscal do cliente.
     * @param nif
     */
    public void setNif(int nif){
        this.nif = nif;
    }

    /**
     * Método que devolve a morada do cliente.
     * @return
     */
    public String getMorada(){
        return this.morada;
    }

    /**
     * Método que altera a morada do cliente.
     * @param morada
     */
    public void setMorada(String morada){
        this.morada = morada;
    }

    /**
     * Método que devolve o número da encomenda.
     * @return
     */
    public int getNumeroEncomenda(){
        return this.numeroEncomenda;
    }

    /**
     * Método que altera o número da encomenda.
     * @param numero
     */
    public void setNumeroEncomenda(int numero){
        this.numeroEncomenda = numero;
    }

    /**
     * Método que devolve a data da encomenda.
     * @return
     */
    public LocalDate getDataEncomenda(){
        return this.dataEncomenda;
    }

    /**
     * Método que altera a data da encomenda.
     * @param data
     */
    public void setDataEncomenda(LocalDate data){
        this.dataEncomenda = data;
    }

    /**
     * Método que devolve as linhas da encomenda.
     * @return
     */
    public LinhaDeEncomenda[] getLinhasEncomenda(){
        return this.linhasEncomenda;
    }

    /**
     * Método que altera as linhas da encomenda.
     * @param encomendas
     */
    public void setLinhasEncomenda(LinhaDeEncomenda[] encomendas){
        this.linhasEncomenda = new LinhaDeEncomenda[5];
        for(int i = 0; i < 5; i++){
            this.linhasEncomenda[i] = encomendas[i];
        }
    }

    /**
     * Método que representa a Encomenda em formato de texto.
     * @return
     */
    public String toString(){
        return ("Nome do cliente: " + this.nome + "\n" +
                "Número fiscal: " + this.nif + "\n" +
                "Morada: " + this.morada + "\n" +
                "Número da encomenda: " + this.numeroEncomenda + "\n" +
                "Data da encomenda: " + this.dataEncomenda + "\n" +
                "Linhas da encomenda: " + Arrays.toString(this.linhasEncomenda) + "\n");
    }

    /**
     * Método que averigua a igualdade entre a encomenda e um objeto.
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
        Encomenda e = (Encomenda) obj;
        return (this.nome.equals(e.getNome()) &&
                this.nif == e.getNif() &&
                this.morada.equals(e.getMorada()) &&
                this.numeroEncomenda == e.getNumeroEncomenda() &&
                this.dataEncomenda.equals(e.getDataEncomenda()) &&
                this.linhasEncomenda.equals(e.getLinhasEncomenda()));
    }

    /**
     * Método que calcula o valor total da encomenda.
     * @return
     */
    public double calculaValorTotal(){
        int i = 0;
        double valorTotal = 0;
        while(this.linhasEncomenda[i] != null){
            LinhaDeEncomenda temp = new LinhaDeEncomenda(this.linhasEncomenda[i]);
            valorTotal += temp.calculaValorLinhaEnc();
            i++;
        }
        return valorTotal;
    }

    /**
     * Método que devolve o valor total dos descontos obtidos nos diversos produtos da encomenda.
     * @return
     */
    public double calculaValorDesconto(){
        int i = 0;
        double valorFinal = 0;
        while(this.linhasEncomenda[i] != null){
            LinhaDeEncomenda temp = new LinhaDeEncomenda(this.linhasEncomenda[i]);
            valorFinal += temp.calculaValorDesconto();
            i++;
        }
        return valorFinal;
    }

    /**
     * Método que calcula o número total de produtos da encomenda.
     * @return
     */
    public int numeroTotalProdutos(){
        int i = 0;
        int produtos = 0;
        while(this.linhasEncomenda[i] != null){
            produtos += this.linhasEncomenda[i].getAmount();
            i++;
        }
        return produtos;
    }

    /**
     * Método que verifica se um dado produto foi encomendado através da sua referência.
     * @param refProduto
     * @return
     */
    public boolean existeProdutoEncomenda(String refProduto){
        int i = 0;
        while(this.linhasEncomenda[i] != null){
            if(this.linhasEncomenda[i].getReference().equals(refProduto)){
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Método que adiciona uma nova linha de encomenda.
     * @param linha
     */
    public void adicionaLinha(LinhaDeEncomenda linha){
        int i = 0;
        while(this.linhasEncomenda[i] != null){
            i++;
        }
        this.linhasEncomenda[i] = linha;
    }

    /**
     * Método que remove uma linha de encomenda através da referência do produto.
     * @param refProd
     */
    public void removeProduto(String refProd){
        int i = 0;
        int size = this.linhasEncomenda.length;
        while(this.linhasEncomenda[i] != null){
            if(this.linhasEncomenda[i].getReference().equals(refProd)){
                for(int j = i; j < size-1; j++){
                    this.linhasEncomenda[j] = this.linhasEncomenda[j+1];
                }
                break;
            }
            i++;
        }
    }
}
