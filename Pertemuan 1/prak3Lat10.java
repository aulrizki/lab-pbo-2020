public class prak3Lat10 
{
    public static void main(String[] args) 
    {
        int marks=65;
        if(marks<50)
        {
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90) 
        {
            System.out.println("A grade");
        }
        else if(marks>=90 && marks<100)
        {
            System.out.println("A+ grade");
        }
        else
        {
        System.out.println("Invalid!");
        }
    }
}
/*coding diatas merupakan program untuk mencoba seleksi dengan menggunakan if-else if-else untuk memastikan jika pernyataan bernilai true akan 
dilanjutkan ke pernyataan berikutnya jika false maka akan dilanjutkan ke pernyataan yang lain sampai menemukan kondisi yang true 
dan jika tidak ada kondisi yang true maka akan dilanjutkan ke pernyataan pada else*/