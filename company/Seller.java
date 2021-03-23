public class Seller {
    // Atrib
    private int id_seller;
    private String seller_name;
    private float seller_plus;

    // Constructor
    public Seller(int id_seller, String seller_name, float seller_plus ){
        this.id_seller = id_seller;
        this.seller_name = seller_name;
        this.seller_plus = seller_plus;


    }

    public int getId_seller() {
        return id_seller;
    }

    public void setId_seller(int id_seller) {
        this.id_seller = id_seller;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public float getSeller_plus() {
        return seller_plus;
    }

    public void setSeller_plus(float seller_plus) {
        this.seller_plus = seller_plus;
    }
}
