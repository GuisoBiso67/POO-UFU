package entities;

public class Product {
    private String description;
    private int quantity;
    private double price;

    public Product(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription(){
        return this.description;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }

    public void sellProduct(Product p, int quant){ // venda;
        if(p.getQuantity() < quant){
            System.out.println("Estoque indisponível, não foi possível realizar a compra.");
        }else{
            p.quantity = p.getQuantity() - quant;
            System.out.println("Compra realizada com sucesso. Obrigado pela preferencia!:)");
        }
    }

    public void buyProduct(Product p, int quant){ // reposição;
        p.quantity += quant;
    }
}
