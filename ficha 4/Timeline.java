import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timeline {

    private List<FBPost> feed;

    public Timeline(){
        this.feed = new ArrayList<FBPost>();
    }

    public Timeline(List p){
        setFeed(p);
    }

    public Timeline(Timeline t){
        this.feed = new ArrayList<FBPost>();
        setFeed(t.getFeed());
    }

    public List<FBPost> getFeed(){
        List<FBPost> ret = new ArrayList<FBPost>();
        Iterator<FBPost> it = this.feed.iterator();

        while(it.hasNext()){
            ret.add(it.next().clone());
        }

        return ret;
    }

    public void setFeed(List<FBPost> feed) {
        for(FBPost p: feed){
            this.feed.add(p.clone());
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Timeline: {");
        for(FBPost p: feed){
            sb.append(p.toString());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        Timeline t = (Timeline) obj;
        return this.feed.equals(t.getFeed());
    }

    public int nrPosts(String user){
        int num = 0;
        for(FBPost p: feed){
            if(p.getName().equals(user)){
                num++;
            }
        }
        return num;
    }

    public List<FBPost> postsOf(String user){
        List<FBPost> posts = new ArrayList<FBPost>();
        for(FBPost p: feed){
            if(p.getName().equals(user)){
                posts.add(p.clone());
            }
        }
        return posts;
    }

    public FBPost getPost(int id){
        FBPost ret = new FBPost();
        for(FBPost p: feed){
            if(p.getId() == id){
                ret = p.clone();
            }
        }
        return ret;
    }

    public void comment(FBPost post, String comentario){
        for(FBPost p: feed){
            if(p.equals(post)){
                p.insertComment(comentario);
            }
        }
    }

    public void like(FBPost post){
        for(FBPost p: feed){
            if(p.equals(post)){
                p.addLike();
            }
        }
    }
}
