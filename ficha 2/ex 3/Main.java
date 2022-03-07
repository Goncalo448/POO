package ex3;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args){

        //ArrayDatas obj = new ArrayDatas();

        LocalDate[] datas = new LocalDate[20];
        datas[0] = LocalDate.now();

        System.out.println(datas[0]);
    }
}
