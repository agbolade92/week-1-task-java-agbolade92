package models;


import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Getter
@Setter


public class School {
    private String name;
    private List<Student> science = new ArrayList<Student>();
    private List<Student> commercial = new ArrayList<Student>();
    private List<Student> art = new ArrayList<Student>();
    private List<Teacher> teachingStaff = new ArrayList<Teacher>();

    public School(String name, List<Student> science, List<Student> commercial, List<Student> art, List<Teacher> teachingStaff) {
        this.name = name;
        this.science = science;
        this.commercial = commercial;
        this.art = art;
        this.teachingStaff = teachingStaff;
    }
}
