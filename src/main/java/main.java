import enums.UserRole;
import models.*;
import services.serviceImpl.PrincipalServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<Student> science = new ArrayList<Student>();
        List<Student> commercial = new ArrayList<Student>();
        List<Student> art = new ArrayList<Student>();
        List<Teacher> teachingStaffs = new ArrayList<Teacher>();
        School school = new School("Bright",science,commercial,art,teachingStaffs);
        Principal principal = new Principal(12,"Joseph");
        Course course = new Course("Arts");
        Teacher teacher = new Teacher(56,"Ade");
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();
        principalService.assignCourseToTeacher( teacher,course);
        Applicant applicant = new Applicant("john",90,12,"science");
        principalService.addNewApplicantToClass(applicant,principal,school);
        System.out.println(teacher.getCourseTaken().get(0));
        System.out.println(school.getScience().get(0));
    }
}