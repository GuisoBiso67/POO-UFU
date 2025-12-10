import entities.Product;
import entities.Store;

import java.util.*;

class Main {
    public static void main(String args[]){
        Store store1 = new Store("Miramontes");
        Product product1 = new Product("Bola", 20, 25.00);
        Product product2 = new Product("Tenis", 10, 100.00);
        store1.getStock().addProduct(product1);
        store1.getStock().addProduct(product2);

        store1.requestSelling("Bola", 10);
        store1.requestSelling("Tenis", 3);
        store1.requestBuying("Bola", 5);
        store1.requestStockList();
    }
}
