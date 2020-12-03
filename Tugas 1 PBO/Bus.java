import java.util.ArrayList;
/**
 * Write a description of class Bus here.
 *
 * @author (Muhammad Aulia Rizki)
 * @version (3-12-2020)
 */
//class ini dibuat untuk mewakili entitas penumpang bus yang mana memiliki attribute berupa objek dari Class Penumpang�
class Bus
{
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    
    public Bus()//method ini adalah method constructor yang berfungsi membuat objek bus
    {
        this.penumpangBiasa = new ArrayList<Penumpang>();
        this.penumpangPrioritas = new ArrayList<Penumpang>();
    }
    
    public ArrayList<Penumpang> getPenumpangBiasa()//Method ini berfungsi mengembalikan data dari penumpang biasa
    {
        return this.penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()//Method ini berfungsi mengembalikan data dari penumpang prioritas
    {
        return this.penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa()//Method ini berfungsi mengembalikan jumlah penumpang biasa
    {
        return this.penumpangBiasa.size();
    }

    public int getJumlahPenumpangPrioritas()//Method ini berfungsi mengembalikan jumlah penumpang prioritas
    {
        return this.penumpangPrioritas.size();
    }

    public boolean naikPenumpang(Penumpang penumpang) //Method ini berfungsi menaikkan penumpang dan mengelompokkannya
    {
        if(penumpang.getHamil()==true ||  penumpang.getUmur()<10 || penumpang.getUmur()>60)
        {
            if(getJumlahPenumpangPrioritas()<2)
            {
                this.penumpangPrioritas.add(penumpang);
                return true;
            }
        }
        else if(penumpangPrioritas.size()== 2 && penumpangBiasa.size()<= 4)
        {
            this.penumpangBiasa.add(penumpang);
            return true;
        }

        if(getJumlahPenumpangBiasa()<4)
        {
            this.penumpangBiasa.add(penumpang);
            return true;
        }

        return false;
    }


    public boolean turunkanPenumpang(String nama)//Method ini berfungsi menurunkan penumpang
    {
        ArrayList<Penumpang> penumpangB = getPenumpangBiasa();
        for(Penumpang penbias : penumpangB)
        {
            String temp = penbias.getNama();
            if(temp.equalsIgnoreCase(nama))
            {
                this.penumpangBiasa.remove(penbias);
                return true;
            }
        }

        ArrayList<Penumpang> penumpangP = getPenumpangPrioritas();
        for(Penumpang penprio : penumpangP)
        {
            String temp = penprio.getNama();
            if(temp.equalsIgnoreCase(nama))
            {
                this.penumpangPrioritas.remove(penprio);
                return true;
            }
        }

        return false;
    }

    public String toString()
    {
        int i=0;
        String temp = "Penumpang Biasa = ";
        ArrayList<Penumpang> penumpangB = getPenumpangBiasa();
        for(Penumpang penbias : penumpangB)
        {
            if(i!=0)
            {
                temp += ", ";
            }
            temp += penbias.getNama();
            i += 1;
        }
        if(i==0)
        {
            temp += "Tidak ada Penumpang biasa";
        }
        temp += "\nPenumpang Prioritas = ";
        i = 0;

        ArrayList<Penumpang> penumpangP = getPenumpangPrioritas();
        for(Penumpang penprio : penumpangP)
        {
            if(i!=0){
                temp += ", ";
            }
            temp += penprio.getNama();
            i += 1;
        }
        if(i==0)
        {
            temp += "Tidak ada Penumpang Prioritas";
        }
        temp += "\nJumlah Penumpang = "+Integer.toString(getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas());
        
        return temp;
    }
}