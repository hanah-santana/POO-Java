class Main {
	public static void main(String[] args) {
	  String oi="oi";
	   try {
	    	Integer i=new Integer(oi);
	    	System.out.println(oi);
	   }
	   catch(ArithmeticException nexc){
	   	System.out.println("caiu na excecao");
	   }
	   catch(NumberFormatException e){
	   		System.out.println("ola");
	   } finally{
	   	System.out.println("passou pelo finally");
	   }
	   System.out.println("acabou"); 
	   } 
}