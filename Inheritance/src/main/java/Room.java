public class Room implements Comparable<Room>
{
    private double width;
    private double length;
    private int floor;

    /**
     * Creates a room with default values of 12.5 x 10 with 1 floor.
     */
    public Room()
    {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }

    /**
     *
     * @param d1 dimension 1 must be greater than 0.
     * @param d2 dimension 2 must be greater than 0,
     * @param floor number of floors.
     * @throws IllegalArgumentException
     */
    public Room(double d1, double d2, int floor)
    {
        if (d1 > d2)
        {
            setLength(d1);
            setWidth(d2);
        }
        else
        {
            setLength(d2);
            setWidth(d1);
        }
        this.floor = floor;
    }

    public double getWidth()
    {
        return width;
    }

    /**
     *
     * @param width must be greater than 0.
     * @throws IllegalArgumentException
     */
    public void setWidth(double width) throws IllegalArgumentException
    {
        if (width > 0)
        {
            this.width = width;
        }
        else
        {
            throw new IllegalArgumentException("Invalid value " +  width);
        }
    }

    public double getLength()
    {
        return length;
    }

    /**
     *
     * @param length must be greater than 0.
     * @throws IllegalArgumentException
     */
    public void setLength(double length) throws IllegalArgumentException
    {
        if (length > 0)
        {
            this.length = length;
        }
        else
        {
            throw new IllegalArgumentException("Invalid value " + length);
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
