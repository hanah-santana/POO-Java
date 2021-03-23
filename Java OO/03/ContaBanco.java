public class ContaBanco{
	
	//atributos:
	public int numero_conta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//metodos:
	public void estado(){
		System.out.println("----------x----------");
		System.out.println("Conta:" + this.get_numero_conta());
		System.out.println("Tipo:" + this.get_tipo());
		System.out.println("Dono:" + this.get_dono());
		System.out.println("Saldo:" + this.get_saldo());
		System.out.println("Status:" + this.get_status());

	}

	public void abrir_conta(String t){
		this.set_tipo(t);
		this.set_status(true);
		if(t == "CC"){
			this.set_saldo(50.0f);
		}else if(t == "CP"){
			this.set_saldo(150.0f);
		}
	}

	public void fechar_conta(){
		if (this.get_saldo() > 0){
			System.out.println("Acao nao pode ser execudada por ainda existir montante remanescente.");
		}else if(this.get_saldo() < 0){
			System.out.println("Ainda tem debito, hmm caloteiro.");
		}else{
			this.set_status(false);
			System.out.println("Sucesso na operacao, la compte est ferme!");
		}
	}

	public void depositar(int v){
		if(this.get_status()){
			this.set_saldo(this.get_saldo() + v);
			System.out.println("Deposito realizado com sucesso!");
		}else{
			System.out.println("Erro ao depositar, conta fechada.");
		}
	}

	//Metodos espaciais:
	//Construtor(preset):
	public void ContaBanco(){
		this.saldo = 0;
		this.status = false;
	}
	//GetSet's:
	public int get_numero_conta(){
		return this.numero_conta;
	}
	public void set_numero_conta(int numero_conta){
		this.numero_conta = numero_conta;
	}

	public String get_tipo(){
		return this.tipo;
	}
	public void set_tipo(String tipo){
		this.tipo = tipo;
	}

	public String get_dono(){
		return this.dono;
	}
	public void set_dono(String dono){
		this.dono = dono;
	}

	public Float get_saldo(){
		return this.saldo;
	}
	public void set_saldo(Float saldo){
		this.saldo = saldo;
	}

	public boolean get_status(){
		return this.status;
	}
	public void set_status(boolean status){
		this.status = status;
	}
}