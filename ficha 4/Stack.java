import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.lang.StringBuilder;

public class Stack {

    private ArrayList<String> stack;

    /**
     * Construtor por omissão de Stack.
     */
    public Stack(){
        this.stack = new ArrayList<String>();
    }

    /**
     * Construtor parametrizado de Stack
     * @param array
     */
    public Stack(ArrayList array){
        setStack(array);
    }

    /**
     * Construtor de cópia de Stack
     * @param s
     */
    public Stack(Stack s){
        this.stack = new ArrayList<String>();
        setStack(s.getStack());
    }

    /**
     * Método que altera
     * @param array
     */
    public void setStack(ArrayList array){

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String temp = new String(it.next());
            this.stack.add(temp);
        }
    }

    /**
     * Método que devolve a Stack
     * @return
     */
    public ArrayList<String> getStack(){
        return this.stack;
    }

    /**
     * Método que cria uma cópia da Stack recetora da mensagem
     * @return
     */
    public Stack clone(){
        return new Stack(this);
    }

    /**
     * Método que devolve a Stack em formato de texto.
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.stack.iterator();
        sb.append("[");
        while(it.hasNext()){
            sb.append(it.next());
            if(it.hasNext()){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    /**
     * Método que averigua a igualdade entre a Stack e um outro objeto.
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if((o == null) || (o.getClass() != this.getClass())){
            return false;
        }
        Stack s = (Stack) o;
        return s.stack.equals(this.stack);
    }

    /**
     * Método que devolve o topo da Stack.
     * @return
     */
    public String top(){
        return this.stack.get(this.stack.size()-1);
    }

    /**
     * Método que coloca uma String no topo da Stack.
     * @param s
     */
    public void push(String s){
        this.stack.add(s);
    }

    /**
     * Método que verifica se a Stack está vazia.
     * @return
     */
    public boolean empty(){
        return this.stack.isEmpty();
    }

    /**
     * Método que devolve o tamanho da Stack.
     * @return
     */
    public int length(){
        return this.stack.size();
    }
}
