package hotelManagementSystem.management;

import hotelManagementSystem.person.Person;
import hotelManagementSystem.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Management {
    List<Person> personList=new ArrayList<>();
    List<Room> roomList=new ArrayList<>();
    List<Room> getEmptyRooms(String type)
    {

        if (type.equalsIgnoreCase("Deluxe")) {
            return roomList.stream().filter(room -> room.getRoomType().equalsIgnoreCase("deluxe")).collect(Collectors.toList());
        } else if (type.equalsIgnoreCase("Standard")) {
            return roomList.stream().filter(room -> room.getRoomType().equalsIgnoreCase("standard")).collect(Collectors.toList());
        }
        throw new RuntimeException("Invalid Room Type");
    }
   List<Person> getPersonsInARoom(String roomId)
   {
       return roomList.stream().filter(room -> room.getRoomNumber().equalsIgnoreCase(roomId)).findFirst();
   }

}
