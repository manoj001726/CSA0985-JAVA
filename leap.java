import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
class leap
{
    public static void main(String[] args)
    {
        // 1. Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println( isLeapYear(cal.get(Calendar.YEAR)) );

        //2. Date
        Date date = new Date();
        System.out.println( isLeapYear(date.getYear()) );

        //3. GregorianCalendar
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println( gc.isLeapYear(gc.get(GregorianCalendar.YEAR)) );
    }

    private static boolean isLeapYear(int year)
    {
        //1583 was the first year of the Gregorian Calendar
        assert year >= 1583; 

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}