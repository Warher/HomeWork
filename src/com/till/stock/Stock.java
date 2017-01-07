package com.till.stock;

import java.util.ArrayList;

public class Stock
{
    private ArrayList<Product> stock;

    public void setNew(Product product)
    {
        this.stock.add(product);
    }
    public Stock()
    {
        this.stock = new ArrayList<Product>();
    }


}
