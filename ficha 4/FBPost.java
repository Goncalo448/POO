import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class FBPost {

    private int id;
    private String name;
    private LocalDateTime timeOfCreation;
    private String content;
    private int likes;
    private ArrayList<String> coments;

    public FBPost(){
        this.id = 0;
        this.name = "None";
        this.timeOfCreation = LocalDateTime.now();
        this.content = "None";
        this.likes = 0;
        this.coments = new ArrayList<String>();
    }

    public FBPost(int id, String name, LocalDateTime time, String content, int likes, ArrayList coments){
        setId(id);
        setName(name);
        setTimeOfCreation(time);
        setContent(content);
        setLikes(likes);
        setComents(coments);
    }

    public FBPost(FBPost p){
        this.id = p.getId();
        this.name = p.getName();
        this.timeOfCreation = p.getTimeOfCreation();
        this.content = p.getContent();
        this.likes = p.getLikes();
        setComents(p.getComents());
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getTimeOfCreation() {
        return this.timeOfCreation;
    }

    public void setTimeOfCreation(LocalDateTime time){
        this.timeOfCreation = time;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public int getLikes(){
        return this.likes;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public ArrayList<String> getComents() {
        return this.coments;
    }

    public void setComents(ArrayList coments){
        Iterator<String> it = coments.iterator();
        this.coments = new ArrayList<String>();
        while(it.hasNext()){
            String temp = new String(it.next());
            this.coments.add(temp);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ID: ");
        sb.append(this.id);
        sb.append(", Nome: ");
        sb.append(this.name);
        sb.append(", Instante de Criação: ");
        sb.append(this.timeOfCreation.toString());
        sb.append(", Conteúdo: ");
        sb.append(this.content);
        sb.append(", Likes: ");
        sb.append(this.likes);
        sb.append(", Comentários: ");
        sb.append(this.coments.toString());
        sb.append("]");

        return sb.toString();
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        FBPost p = (FBPost) obj;
        return (this.id == p.getId() &&
                this.name.equals(p.getName()) &&
                this.timeOfCreation.equals(p.timeOfCreation) &&
                this.content.equals(p.getContent()) &&
                this.likes == p.getLikes() &&
                this.coments.equals(p.getComents()));
    }

    public FBPost clone(){
        return new FBPost(this);
    }

    public void insertComment(String comment){
        this.coments.add(comment);
    }

    public void addLike(){
        this.likes += 1;
    }
}
