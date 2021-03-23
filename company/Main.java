public class Main {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Calota Aro 13pol", 25.00);
        Product p2 = new Product(2, "Sensor Estacionamento", 1300.00);
        Product p3 = new Product(3, "GPS Garmin", 1500.00);
        
        Client c1 = new Client(1, "Pedro Viafora", Client_type.PESSOA_FISICA);
        Client c2 = new Client(2, "Hanah Santana", Client_type.PESSOA_JURIDICA);
        
        Seller vd1 = new Seller(1,"Gabriel Oliveira", 5.00F);
        
        Vehicle v1 = new Vehicle(1,"Fiat Siena 2011", 32000.00F);
        Vehicle v2 = new Vehicle(2,"Wolks Gol 2011", 33000.00F);
        
        Item_req ir1 = new Item_req(1,5,p1);
        Item_req ir2 = new Item_req(2,2,p2);
        Item_req ir3 = new Item_req(3,1,p3);
        
        Sell_cart sc1 = new Sell_cart(1,c1,vd1,v2);
        Sell_cart sc2 = new Sell_cart(2,c2,vd1,v1);

        // Armazena a data atual (pega a data do sistema)
        sc2.setDate_sell(java.util.Calendar.getInstance());

        // Inserir os items na Nota Fiscal
        sc2.add_item(ir1);
        sc2.add_item(ir2);
        sc2.add_item(ir3);

        sc2.gen_note();
    }
}
