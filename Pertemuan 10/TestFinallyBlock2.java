/**
 * class ini berisi program untuk mencoba try catch dengan adanya finally
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class TestFinallyBlock2{
     public static void main(String args[]){
        try{
             int data=25/0;
             System.out.println(data);
        }
        catch(ArithmeticException e){
             System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        
        System.out.println("rest of the code...");
     }
}