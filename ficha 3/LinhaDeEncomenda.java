public class LinhaDeEncomenda {

    private String reference;
    private String description;
    private int priceWithoutTaxes;
    private int amount;
    private double tax;
    private double discount;

    /**
     * Construtor por omissão de LinhaDeEncomenda.
     */
    public LinhaDeEncomenda(){
        this.reference = "None";
        this.description = "None";
        this.priceWithoutTaxes = 0;
        this.amount = 0;
        this.tax = 0;
        this.discount = 0;
    }

    /**
     * Construtor parametrizado de LinhaDeEncomenda.
     * @param ref
     * @param descrip
     * @param price
     * @param amount
     * @param tax
     * @param discount
     */
    public LinhaDeEncomenda(String ref, String descrip, int price, int amount, double tax, int discount){
        this.reference = ref;
        this.description = descrip;
        this.priceWithoutTaxes = price;
        this.amount = amount;
        this.tax = tax;
        this.discount = discount;
    }

    /**
     * Construtor de cópia de LinhaDeEncomenda.
     * @param encomenda
     */
    public LinhaDeEncomenda(LinhaDeEncomenda encomenda){
        this.reference = encomenda.getReference();
        this.description = encomenda.getDescription();
        this.priceWithoutTaxes = encomenda.getPriceWithoutTaxes();
        this.amount = encomenda.getAmount();
        this.tax = encomenda.getTax();
        this.discount = encomenda.getDiscount();
    }

    /**
     * Método que devolve a referência do produto.
     * @return referência do produto.
     */
    public String getReference(){
        return this.reference;
    }

    /**
     * Método que altera a referência do produto
     * @param ref referência do produto.
     */
    public void setReference(String ref){
        this.reference = ref;
    }

    /**
     * Método que devolve a descrição do produto.
     * @return descrição do produto.
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Método que altera a descrição do produto.
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Método que devolve o preço sem impostos do produto.
     * @return
     */
    public int getPriceWithoutTaxes(){
        return this.priceWithoutTaxes;
    }

    /**
     * Método que altera o preço do produto antes de impostos.
     * @param price
     */
    public void setPriceWithoutTaxes(int price){
        this.priceWithoutTaxes = price;
    }

    /**
     * Método que devolve a quantidade encomendada.
     * @return
     */
    public int getAmount(){
        return this.amount;
    }

    /**
     * Método que altera a quantidade encomendada.
     * @param amount
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * Método que devolve a taxa de imposto que se aplica ao produto.
     * @return
     */
    public double getTax(){
        return this.tax;
    }

    /**
     * Método que altera a taxa de imposto que se aplica ao produto.
     * @param tax
     */
    public void setTax(double tax){
        this.tax = tax;
    }

    /**
     * Método que devolve o valor do desconto comercial em relação ao preço antes de impostos.
     * @return
     */
    public double getDiscount(){
        return this.discount;
    }

    /**
     * Método que altera o valor do desconto comercial.
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * Método que representa a Linha de Encomenda em formato de texto.
     * @return
     */
    public String toString(){
        return ("Referência: " + this.reference + "\n" +
                "Descrição: " + this.description + "\n" +
                "Preço sem imposto: " + this.priceWithoutTaxes + "\n" +
                "Quantidade encomendada: " + this.amount + "\n" +
                "Imposto que se aplica ao produto: " + (this.tax*100) + "%\n" +
                "Desconto comercial: " + (this.discount*100) + "%\n");
    }

    /**
     * Método que averigua a igualdade entre duas Linhas de Encomenda.
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
        LinhaDeEncomenda e = (LinhaDeEncomenda) obj;
        return (this.reference.equals(e.getReference()) &&
                this.description.equals(e.getDescription()) &&
                this.priceWithoutTaxes == e.getPriceWithoutTaxes() &&
                this.amount == e.getAmount() &&
                this.tax == e.getTax() &&
                this.discount == e.getDiscount());
    }

    /**
     * Método que cria uma cópia da linha de encomenda recetora da mensagem.
     * @return
     */
    public LinhaDeEncomenda clone(){
        return new LinhaDeEncomenda(this);
    }

    /**
     * Método que determina o valor da venda considerando impostos e descontos.
     * @return
     */
    public double calculaValorLinhaEnc(){
        double priceWithDiscount = (this.priceWithoutTaxes*this.amount - ((this.priceWithoutTaxes*this.amount)*this.discount));
        return (priceWithDiscount + (priceWithDiscount * this.tax));
    }

    public double calculaValorDesconto(){
        double valor = this.amount * this.priceWithoutTaxes;
        valor *= this.discount;
        return valor;
    }
}
