// Widening and Narrowing

class Example
{
 	 public static void main(String args[])
	{
		// Widening
		int a=10;
		float f=a;
		System.out.println(a);
		System.out.println(f);

		// Typecasting
		float fo=10.5f;
		int i= (int)fo;
		System.out.println(i);
		System.out.println(fo);

		//Overflow  
		int k=130;  
		byte b=(byte)k;  
		System.out.println(k);  
		System.out.println(b); 

		byte x=10;
		byte y=10;
		byte z=(byte)(x+y);
		System.out.println(z);

 

	}}
