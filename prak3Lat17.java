public class prak3Lat17
{
    public static void main(String arg[])
    {

        for (int i=0; i<10; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                if(j==5)
                    break;
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
/*coding diatas merupakan program untuk mencoba statement break 
untuk berhenti dari looping yang memunculkan lambang "*" dalam sebaris
 sampai batas 5 buah lambang "*" saja ketika mencapai statement break */