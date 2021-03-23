public class Alleyoop{
	public static void main(String[] args){
		String name = null;
		try {
			name.toLowerCase();
			System.out.println("segunda linha do try");
		} catch(IndexOutOfBoundsException ex) {
			System.out.println("peguei");
		}
		System.out.println("continuando normal");
	}
}