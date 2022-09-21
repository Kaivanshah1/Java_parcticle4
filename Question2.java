/* WAP to generate user defined exception using “throw” and “throws” keyword */

// using throw
public class TestThrowAndThrows
{
public static void checkage(int a)
{
if(a < 18){
throw new ArithmeticException("you are not
mature!");
}
else {
System.out.println("you are mature!");
}
}
public static void main(String[] args) {
checkage(17);
}
}

                              
// using throws
	public class Throwsexample {
	static void checkage(int a) throws ArithmeticException {
	if(a <18){
	throw new ArithmeticException("you are not
	mature!");
	}else {
	System.out.println("you are mature!");
	}
	}
	public static void main(String[] args) {
	checkage(15);
	}
	}
