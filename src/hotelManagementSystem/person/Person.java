package hotelManagementSystem.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    String uuid;
    int age;
    String name;
    String phoneNumber;
}
