/**
 * Write a description of class Penumpang here.
 *
 * @author (Muhammad Aulia Rizki)
 * @version (3-12-2020)
 */
//class ini dibuat untuk menyimpan data dari penumpang
class Penumpang
{
    private String nama;
    private int umur;
    private boolean hamil;
    public Penumpang(String nama, int umur, boolean hamil)//method ini adalah method constructor yang berfungsi membuat objek penumpang
    {
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }

    public String getNama()//Method ini berfungsi mengembalikan nama dari penumpang
    {
        return this.nama;
    }

    public int getUmur()//Method ini berfungsi mengembalikan umur dari penumpang
    {
        return this.umur;
    }

    public boolean getHamil()//Method ini berfungsi mengembalikan apakah penumpang hamil
    {
        return this.hamil;
    }
}