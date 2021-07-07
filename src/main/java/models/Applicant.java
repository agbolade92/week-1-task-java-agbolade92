package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Applicant {
    private String name;
    private int examScore;
    private int age;
    private String classOfChoice;
}
