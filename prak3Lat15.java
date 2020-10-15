public class prak3Lat15
{
    public static void main(String arg[])
    {
        int i=0;
        while (i<10)
        {
            int j=0;
            while (j<i+1)
            {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*coding diatas merupakan program untuk mencoba looping while untuk menampilkan
 lambang "*" dalam tiap baris dengan batas nilai yang sudah ditentukan 
 selama kondisinya true dan akan berhenti jika bernilai false */