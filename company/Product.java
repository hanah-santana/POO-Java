public class Product {

    // Atrib
    private int id_product;
    private String product_desc;
    private double product_price;

    // Constructor
    public Product(int id_product, String product_desc, double product_price) {
        this.id_product = id_product;
        this.product_desc = product_desc;
        this.product_price = product_price;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
}
