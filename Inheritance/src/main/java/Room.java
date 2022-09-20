public class Room implements Comparable<Room>
{
    private double width;
    private double length;
    private int floor;

    public Room()
    {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }

    public Room(double d1, double d2, int floor)
    {
        if (d1 > d2)
        {
            this.length = d1;
            this.width = d2;
        }
        else
        {
            this.length = d2;
            this.width = d1;
        }
        this.floor = floor;
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        if (width > 0)
        {
            this.width = width;
        }
    }

    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        if (length > 0)
        {
            this.length = length;
        }
    }

    public int getFloor()
    {
        return floor;
    }
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    @Override
    public String toString()
    {
        return this.length + " x " + this.width + ", floor " + this.floor;
    }

    @Override
    public int compareTo(Room room)
    {
        if (this.floor > room.floor)
        {
            return 1;
        }
        else if (this.floor < room.floor)
        {
            return -1;
        }
        else
        {
            if (this.length > room.length)
            {
                return 1;
            }
            else if (this.length < room.length)
            {
                return -1;
            }
            else
            {
                if (this.width > room.width)
                {
                    return 1;
                }
                else if (this.width < room.width)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
}
