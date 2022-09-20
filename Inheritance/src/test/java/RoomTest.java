import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;

class RoomTest {

    private Room room;  //largest length, smaller width, floor

    @BeforeEach
    void setUp()
    {
        room = new Room(12, 20, 1);
    }


    @Test
    void testToString()
    {
        assertEquals(room.toString(), "20.0 x 12.0, floor 1");
    }

    @Test
    void compareTo()
    {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(20, 12, 2));       //20x12 2f
        rooms.add(room);                                     //20x12 1f
        rooms.add(new Room(30, 12, 1));       //30x12 1f
        rooms.add(new Room(30, 13, 1));       //30x13 1f

        Collections.sort(rooms);

        ArrayList<Room> sortedRooms = new ArrayList<>();
        sortedRooms.add(room);                                     //20x12 1f
        sortedRooms.add(new Room(30, 12, 1));       //30x12 1f
        sortedRooms.add(new Room(30, 13, 1));       //30x13 1f
        sortedRooms.add(new Room(20, 12, 2));       //20x12 2f
        assertEquals(rooms.toString(), sortedRooms.toString());
    }

    @AfterEach
    void tearDown()
    {

    }
}