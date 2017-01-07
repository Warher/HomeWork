package com.till.stock;

import java.math.BigDecimal;
import java.math.MathContext;

public class Product {

    public double percent;
    private BigDecimal purchasePrice = BigDecimal.valueOf(0);
    private BigDecimal salePrice = BigDecimal.valueOf(0);
    private String name;
    private int quantiti;
    //Конструктор
    public Product(String name, int quantiti){
        this.name = name;
        this.quantiti = 0;
    }
    public void setQuantiti(int quantiti) {
        this.quantiti += quantiti;
    }
    public int getQuantiti(){
        return quantiti;
    }

    public void setPurchasePrice(BigDecimal purchasePrice){
        // проверки на валидность и т.п
        this.purchasePrice = purchasePrice;
           }

    public void setSalePrice(BigDecimal salePrice) {
        // проверки на валидность и т.п
        this.salePrice = salePrice;
        recountingPercent();
    }

    private void recountingPercent() {
        // percent = salePrice / purchasePrice * 100 - 100
        //BigDecimal div = salePrice.divide(purchasePrice); // Деление
        //BigDecimal mul = div.multiply(BigDecimal.valueOf(100)); // Умножеие
        //BigDecimal sub = mul.subtract(BigDecimal.valueOf(100)); // Вычитание
        //percent = sub.doubleValue();
        try{
        percent = (salePrice.
                divide(purchasePrice, MathContext.DECIMAL64) // деление
                .multiply(BigDecimal.valueOf(100)) // умножение
                .subtract(BigDecimal.valueOf(100)) // вычитание
                .doubleValue());
            }catch (NullPointerException e){
            System.out.println ("деление на ноль");
        }
    }

}
