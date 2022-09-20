import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest
{

    @BeforeEach
    void setUp()
    {

    }

    @Test
    void getRooms()
    {
        Room rooms[] =
                {
                        new Room(10,10,1),
                        new Room(10, 10, 2),
                        new Room(10,10,3),
                        new Classroom(10, 10, 4, 20),
                        new Classroom(10, 10, 5, 20)
                };

        Classroom classrooms[] = Classroom.getRooms(rooms);
        String actual = "[10.0 x 10.0, floor 4 capacity = 20 students, 10.0 x 10.0, floor 5 capacity = 20 students]";
        assertEquals(Arrays.toString(classrooms), actual);
    }

    @AfterEach
    void tearDown()
    {

    }
}