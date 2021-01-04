import java.util.Random;
/**
 * class ini adalah program untuk mengetes math random dalam coin
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class CoinFlip {
     public static void main(String[] args){
         // 50% chance heads, 50% chance tails
         Random rand = new Random();//untuk deklarasi keyword random
         double chance = rand.nextDouble();//untuk mengacak
         if (chance < 0.5) {
             System.out.println("heads!");
         } else {
             System.out.println("tails!");
         }
     }
}