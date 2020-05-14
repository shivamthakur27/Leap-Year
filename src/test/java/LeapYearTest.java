import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeapYearTest
{
    @Test
    public void test_year_divisible_by_four()
    {
        LeapYear leapYear = new LeapYear(2008);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void test_year_not_divisible_by_four()
    {
        LeapYear leapYear = new LeapYear(1997);
        assertThat(leapYear.isLeapYear(), is(false));
    }

}
