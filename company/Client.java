public class Client {

    // Atrib:
    private int id_client;
    private String client_name;
    private Client_type type_client;

    // Constructor Method:
    public Client(int id_client, String client_name, Client_type type_client ){
        this.id_client = id_client;
        this.client_name = client_name;
        this.type_client = type_client;

    }

    // Methods:
    public int getId_client(){
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Client_type getType_client() {
        return type_client;
    }

    public void setType_client(Client_type type_client) {
        this.type_client = type_client;
    }
}
