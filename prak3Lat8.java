import java.util.Scanner;
public class prak3Lat8 
{
    public static void main(String[] args) 
    {
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur anda:");
        age = sc.nextInt();
        if(age>=17)
        System.out.print("Anda sudah boleh buat KTP");
    }
}
/*coding diatas merupakan program untuk mencoba seleksi dengan menggunakan if untuk memastikan jika pernyataan bernilai true akan dilanjutkan
 ke pernyataan berikutnya jika false maka akan berakhir disitu atau dilanjutkan ke pernyataan yang lain dari true*/