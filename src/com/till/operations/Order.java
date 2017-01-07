package com.till.operations;

import com.till.stock.Product;
import java.math.BigDecimal;

public abstract class Order  {
    protected BigDecimal price;
    protected Product product;
    public int quantiti; //Колличество

    public Order(Product product, BigDecimal price, int quantiti){
        this.product = product;
        this.price = price;
        this.quantiti = quantiti;
    }
    public abstract void execute();
}
