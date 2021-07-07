package models;

import enums.UserRole;

import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Getter
@Setter
public class Teacher extends User {
    private List<Course> courseTaken = new ArrayList<Course>();
    public Teacher(int id, String name) {
        super(id, name, UserRole.TEACHER);
    }


}
