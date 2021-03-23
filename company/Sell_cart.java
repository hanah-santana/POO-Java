import java.util.ArrayList;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
public class Sell_cart {

    // Atributos
    private int id_sell;
    private Calendar date_sell;
    private ArrayList<Item_req> item_req = new ArrayList<Item_req>();
    private Client client;
    private Seller seller;
    private Vehicle car;
    private float sell_value;


    // Constructor
    public Sell_cart(int id_sell, Client client, Seller seller, Vehicle car) {
        this.id_sell = id_sell;
        this.client = client;
        this.seller = seller;
        this.car = car;

    }

    // Metodos
    public int getId_sell() {
        return id_sell;
    }

    public void setId_sell(int id_sell) {
        this.id_sell = id_sell;
    }

    public Calendar getDate_sell() {
        return date_sell;
    }

    public void setDate_sell(Calendar date_sell) {
        this.date_sell = date_sell;
    }

    public ArrayList<Item_req> getItem_req() {
        return item_req;
    }

    public void setItem_req(ArrayList<Item_req> item_req) {
        this.item_req = item_req;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public float getSell_value() {
        return sell_value;
    }

    public void setSell_value(float sell_value) {
        this.sell_value = sell_value;
    }

    public void add_item (Item_req item) {
            this.item_req.add(item);
    }


    // Func for calc value note
    public float calculate_total() {
        float sell_value=0;
        // Percorre a lista de itens
        for (Item_req itnf : this.item_req)  {
            // vai somando a variavel sell_value a quantidade de cada item * o valor
            // do produto associado ao item
            sell_value += (itnf.getItem_qtd() * itnf.getProduct().getProduct_price());
        }

        return sell_value;

    }

    public void Add_item(Item_req itemReq){
        this.item_req.add(itemReq);
    }

    // Printing note
    public void gen_note(){
        this.sell_value = this.calculate_total();
        Locale ptBR = new Locale("pt", "BR");
        //SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(ptBR);
        // 80 char per line
        System.out.println("\n"+String.format("%55s", "PEDIDO DE VENDA"));
        System.out.println("Numero do pedido: "+ String.format("%06d",this.id_sell) + String.format("%60s", "Data do Pedido: " + this.date_sell.getTime())); //+ String.format("%10s",String.format(this.date_sell)));
        System.out.println(String.format("%10s","Cliente: ")+this.client.getClient_name());
        System.out.println(String.format("%10s","Vendedor: ")+seller.getSeller_name());
        System.out.println("\n"+String.format("%10s","Veiculo: ")+String.format("%-20s",this.car.getVehicle_desc()) + String.format("%45s", "Valor: ")+String.format("%19s", moedaFormat.format(this.car.getVehicle_price())));
        //------------------2-------------------------//
        System.out.println("\n"+String.format("%38s","").replace(" ","-")+" Itens do Pedido "+String.format("%39s","").replace(" ","-"));

        System.out.println("\n"+String.format("%5s","#Item")+String.format("%12s","Descricao") +
                String.format("%44s","Qtd") +
                String.format("%16s"," - Valor Unitario") +
                String.format("%14s"," - Valor do Item"));
        //------------------3-------------------------//
        for (Item_req itemreq : this.item_req){
            System.out.println(String.format(" %04d",itemreq.getId_item()) + //imprime Id_item do item*
                    " - "+ String.format("%-49s",itemreq.getProduct().getProduct_desc()).replace(" ","-") + //imprime descrição do produto completando com "-"
                    " "+ String.format("%03d", itemreq.getItem_qtd()) + //imprime a quantidade com 3 digitos
                    " - " + String.format("%14s", moedaFormat.format(itemreq.getItem_value())) + //imprime o valor unitário
                    " - " + String.format("%13s", moedaFormat.format(itemreq.getItem_value()*itemreq.getItem_qtd()))); //imprime o valor total do item
        }

        System.out.println("\n"+String.format("%94s"," ").replace(" ","-")); //quebra de linha
        System.out.println("Valor do Pedido: "+String.format("%25s",moedaFormat.format(this.getSell_value()))); //imprime valor do pedido
        System.out.println("Comissao do Vendedor: "+String.format("%20s",moedaFormat.format(this.getSell_value() * this.getSeller().getSeller_plus() / 100)));

    }

}