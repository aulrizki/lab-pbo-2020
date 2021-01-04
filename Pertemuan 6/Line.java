
/**
 * Write a description of class Line here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public class Line
{
     private Point begin;
     private Point end;
    
    // method ini adalah method constructor untuk menciptakan suatu objek dengan parameter
    public Line(int x1, int y1, int x2, int y2)
    {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    
    // method ini adalah method constructor untuk menciptakan suatu objek dengan parameter
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }
    
    //method ini adalah method Accessor yang digunakan untuk mengembalikan nilai dari begin
    public Point getBegin()
    { 
        return begin;
    }
    
    //method ini adalah method Mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    public void setBegin(Point begin)
    {
        this.begin = begin;
    }
    
    //method ini adalah method Accessor untuk mengembalikan nilai dari end
    public Point getEnd()
    {
        return end;
    }
    
    //method ini adalah method Mutator untuk mengubah suatu nilai dari keadaan suatu objek tetapi memiliki parameter
    public void setEnd(Point end)
    {
        this.end = end;
    }
}