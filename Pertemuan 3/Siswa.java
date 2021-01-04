/**
 * Write a description of class Siswa here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class Siswa
{
    private int nrp;
    private String nama;
    

    public Siswa(int nrpx, String namax)// method ini adalah method constructor yang digunakan untuk menciptakan suatu objek
    {
        nrp = nrpx;
        nama = namax;
    }

    public void setNrp(int nrpx)// method ini adalah method Mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        nrp = nrpx;
    }
    
    public int getNrp()// method ini adalah method Accessor yang digunakan untuk mengembalikan nilai dari nrp
    {
        return nrp;
    }
    
    public void setNama(String namax)// method ini adalah method Mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    {
        nama = namax;
    }
    
    public String getNama()//method ini adalah method accessor untuk mengembalikan string nama
    {
        return nama;
    }
}