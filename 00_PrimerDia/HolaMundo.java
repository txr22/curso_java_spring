class HolaMundo{
	
	public static void main(String argumentos [] ){
		
		
		
		System.out.println("prueba de acceso");

		for(int i = 0; i<argumentos.length;i++){
					
			System.out.println("Arg: "+i+ " - "+argumentos[i]+ " ");

		}
		
		int entero = 1234567890;
		
		/*float decimal = 1.23456789f;
		double doble = 1.23456789;*/
		
		float decimal = 1234567890123456789f;
		double doble = 1234567890123456789.d;
		long enteroLargo = 12345678901234567L;
		//un byte va desde -128 hasta 127
		byte unByte = -128;
		//byte otroByte = -129; este marca error
		
		
		
		System.out.println("entero: "+entero);
		System.out.println("decimal: "+decimal);
		System.out.println("double: "+doble);
		System.out.println("largo: "+enteroLargo);
		System.out.println("Byte: "+unByte);
		//System.out.println("otro Byte: "+otroByte);
		
		
	}
}