public class Array1 
{
    public static void main(String args[]) 
    {
        int nilai[]=new int[3];
        nilai[0]=70;
        nilai[1]=80;
        nilai[2]=65;
        double ratarata=0.0;
        for(int i=0; i<nilai.length; i++)
        ratarata+=nilai[i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
    }
}
/*coding diatas merupakan program untuk mencoba array satu dimensi, setelah data 
array nya dibuat lalu di cari rata-rata dari data nilai array yang ada*/