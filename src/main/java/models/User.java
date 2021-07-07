package models;

import enums.UserRole;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class User {
    private int id;
    private String name;
    private UserRole role;
}
