public class Item_req {

    // Atrib
    private int id_item;
    private int item_qtd;
    private Product product;
    private double item_value;

    // Constructor
    public Item_req(int id_item, int item_qtd, Product product) {
        this.id_item = id_item;
        this.item_qtd = item_qtd;
        this.product = product;
        this.item_value = product.getProduct_price()*item_qtd;
    }

    //Methods
    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public int getItem_qtd() {
        return item_qtd;
    }

    public void setItem_qtd(int item_qtd) {
        this.item_qtd = item_qtd;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getItem_value() {
        return item_value;
    }

    public void setItem_value(double item_value) {
        this.item_value = item_value;
    }


}
