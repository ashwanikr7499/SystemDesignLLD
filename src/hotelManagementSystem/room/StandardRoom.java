package hotelManagementSystem.room;

import hotelManagementSystem.room.Room;

public class StandardRoom extends Room {
    String roomType="standard";
    @Override
    public void description() {
        System.out.println("This is a Standard Room!!");
    }
}
