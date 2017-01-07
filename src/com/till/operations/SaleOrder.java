package com.till.operations;


import com.till.stock.Product;
import java.math.BigDecimal;

public class SaleOrder extends Order {
    // Вызов Конструктора родительского класса
    public SaleOrder(Product product, BigDecimal price, int quantiti) {
        super (product, price, quantiti);
    }
        // Реализация
        public void execute (){
            product.setSalePrice (price); // Установка цены продажи
            product.setQuantiti (-1*this.quantiti); // Колличество товара
        }
}
