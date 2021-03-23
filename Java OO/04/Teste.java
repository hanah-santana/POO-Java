class A {
	public static void main(String[] args) {
	  int oi=5;
	   try {
	    	oi=oi/0;
	    	System.out.println(oi);
	   } finally{
	   	System.out.println(oi);
	   }
	   System.out.println("c"); 
	   } 
}
