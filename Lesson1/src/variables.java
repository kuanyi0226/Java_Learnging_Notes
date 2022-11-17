
public class variables {

	public static void main(String[] args) {
		int i; //declaration
		i= 123;
		byte b= 100;
		float f= 3.14f; //要加f
		double d= 3.14;
		boolean B= true;
		char c= '@';
		String S= "Kevin"; //reference data type(運算較慢)
		
		
		System.out.println("My number is: "+i);
	
		
		//String methods
		String name = "Kevin";
		  
		boolean result = name.equalsIgnoreCase("kevin"); //無論大小寫
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("o");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		//String result = name.replace('o', 'a');
		   
		System.out.println(result);
		
		
		// wrapper class = 	provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive		//wrapper
		//---------		//-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		Boolean Bo = true;
		Character Ch = '@';
		Integer In = 123;
		Double Do = 3.14;

		
		
		//final: 不能修改
		final double PI= 3.14;
	}

}
