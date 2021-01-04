import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class Buku here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
class Buku {
 	int id;
 	String nama, pengarang, publisher;
 	int jumlah;
 
 public Buku(int id, String nama, String pengarang, String publisher, int jumlah) {
 		this.id = id;
 		this.nama = nama;
 		this.pengarang = pengarang;
 		this.publisher = publisher;
 		this.jumlah = jumlah;
 	}
}