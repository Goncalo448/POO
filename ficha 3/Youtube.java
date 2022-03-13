import java.time.LocalDate;
import java.util.ArrayList;

public class Youtube {

    private String name;
    private String content;
    private LocalDate uploadDate;
    private int resolution;
    private int timeInMinutes;
    private int timeInSeconds;
    private ArrayList<String> coments;
    private int likes;
    private int dislikes;


    /**
     * Construtor por omissão de Youtube.
     */
    public Youtube(){
        this.name = "None";
        this.content = "None";
        this.uploadDate = LocalDate.now();
        this.resolution = 0;
        this.timeInMinutes  = 0;
        this.timeInSeconds = 0;
        this.coments = new ArrayList<>();
        this.likes = 0;
        this.dislikes = 0;
    }

    /**
     * Construtor parametrizado de Youtube.
     */
    public Youtube(String video, String content, LocalDate date, int resolution, int minutes, int seconds, ArrayList<String> coments, int likes, int dislikes){
        this.name = video;
        this.content = content;
        this.uploadDate = date;
        this.resolution = resolution;
        this.timeInMinutes = minutes;
        this.timeInSeconds = seconds;
        this.coments = coments;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    /**
     * Construtor de cópia de Youtube.
     */
    public Youtube(Youtube vid){
        this.name = vid.getName();
        this.content = vid.getContent();
        this.uploadDate = vid.getUploadDate();
        this.resolution = vid.getResolution();
        this.timeInMinutes = vid.getTimeInMinutes();
        this.timeInSeconds = vid.getTimeInSeconds();
        this.coments = vid.getComents();
        this.likes = vid.getLikes();
        this.dislikes = vid.getDislikes();
    }

    /**
     * Método que devolve o nome do vídeo.
     * @return nome do vídeo.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Método que altera o nome do vídeo.
     * @param n novo nome.
     */
    public void setName(String n){
        this.name = n;
    }

    /**
     * Método que devolve o conteúdo do vídeo.
     * @return conteúdo do video.
     */
    public String getContent(){
        return this.content;
    }

    /**
     * Método que altera o conteúdo do vídeo.
     * @param c novo conteúdo.
     */
    public void setContent(String c){
        this.content = c;
    }

    /**
     * Método que devolve a data de upload.
     * @return data de upload.
     */
    public LocalDate getUploadDate(){
        return this.uploadDate;
    }

    /**
     * Método que altera a data de upload do vídeo.
     * @param d
     */
    public void setUploadDate(LocalDate d){
        this.uploadDate = d;
    }

    /**
     * Método que devolve a resolução do vídeo.
     * @return resolução do video.
     */
    public int getResolution(){
        return this.resolution;
    }

    /**
     * Método que altera a resolução do vídeo.
     * @param r nova resolução.
     */
    public void setResolution(int r){
        this.resolution = r;
    }

    /**
     * Método que devolve o tempo do video em minutos.
     * @return tempo do video em minutos.
     */
    public int getTimeInMinutes(){
        return this.timeInMinutes;
    }

    /**
     * Método que altera o tempo em minutos do vídeo.
     * @param min
     */
    public void setTimeInMinutes(int min){
        this.timeInMinutes = min;
    }

    /**
     * Método que devolve o tempo do video em segundos.
     * @return tempo do video em segundos.
     */
    public int getTimeInSeconds(){
        return this.timeInSeconds;
    }

    /**
     * Método que altera o tempo em segundos do vídeo.
     * @param sec
     */
    public void setTimeInSeconds(int sec){
        this.timeInSeconds = sec;
    }

    /**
     * Método que devolve os comentários do video.
     * @return comentários do video.
     */
    public ArrayList<String> getComents(){
        return this.coments;
    }

    /**
     * Método que altera os comentários do vídeo.
     * @param c novos comentários.
     */
    public void setComents(ArrayList<String> c){
        int size = c.size();
        this.coments = new ArrayList<>(size);
        this.coments.addAll(c);
    }

    /**
     * Método que devolve o nº de likes do video.
     * @return likes do video.
     */
    public int getLikes(){
        return this.likes;
    }

    /**
     * Método que altera o nº de likes do vídeo.
     * @param l nº de likes.
     */
    public void setLikes(int l){
        this.likes = l;
    }

    /**
     * Método que devolve o nº de dislikes do video.
     * @return dislikes do video.
     */
    public int getDislikes(){
        return this.dislikes;
    }

    /**
     * Método que altera o nº de dislikes.
     * @param d
     */
    public void setDislikes(int d){
        this.dislikes = d;
    }

    /**
     * Método que representa o objeto em formato de texto.
     * @return objeto em formato de texto.
     */
    public String toString(){
        return ("Nome: " + this.name + "\n" +
                "Conteúdo: " + this.content + "\n" +
                "Upload Date: " + this.uploadDate.toString() + "\n" +
                "Resolução: " + this.resolution + "\n" +
                "Tempo em minutos: " + this.timeInMinutes + "\n" +
                "Tempo em segundos: " + this.timeInSeconds + "\n" +
                "Comentários: " + this.coments + "\n" +
                "Likes: " + this.likes + "\n" +
                "Dislikes: " + this.dislikes + "\n");
    }

    /**
     * Método que averigua a igualdade entre dois vídeos.
     * @param obj vídeo.
     * @return booleano resultante da comparação feita entre os vídeos.
     */
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (this.getClass() != obj.getClass())){
            return false;
        }
        Youtube v = (Youtube) obj;
        return (this.name == v.getName() && this.content.equals(v.getContent()) &&
                this.uploadDate.equals(v.getUploadDate()) &&
                this.resolution == v.getResolution() &&
                this.timeInMinutes == v.getTimeInMinutes() &&
                this.timeInSeconds == v.getTimeInSeconds() &&
                this.coments.equals(v.getComents()) &&
                this.likes == v.getLikes() &&
                this.dislikes == v.getDislikes());
    }

    /**
     * Método que cria uma cópia do vídeo recetor da mensagem.
     * @return cópia do vídeo original.
     */
    public Youtube clone(){
        return new Youtube(this);
    }

    /**
     * Método que insere um comentário.
     * @param c comentário que é inserido.
     */
    public void insertComent(String c){
        this.coments.add(c);
    }

    /**
     * Método que calcula quantos dias passaram desde a data de upload do vídeo.
     * @return número de dias desde que o vídeo foi publicado.
     */
    public long quantosDiasDepois(){
        return (long)(LocalDate.now().getDayOfYear() - this.uploadDate.getDayOfYear());
    }

    /**
     * Método que faz um like.
     */
    public void thumbsUp(){
        this.likes++;
    }

    public String processa(){
        return this.content;
    }

}
