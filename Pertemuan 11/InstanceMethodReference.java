
/**
 * Write a description of interface Sayable here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
interface Sayable{
 	void say();
}

/*
Class ini merupakan method reference ke method instance
*/ 
public class InstanceMethodReference {
 	public void saySomething(){
 		System.out.println("Hello, this is non-static method.");
 	}
 
 	public static void main(String[] args) {
 		// Creating object
 		InstanceMethodReference methodReference = new
		InstanceMethodReference();

 		// Referring non-static method using reference
 		Sayable sayable = methodReference::saySomething;

 		// Calling interface method
 		sayable.say();

	 	// Referring non-static method using anonymous object
 		Sayable sayable2 = new
		InstanceMethodReference()::saySomething;
		// Calling interface method
 		sayable2.say();
 	}
}
