package models;

import enums.UserRole;
import lombok.*;

@Setter
@Getter

public class Student extends User {
    private String studentClass;
    public Student(int id, String name, String studentClass) {
        super(id, name, UserRole.STUDENT);
        this.studentClass = studentClass;
    }
}
