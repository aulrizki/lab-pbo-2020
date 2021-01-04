import java.util.Scanner;
/**
 * class ini berisi program untuk mengetes math.min
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class AgeLimit {
    
     public static void main(String args[]) {
         int age = 0;
         Scanner in = new Scanner(System.in);
         
         System.out.print("Enter age ");
         age = in.nextInt();
         
         //age=Math.max(age,0);
         age = Math.min(40, age);
         System.out.print("Age is "+age);
     }
}