/**
 * Write a description of class Lingkaran here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class Lingkaran
{
    private double jari_jari;

    public Lingkaran(double jari)/* method constructor ini digunakan
    untuk menciptakan suatu objek */
    {
        this.jari_jari = jari; 
    }

    public void setJariJari(double jari)/* method Mutator yang digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    {
        this.jari_jari = jari;
    }
    
    public double getJariJari()/* method Accessor ini yang digunakan untuk mengembalikan
    nilai dari jari jari*/
    {
        return jari_jari;
    }
}