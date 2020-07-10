public class LeapYear 
{
    public static void main(String args[])
    {
        int year = 2020;
        boolean decide = true;
        if(year % 4 == 0)
        {
            decide = true;
        }
        else if (year % 100 == 0)
        {
            decide = true;
        }
        else if(year % 400 == 0)
        {
            decide = true;
        }
        else
        {
            decide = false;
        }
        if(decide)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
