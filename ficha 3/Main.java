import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Encomenda e1 = new Encomenda();
        Encomenda e2 = new Encomenda(e1);
        e1.setMorada("Barreiras");

        LinhaDeEncomenda l1 = new LinhaDeEncomenda();
        LinhaDeEncomenda l2 = new LinhaDeEncomenda();
        LinhaDeEncomenda l3 = new LinhaDeEncomenda();
        l1.setTax(0.23);
        l1.setDiscount(0.10);
        l1.setPriceWithoutTaxes(50);
        l1.setAmount(2);
        l1.setReference("045623");
        l2.setAmount(1);
        l2.setPriceWithoutTaxes(100);
        l2.setDiscount(0);
        l2.setTax(0.13);
        l2.setReference("183539");
        l3.setTax(0.23);
        l3.setAmount(3);
        l3.setPriceWithoutTaxes(200);
        l3.setDiscount(0.10);
        l3.setReference("423985");

        LinhaDeEncomenda[] linhas = new LinhaDeEncomenda[5];
        linhas[0] = l1;
        linhas[1] = l2;
        e1.setLinhasEncomenda(linhas);
        e1.adicionaLinha(l3);
        e1.removeProduto("183539");

        System.out.println(e1.toString());
        System.out.println(e1.calculaValorTotal());
        System.out.println(e1.calculaValorDesconto());
        System.out.println(e1.numeroTotalProdutos());

        if(e1.existeProdutoEncomenda("423985")){
            System.out.println("O produto foi encomendado!");
        }else{
            System.out.println("O produto não foi encomendado!");
        }

        if(e1.equals(e2)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais.");
        }
    }
}

