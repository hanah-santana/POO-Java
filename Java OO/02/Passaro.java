public class Passaro{

	private String nome;
	private String nascimento;
	//Construtor (preset):
	public Passaro(String nome, String nascimento){
		this.nome = nome;
		this.nascimento = nascimento;
	}
	//GetSet:
	public String get_nome(){
		return this.nome;
	}
	public void set_nome(String nome){
		this.nome = nome;
	}

	public String get_nascimento(){
		return this.nascimento;
	}
	public void set_nascimento(String nascimento){
		this.nascimento = nascimento;
	}

	public void show(){
		System.out.println("Nome:"+this.nome);
		System.out.println("Nascimento:"+this.nascimento);
	}
}