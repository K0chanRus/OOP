package org.example.Lison1.Task06.DZ1;

public class Student extends User implements Comparable<Student> {
    public Long studentID;


    public Student(long studentID, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                " " + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentID > o.studentID)
            return 1;
        else if (this.studentID < o.studentID)
            return -1;
        else return 0;
    }
}
