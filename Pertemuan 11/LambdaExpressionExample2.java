
/**
 * Write a description of interface Drawbale here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
@FunctionalInterface //annotation ini optional

interface Drawable{
 	public void draw();
}
public class LambdaExpressionExample2 {
 	public static void main(String[] args) {
 		int width=10;

 		//dengan lambda expression
 			Drawable d2=()->{
 				System.out.println("Drawing "+width);
 			};
 		d2.draw();
 	}
} 