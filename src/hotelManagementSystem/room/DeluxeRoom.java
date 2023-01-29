package hotelManagementSystem.room;

import lombok.Getter;

public class DeluxeRoom extends Room {
    String roomType="deluxe";
    @Override
    public void description() {
        System.out.println("This is a Deluxe Room!!");
    }
}
