package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    //Extends -> a classe filha recebe os atributos e metodos da classe pai que no caso é o Funcionario
    
    private int totalItensVendidos;

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    private float comissaoPorItem;

    public Vendedor() {
        super(); // -> estou criando um vendededor mais eu quero que ele tenha tudo que o funcionario tenha !
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

}
