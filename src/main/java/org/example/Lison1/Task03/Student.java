package org.example.Lison1.Task03;

public class Student implements Comparable<Student> {
    public Long studentID;
    public String firstName;
    public String secondName;
    public String lastName;

    public Student(long studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
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
