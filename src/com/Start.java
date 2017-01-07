package com;

import com.till.operations.PurchaseOrder;
import com.till.operations.SaleOrder;
import com.till.stock.Product;
import java.math.BigDecimal;
import com.till.stock.Stock;

public class Start {

    public static void main(String[] args) {
        Product enamel = new Product("Эмаль",0);
        Product pencil = new Product("Карандаш",0);
        Product varnish = new Product("Лак", 0);
        Stock products = new Stock();
        products.setNew(enamel);
        products.setNew(varnish);
        products.setNew(pencil);
        PurchaseOrder purchaseEnamel =
                new PurchaseOrder(enamel, new BigDecimal (50.25), 5);
        purchaseEnamel.execute();
        PurchaseOrder purchasePencil =
                new PurchaseOrder(pencil, new BigDecimal (12.04),7);
        purchasePencil.execute();
        PurchaseOrder purchaseVarnish =
                new PurchaseOrder(varnish, new BigDecimal(25.02),6);
        purchaseVarnish.execute();

        SaleOrder saleEnamel =
                new SaleOrder(enamel, new BigDecimal(0),2);
        saleEnamel.execute();
        SaleOrder salePencil =
                new SaleOrder(pencil, new BigDecimal(15.04),3);
        salePencil.execute();
        SaleOrder saleVarnish =
                new SaleOrder(varnish, new BigDecimal(35.02),5);
        saleVarnish.execute();



        System.out.println(enamel.percent);
        System.out.println(pencil.percent);
        System.out.println(varnish.percent);
    }
}
