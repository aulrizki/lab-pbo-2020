public class prak3Lat12
{
    public static void main(String[] args) 
    {
        int number=20;
        switch(number)
        {
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
/*coding diatas merupakan program untuk mencoba seleksi dengan menggunakan switch-case namun tanpa break di setiap case
sehingga output progam diatas dimulai dari case yang sudah terpenuhi nilai true nya sampai dengan case terakhir,
case yang berada sebelum case yang memenuhi nilai true tidak akan ditampilkan*/