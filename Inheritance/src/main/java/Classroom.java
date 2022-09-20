import java.util.ArrayList;

public class Classroom extends Room
{
    private int numStudents;        //max students room can hold.

    /**
     *
     * @param d1 dimension 1 must be greater than 0.
     * @param d2 dimension 2 must be greater than 0.
     * @param floor number of floors.
     * @param numStudents number of students.
     * @throws IllegalArgumentException
     */
    public Classroom(double d1, double d2, int floor, int numStudents)
    {
        double length;
        double width;

        if (d1 > d2)
        {
            length = d1;
            width = d2;
        }
        else
        {
            length = d2;
            width = d1;
        }
        this.setLength(length);
        this.setWidth(width);
        this.setFloor(floor);
        this.numStudents = numStudents;
    }

    public static Classroom[] getRooms(Room rooms[])
    {
        ArrayList<Classroom> classrooms = new ArrayList<>();
        for (Room r : rooms)
        {
            if (r instanceof Classroom)
            {
                classrooms.add((Classroom) r);
            }
        }
        return classrooms.toArray(new Classroom[0]);
    }

    @Override
    public String toString()
    {
        return super.toString() + " capacity = " + this.numStudents + " students";
    }
}
