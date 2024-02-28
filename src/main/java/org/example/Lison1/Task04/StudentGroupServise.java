package org.example.Lison1.Task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupServise {
    StudentGroup studentGroup;

    public StudentGroupServise(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = studentGroup.studentList;
        Collections.sort(studentList);
        return studentList;
    }

    public void soutList(List<Student> studentList){
        for (Student s : studentList){
            System.out.println(s);
        }
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> result = new ArrayList<>(studentGroup.studentList);
        result.sort(new UserComparator<Student>());
        return result;
    }
}
