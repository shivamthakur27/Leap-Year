import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeapYearTest
{
    @Test
    public void test_year_divisible_by_4()                                  //check year divisible by 400 is a Leap Year
    {
        assertThat(leapYear(2008), is(true));
    }

    @Test
    public void test_year_not_divisible_by_4()                              //check year not divisible by 4 is not a Leap Year
    {
        assertThat(leapYear(2019), is(false));
    }

    @Test
    public void test_year_divisible_by_400()                                //check all year divisible by 400 is a Leap Year
    {
        assertThat(leapYear(2000), is(true));
    }

    @Test
    public void test_year_not_divisible_by_400()                            //check year not divisible by 400 is a not Leap Year
    {
        assertThat(leapYear(2009), is(false));
    }

    @Test
    public void test_year_divisible_by_100_not_by_400()                     //check all year divisible by 100 but not by 400 are NOT a Leap Year
    {
        assertThat(leapYear(1700), is(false));
    }

    private boolean leapYear(int year)
    {
        return new LeapYear(year).isLeapYear();
    }
}
