package data.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Users {

    private String firstName;

    private String lastName;
    private int age;
    @Id
    private String emailAddress;

    private String address;
    private String phoneNumber;
}
