public class prak3Lat19 
{
    public static void main(String arg[])
    {
        int a, b;
        Mulai:
        for(a=0; a<2; a++)
        {
            for(b=0; b<3; b++)
            {
                if(b==2)
                break Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
}
/*coding diatas merupakan program untuk mencoba penggunaan variabel pada break untuk menghentikan
looping yang mana jika pernyataan pada if bernilai true maka break akan mengentikan
loop yang pertama*/