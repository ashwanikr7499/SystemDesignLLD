package hotelManagementSystem.room;

import hotelManagementSystem.person.Person;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Room {
    String roomNumber="";
//    int floor=0;
    int capacity = 0;
    ArrayList<Person> listPersons=null;
    String roomType=null;
    void description()
    {
        System.out.println("Generic room");
    }

}
