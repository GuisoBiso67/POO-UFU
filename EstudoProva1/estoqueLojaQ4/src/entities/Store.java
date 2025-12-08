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

    public void requestSelling(String productName, int quant){
        Product p = stock.searchProduct(productName);
        if(p != null){
            p.sellProduct(p, quant);
            System.out.println(p.getDescription() + " | Valor: " + (p.getPrice()*quant) + " | Estoque: -" + quant);
        }else{
            System.out.println("Produto nao encontrado!");
        }
    }

    public void requestBuying(String productName, int quant){
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
