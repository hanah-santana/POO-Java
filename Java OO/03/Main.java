class Main{
	public static void main(String[] args){
		ContaBanco C1 = new ContaBanco();

		C1.set_numero_conta(1234);
		C1.set_dono("Jout Jout");
		C1.abrir_conta("CC");
		C1.estado();

		ContaBanco C2 = new ContaBanco();
		C2.estado();
	}
}