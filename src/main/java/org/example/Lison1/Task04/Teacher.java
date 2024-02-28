package org.example.Lison1.Task04;

public class Teacher extends User implements Comparable<Teacher>{
    public long teacherID;

    public Teacher(long teacherID, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                " " + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.teacherID > o.teacherID)
            return 1;
        else if (this.teacherID < o.teacherID)
            return -1;
        else return 0;
    }
}
