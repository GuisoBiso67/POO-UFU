package entities;

public class Store {
    public String name;
    private Stock stock;

    public Store(String name){
        this.name = name;
        this.stock = new Stock();
    }

    public Stock getStock() {
        return stock;
    }

    public void requestSelling(String productName, int quant){ // solicita venda de produto;
        Product p = stock.searchProduct(productName);
        if(p != null && p.getQuantity() >= quant){
            p.sellProduct(p, quant);
            System.out.println(p.getDescription() + " | Valor: " + (p.getPrice()*quant) + " | Estoque: -" + quant);
        }else if(p != null && p.getQuantity() < quant){
            System.out.println("Estoque indisponível, não foi possível realizar a compra.");
        }else{
            System.out.println("Produto nao encontrado!");
        }
    }

    public void requestBuying(String productName, int quant){ // solicita compra de produto (reposição);
        Product p = stock.searchProduct(productName);
        if(p != null){
            p.buyProduct(p, quant);
            System.out.println("Estoque Atualizado de " + p.getDescription() + ": " + p.getQuantity());
        }else{
            System.out.println("Produto nao cadastrado!");
        }
    }

    public void requestStockList(){
        stock.printFullStock();
    }

    public void requestStockPrices(){
        stock.printPrices();
    }

    public void requestStockList(String productName){
        stock.printOneProduct(productName);
    }
}
