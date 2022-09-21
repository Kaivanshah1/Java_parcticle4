/*Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions. Each ‘catch’ block handles a different type of exception. For
example the exception could be ‘ArithmeticException’ and
‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.
*/

public class Main {	
		public static void main(String[] args) {	
		try{	
		int a=10/0;	
		}	
		catch(ArithmeticException e)	
		{	
		System.out.println("Arithmetic Exception occurs");	
		}	
		catch(ArrayIndexOutOfBoundsException e)	
		{	
		System.out.println("ArrayIndexOutOfBounds Exception	
		occurs");	
		}	
		catch(Exception e)	
		{
		System.out.println("main Exception occurs");
		}
		System.out.println("end of the code");
}
}
