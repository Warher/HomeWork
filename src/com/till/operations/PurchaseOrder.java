package com.till.operations;


import com.till.stock.Product;
import java.math.BigDecimal;

public class PurchaseOrder extends Order {

    // Вызов Конструктора родительского класса
    public PurchaseOrder(Product product, BigDecimal price, int quantiti){
        super (product, price, quantiti);
    }
    // Реализация
    public void execute (){
        product.setPurchasePrice (price);
        product.setQuantiti(this.quantiti);
    }

}
