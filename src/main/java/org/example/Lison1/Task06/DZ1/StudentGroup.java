package org.example.Lison1.Task06.DZ1;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    public List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
