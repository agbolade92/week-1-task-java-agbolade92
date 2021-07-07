package services.serviceImpl;


import enums.UserRole;
import models.*;
import services.PrincipalService;
import Exceptions;

import java.util.ArrayList;
import java.util.List;


public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public void addNewApplicantToClass(Applicant applicant, User user, School school) {
        checkIfUserIsPrincipal(user);
        if(applicant.getExamScore() > 75 && applicant.getAge() > 10){
            Student student = new Student(school.getScience().size(),applicant.getName(), applicant.getClassOfChoice());
            school.getScience().add(student);
        } else if (applicant.getExamScore() > 50 && applicant.getAge() > 10 && !applicant.getClassOfChoice().equals("Art")){
            Student student = new Student(school.getCommercial().size(),applicant.getName(), applicant.getClassOfChoice());
            school.getCommercial().add(student);
        } else {
            List<Student> studentsInTheClass = school.getArt();
            Student student = new Student(studentsInTheClass.size(),applicant.getName(), applicant.getClassOfChoice());
            school.getArt().add(student);
        }

    }

    @Override
    public void assignCourseToTeacher(Teacher teacher,Course course) {
        if(teacher.getCourseTaken().contains(course)){
            throw new NotAllowedException("this is not allowed")
        }else{
            teacher.getCourseTaken().add(course);
        }

    }

    @Override
    public void expelStudentFromSchool(Student student, School school) {
        if(student.getStudentClass().equalsIgnoreCase("science")){
            String nameOfExpelledStudent = student.getName();
            school.getScience().remove(student);
            System.out.println(nameOfExpelledStudent + "has been expelled from the school.");
        }

        if(student.getStudentClass().equalsIgnoreCase("commercial")){
            String nameOfExpelledStudent = student.getName();
            school.getCommercial().remove(student);
            System.out.println(nameOfExpelledStudent + "has been expelled from the school.");
        }

        if(student.getStudentClass().equalsIgnoreCase("art")){
            String nameOfExpelledStudent = student.getName();
            school.getArt().remove(student);
            System.out.println(nameOfExpelledStudent + "has been expelled from the school.");
        }
    }

    @Override
    public void getTotalListOfStudents(School school) {
        List<Student> totalList = new ArrayList<>(school.getScience());
        totalList.addAll(school.getCommercial());
        totalList.addAll(school.getArt());
        System.out.println(totalList);
    }

    @Override
    public void getTotalListOfStaffs(School school) {

    }


    private void checkIfUserIsPrincipal(User user) {
        if(!user.getRole().equals(UserRole.PRINCIPAL)) {
            System.out.println("not allowed");
        }
    }


    private List<Student> addStudentToClass(List<Student> studentList, Student student){
       if(studentList == null){
           studentList = new ArrayList<>();
       }
       studentList.add(student);
       return studentList;
    }

}
