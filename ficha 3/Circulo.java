import java.lang.Math;

public class Circulo {

    //variáveis de instância
    private double x;
    private double y;
    private double raio;

    /**
     * Construtor por omissão de Ponto.
     */
    public Circulo(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Construtor parametrizado de Ponto.
     */
    public Circulo(int cx, int cy, int r){
        this.x = cx;
        this.y = cy;
        this.raio = r;
    }

    /**
     * Construtor de cópia de Ponto.
     */
    public Circulo(Circulo c){
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    /**
     * Método que devolve o valor da coordenada x.
     * @return valor da coordenada x.
     */
    public double getX(){
        return this.x;
    }

    /**
     * Método que devolve o valor da coordenada y.
     * @return valor da coordenada y.
     */
    public double getY(){
        return this.y;
    }

    /**
     * Método que devolve o raio do circulo.
     * @return raio do círculo.
     */
    public double getRaio(){
        return this.raio;
    }

    /**
     * Método que implementa a igualdade entre dois círculos.
     * @param obj objecto que é comparado com o recetor da mensagem.
     * @return resultado booleano da comparação feita entre o parâmetro e o recetor.
     */
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if((obj == null) || (this.getClass() != obj.getClass())){
            return false;
        }
        Circulo c = (Circulo) obj;
        return (this.x == c.getX() && this.y == c.getY() && this.raio == c.getRaio());
    }

    /**
     * Método que devolve a representação do círculo em String.
     * @return String com as coordenadas e o raio do círculo.
     */
    public String toString(){
        return "x = " + this.x + "; y = " + this.y + "; raio = " + this.raio + ";";
    }

    /**
     * Método que faz um cópia do objecto recetor da mensagem.
     * Para tal, invoca o construtor de cópia.
     * @return objecto clone do objecto original.
     */
    public Circulo clone(){
        return new Circulo(this);
    }

    /**
     * Método que altera o valor da variável de instância x.
     * @param x novo valor da coordenada x.
     */
    public void setX(double x){
        this.x = x;
    }

    /**
     * Método que altera o valor da variável de instância y.
     * @param y novo valor da coordenada y.
     */
    public void setY(double y){
        this.y = y;
    }

    /**
     * Método que altera o valor da variável de instância raio.
     * @param raio novo valor do raio.
     */
    public void setRaio(double raio){
        this.raio = raio;
    }

    /**
     * Método que altera o posicionamento do círculo.
     * @param x novo valor da coordenada x.
     * @param y novo valor da coordenada y.
     */
    public void alteraCentro(double x, double y){
        setX(x);
        setY(y);
    }

    /**
     * Método que calcula a área do círculo.
     * @return área do círculo.
     */
    public double calculaArea(){
        return Math.PI * (Math.pow(this.raio, 2));
    }

    /**
     * Método que calcula o perímetro do círculo.
     * @return perímetro do círculo.
     */
    public double calculaPerimetro(){
        return 2 * Math.PI * this.raio;
    }


}









