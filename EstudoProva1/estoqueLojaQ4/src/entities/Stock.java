package entities;

import java.util.*;

public class Stock {
    private ArrayList<Product> products;

    public Stock(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){ // adiciona produtos a lista;
        products.add(p);
    }

    public void printFullStock(){
        System.out.println(">------- ESTOQUE -------<");
        System.out.println("Produto | Estoque | Preco");
        for(Product p : products){
            System.out.println(p.getDescription() + " | " + p.getQuantity() + " | " + p.getPrice());
        }
    }

    public void printOneProduct(String productName){
        Product p = searchProduct(productName);
        if(p != null){
            System.out.println("Produto | Estoque");
            System.out.println(p.getDescription() + " | " + p.getQuantity());
        }else{
            System.out.println("Produto nao encontrado.");
        }
    }

    public void printPrices(){
        System.out.println("Produto | Valor");
        for(Product p : products){
            System.out.println(p.getDescription() + " | " + p.getPrice());
        }
    }

    public Product searchProduct(String productName){ // procura produto no estoque;
        for(Product p : products){
            if(p.getDescription().equals(productName)){
                return p;
            }
        }
        return null;
    }
}
