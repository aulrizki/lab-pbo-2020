import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Muhammad Aulia Rizki)
 * @version (3-12-2002)
 */
//class ini berfungsi untuk menjalankan program utamanya
class Main
{
    public static void main(String[] args)
    {
        //mendeklarasikan variabel
        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);
        int menu, umur;
        String nama, hamil;
        boolean pregnant;
        System.out.println("===== BUS TRANS KOETARADJA =====");
        while(true)
        {
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Akhiri Program\n");
            System.out.println("Masukkan menu anda :");
            menu = input.nextInt();//user menginput pilihan antara 1 sampai 4
            input.nextLine();
            if(menu == 1)//jika pilihan 1 maka naikkan penumpang
            {
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.print("Umur       : ");
                umur = input.nextInt();
                input.nextLine();
                System.out.print("Hamil(yes/no) : ");
                hamil = input.nextLine();
                if(hamil.equalsIgnoreCase("yes")){
                    pregnant = true;
                }else{
                    pregnant = false;
                }
                Penumpang pen = new Penumpang(nama, umur, pregnant);
                System.out.println(bus.naikPenumpang(pen) ? "Penumpang berhasil ditambahkan!":"Penumpang GAGAL ditambahkan!");
            }
            else if(menu == 2) //jika pilihan 2 maka turunkan penumpang
            {
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.println(bus.turunkanPenumpang(nama) ? "Penumpang berhasil Turun!":"Penumpang Tidak ditemukan!");
            }
            else if(menu == 3)//jika 3 maka tampilkan penumpang
            {
                System.out.println(bus.toString());
            }
            else if (menu == 4)//jika 4 maka akhiri program
            {
                break;
            }
            else//jika selain 1 sampai 4 maka akan diperintahkan masukkan angka antara 1 sampai 4
            {
                System.out.println("Masukkan angka antara 1 sampai 4 saja");
            }
            System.out.println("============================");
        }
    }
}