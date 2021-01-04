/**
 * Abstract class MakhlukHidup - write a description of the class here
 * 
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public abstract class MakhlukHidup
{
    
    /**
     * Method kongkrit bernapas
     * 
     */
    public void bernapas()
    {
        System.out.println("Makhluk Hidup Bernapas...");
    }
    
    /**
     * Method kongkrit makan
     * 
     */
    public void makan()
    {
        System.out.println("Makhluk Hidup Makan...");
    }
    
    /**
     * Method abstract berjalan yg wajib di override oleh subkelas
     * 
     */
    public abstract void berjalan();
    
}