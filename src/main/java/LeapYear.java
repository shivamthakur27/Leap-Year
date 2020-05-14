public class LeapYear
{
    private final int year;
    LeapYear(int year)
    {
        this.year = year;
    }
    public Boolean isLeapYear()
    {
        return (((year % 4 ==0) && !(year % 100 == 0)) || (year % 400 == 0 )) ;
    }
}
