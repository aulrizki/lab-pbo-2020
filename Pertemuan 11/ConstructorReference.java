/**
 * Write a description of interface Messageable here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
interface Messageable{
 	Message getMessage(String msg);
}

class Message{
 	Message(String msg){
 		System.out.print(msg);
 	}
}

/*
Class ini merupakan method reference ke constructor
*/
public class ConstructorReference {
 	public static void main(String[] args) {
 		Messageable hello = Message::new;
 		hello.getMessage("Hello");
 	}
}