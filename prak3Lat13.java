public class prak3Lat13 
{
    public static void main(String[] args) 
    {
        String dayOfWeekArg = "Thursday";
        String typeOfDay = "";
        switch (dayOfWeekArg) 
        {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
            System.out.println("Invalid day of the week: " + dayOfWeekArg);
        }
        System.out.println(typeOfDay);
    }
}
/*coding diatas merupakan program untuk mencoba seleksi dengan menggunakan switch-case untuk 
menampilkan string tipe hari pada case yang memiliki pernyataan bernilai true*/