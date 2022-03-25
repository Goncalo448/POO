import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        /*Stack s1 = new Stack();
        Stack s2 = new Stack(s1);
        ArrayList<String> l = new ArrayList<String>();
        l.add("Ola");
        l.add("Boa Tarde");
        l.add("O pai dela era minha tia");
        s1.setStack(l);
        s1.push("poo");
        s2.push("cp");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s2.empty());
        System.out.println(s1.length());

        if(s2.equals(s1)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }*/

        Timeline t1 = new Timeline();
        Timeline t2 = new Timeline(t1);
        ArrayList<String> l = new ArrayList<String>();
        l.add("Gostei");
        l.add("grande video do sirkazzio");
        l.add("prefiro o darkframe");
        FBPost p1 = new FBPost(1,"Gonçalo", LocalDateTime.now(), "ola tudo bem", 102, l);
        l.add("nao sei");
        FBPost p2 = new FBPost(2,"Gonçalo", LocalDateTime.now(), "qualquer coisa", 30, l);
        FBPost p3 = new FBPost(3, "Quim", LocalDateTime.now(), "teste", 23, l);
        List<FBPost> lista = new ArrayList<FBPost>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        t1.setFeed(lista);
        t1.comment(p2, "novo comentario");
        t1.like(p2);
        t1.like(p3);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.nrPosts("Gonçalo"));
        System.out.println(t1.postsOf("Quim").toString());
        System.out.println(t1.getPost(1).toString());


        if(t1.equals(t2)){
            System.out.println("São iguais.");
        }else{
            System.out.println("Não são iguais.");
        }
    }
}
