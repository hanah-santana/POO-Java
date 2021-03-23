public class Livro{
	private String nome;
	private int num;
	
	public Livro(String nome, int num) {
		this.nome=nome;
		this.num=num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return this.nome;
	}
	

}