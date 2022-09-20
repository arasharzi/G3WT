public class Holiday
{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean isSameMonth(Holiday h1, Holiday h2)
    {
        if (h1.month.equals(h2.month))
        {
            return true;
        }
        return false;
    }

    public double avgDate(Holiday holiday[])
    {
        int sum = 0;
        for (Holiday h : holiday)
        {
            sum += h.day;
        }

        if (holiday.length == 0)
        {
            return 0;
        }

        return sum / holiday.length;
    }

}