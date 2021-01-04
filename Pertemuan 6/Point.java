
/**
 * Write a description of class Point here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class Point
{
     private int x;
     private int y;
    
     //method ini adalah method constructor untuk menciptakan objek Point
     public Point()
     {
         x = 0;
         y = 0;
     }
    
     //method ini adalah method constructor untuk menciptakan objek point dengan parameter
     public Point(int x, int y)
     {
         this.x = x;
         this.y = y;
     }
    
     //method ini adalah method Accessor yang digunakan untuk mengembalikan nilai dari x
     public int getX()
     {
         return this.x;
     }
    
     //method ini adalah method Mutator yang digunakan untuk mengubah nilai dari objek memiliki parameter
     public void setX(int x)
     {
         this.x = x;
     }
    
     //method ini adalah method Accessor yang digunakan untuk mengembalikan nilai dari y
     public int getY()
     {
         return this.y;
     }
    
     //method ini adalah method Mutator yang digunakan untuk mengubah nilai dari objek memiliki parameter
     public void sety(int y)
     {
         this.y = y;
     }
    
     //method ini digunakan untuk menampilkan titik x dan y
     public String toString()
     {
         return "Titik dengan x=" +x+ " y=" +y ;
     }
}