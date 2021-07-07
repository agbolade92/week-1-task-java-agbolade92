package services;

import models.*;

import java.util.List;

public interface PrincipalService {
    void addNewApplicantToClass(Applicant applicant, User user, School school);
    void assignCourseToTeacher(Teacher teacher,Course course);
    void expelStudentFromSchool(Student student, School school);
    void getTotalListOfStudents(School school);
    void getTotalListOfStaffs(School school);

}

