public class prak3Lat16{

    public static void main (String[] args){
        int a = 0;

        do{
            int b = 0;
            while (b<a+1){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }while (a < 10);
    }
}
/*coding diatas merupakan program untuk mencoba looping do-while untuk menampilkan
 lambang "*" dalam tiap baris dengan batas nilai yang sudah ditentukan, bedanya dengan
 looping while yaitu do akan diproses terlebih dahulu kemudian di cek pada kondisi while,
 jika bernilai true maka akan ditampilkan, jika false akan berhenti*/