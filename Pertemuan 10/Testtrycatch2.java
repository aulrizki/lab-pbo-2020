/**
 * class ini berisi program untuk mencoba try catch exception
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class Testtrycatch2{
     public static void main(String args[]){
         try{
             int data=10/0;
         }catch(ArithmeticException e){System.out.println(e);}
        
         System.out.println("Rest of The Code...");
     }
}