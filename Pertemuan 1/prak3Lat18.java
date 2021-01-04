public class prak3Lat18
{
    public static void main(String arg[])
    {

        for (int i=0; i<10; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                if(j==5)
                    continue;
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
/*coding diatas merupakan program untuk mencoba statement continue untuk melewatkan sisa
pernyataan dalam loop dan melanjutkan pernyataan untuk mencetak lambang "*" 
dalam tiap baris dengan batas nilai yang sudah ditentukan */